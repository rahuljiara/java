/*
    We want to add input digit - 2345 like -- 2+3+4+5

    if we find reminder of 2345 by dividing with 10 then we got - 5
    at the same time if we divide the 2345 by 10 then we get 234.5 & .5 ignored and
     234 left because integer ignored the decimal value.

    sum = sum + reminder(digit %10) --> 0+5 --> 0+5+4 --> 0+5+4+3 --> 0+5+4+3+2 = 14;
    digit = 2345 / 10 --> 234 --> 23 --> 2 --> 0;
 */


import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        Display();

    }

    public static int userIntInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int DigitSum(int num){
        int sum = 0;

        while(num > 0){
//            sum = sum+(num%10); -->
            sum += num % 10;
//            num = num / 10;
            num /= 10;
        }
        return sum;
    }

    public static void Display(){
        System.out.print("Enter Digit To Get Sum \t: ");
        int getInput = userIntInput();
        int sum = DigitSum(getInput);
        System.out.println("Sum Of Digit " + getInput +" = " + sum);
        input.close();
    }
}
