import java.util.*;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter expressions (or 'q' to quit): ");
            String input = in.nextLine();

            if (input.equals("q")) {
                break; 
            }
 
            StringTokenizer expressionTokenizer = new StringTokenizer(input, " ");
            
            while (expressionTokenizer.hasMoreTokens()) {
                String expression = expressionTokenizer.nextToken();

                StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

                try {
                    double leftOperand = Double.parseDouble(tokenizer.nextToken().trim());
                    String operator = tokenizer.nextToken().trim();
                    double rightOperand = Double.parseDouble(tokenizer.nextToken().trim());

                    double result = 0.0;
 
                    switch (operator) {
                        case "+":
                            result = leftOperand + rightOperand;
                            break;
                        case "-":
                            result = leftOperand - rightOperand;
                            break;
                        case "*":
                            result = leftOperand * rightOperand;
                            break;
                        case "/":
                            if (rightOperand != 0) {
                                result = leftOperand / rightOperand;
                            } else {
                                System.out.println("Division by zero is not allowed.");
                                continue;   
                            }
                            break;
                        default:
                            System.out.println("Invalid operator: " + operator);
                            continue;  
                    }

                    System.out.println("Result: " + result);
                } catch (NoSuchElementException nsee) {
                    System.out.println("Invalid expression");
                } catch (NumberFormatException nfe) {
                    System.out.println("One or more operands are not numbers");
                }
            }
        }
    }
}

 
