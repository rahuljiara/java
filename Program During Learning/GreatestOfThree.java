import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("CHECKING GREATEST NUMBER OUT OF THREE");

        System.out.print("Enter Number 1 \t: ");
        int num1 = input.nextInt();

        System.out.print("Enter Number 2 \t: ");
        int num2 = input.nextInt();

        System.out.print("Enter Number 3 \t: ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +" is the greatest number");
        }
        else if(num2 > num3){
            System.out.println(num2 +" is the greatest number");
        }
        else{
            System.out.println(num3 + " is the greatest number");
        }

    }
}
