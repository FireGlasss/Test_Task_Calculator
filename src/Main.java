import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        try {
            System.out.println(calc(expression));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static String calc(String input) throws Exception {
        String[] partsExpression = input.split(" ");
        if (partsExpression.length != 3) {
            throw new Exception("Неподходящее выражение");
        }
        byte a;
        byte b;
        boolean isRoman = false;
        try {
            a = Byte.parseByte(partsExpression[0]);
            b = Byte.parseByte(partsExpression[2]);

        } catch (NumberFormatException e) {
            isRoman = true;
            a = WorkWithLine.convectorToArabic(partsExpression[0]);
            b = WorkWithLine.convectorToArabic(partsExpression[2]);
        }
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Неподходящее число");
        }
        String operator = partsExpression[1];
        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> throw new Exception("Неподходящий оператор");
        };
        if (isRoman) {
            return WorkWithLine.convectorToRoman(result);
        } else {
            return String.valueOf(result);
        }
    }
}
