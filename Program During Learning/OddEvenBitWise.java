import java.util.Scanner;

class OddEvenBitWise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*
        000 --> 0
        001 --> 1
        010 --> 2   *even -------|
        011 --> 3                |
        100 --> 4   *even -------|-----> All even number ends with 0.
        101 --> 5                |
        110 --> 6   *even -------|
        111 --> 7

        what if we multiply number with 1 -> 00000000000000000001
        011 & 001 --> 001, it is odd number.
        110 & 001 --> 000, it is even number.
        010 & 001 --> 000, it is also an even number.
     */
        System.out.println("CHECKING ODD/EVEN USING BITWISE OPERATORS");

        System.out.print("Enter Value To Check Odd / Even \t: ");
        int num = input.nextInt();

        if (num == 0){
            System.out.println("Given Number Is 'ZERO'");
        }
        else{
            if((num & 1) == 0){
                System.out.println(num+" Is Even Number");
            }
            else{
                System.out.println(num+" Is Odd Number");
            }
        }
        input.close();
    }
}
