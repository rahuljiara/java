import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Num 1 \t: ");
        int num1 = input.nextInt();

        System.out.print("Enter Num 1 \t: ");
        int num2 = input.nextInt();

        System.out.println("Before Swapped :");
        System.out.println("Num1 = " + num1 + "\nNum2 = " + num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapped :");
        System.out.println("Num1 = " + num1 + "\nNum2 = " + num2);
        input.close();
    }
}
