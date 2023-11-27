package Task1;

import java.util.Arrays;
import java.util.Stack;

import java.util.Stack;

public class MyLIFO_App {
    // This method reverses the given array
    public static <E> void reverse(E[] array) {
        Stack<E> stack = new Stack<>();
        for (E element : array) {
            stack.push(element);
        }
        int index = 0;
        while (!stack.isEmpty()) {
            array[index++] = stack.pop();
        }
    }

    // This method checks the correctness of the given input
    // i.e. ()(())[]{(())} ==> true, ){[]}() ==> false
    public static boolean isCorrect(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // This method evaluates the value of an expression
   
    // i.e. 51 + (54 *(3+2)) = 321
    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                StringBuilder operand = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    operand.append(expression.charAt(i));
                    i++;
                }
                i--;
                operandStack.push(Integer.parseInt(operand.toString()));
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    int result = performOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop());
                    operandStack.push(result);
                }
                operatorStack.pop(); // Discard the '(' symbol
            } else if (isOperator(ch)) {
                while (!operatorStack.isEmpty() && priority(operatorStack.peek()) >= priority(ch)) {
                    int result = performOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop());
                    operandStack.push(result);
                }
                operatorStack.push(ch);
            }
        }

        while (!operatorStack.isEmpty()) {
            int result = performOperation(operatorStack.pop(), operandStack.pop(), operandStack.pop());
            operandStack.push(result);
        }

        return operandStack.pop();
    }

    private static int performOperation(char operator, int operand2, int operand1) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
        }
        return 0;
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int priority(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        reverse(array);
        System.out.println(Arrays.toString(array)); // Output: [5, 4, 3, 2, 1]

        String input1 = "()(()[])";
        System.out.println(isCorrect(input1)); // Output: true

        String input2 = ")([)](";
        System.out.println(isCorrect(input2)); // Output: false

        String expression = "51 + (54 * (3 + 2))";
        System.out.println(evaluateExpression(expression)); // Output: 321
    }
}