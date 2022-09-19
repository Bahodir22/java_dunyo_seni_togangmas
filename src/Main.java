import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.print("a = ");
        num1 = input.nextInt();
        System.out.print("b = ");
        num2 = input.nextInt();

        System.out.println(num1+num2);
    }
}