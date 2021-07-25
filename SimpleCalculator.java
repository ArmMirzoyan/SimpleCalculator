import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter mathematical expression whit + or -");
        String a = scan.nextLine().replaceAll(" ", "");
        scan.close();

        System.out.println(a);
        String operators[] = a.split("[0-9]");
        String operands[] = a.split("[+-]");
        int result = Integer.parseInt(operands[0]);
        int o = 1;
        for (int i = 0; i < operators.length; i++) {
            if (operators[i].equals("+")) {
                result += Integer.parseInt(operands[o++]);
            } else if (operators[i].equals("-")) {
                result -= Integer.parseInt(operands[o++]);
            }
        }
        System.out.println("Result is " + result);
    }
}