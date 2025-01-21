import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float dividend, divisor, quotient, reminder;

        System.out.print("Enter Dividend :");
        dividend = input.nextFloat();

        System.out.print("Enter Divisor : ");
        divisor = input.nextFloat();

        reminder = dividend % divisor;
        quotient = dividend / divisor;

        System.out.println(dividend + " / " + divisor + " = " + quotient);
        System.out.println("Reminder = " + reminder);
        input.close();
    }
}
