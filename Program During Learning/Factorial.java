import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        getFactorial();
    }

    /*
        Factorial:
        0 = 1
        1 = 1
        2 = 1 x 2
        3 = 1 x 2 x 3
        n = 1 x 2 x 3 x ...................... x n
     */

    // taking user input
    public static int userIntInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void getFactorial(){
        System.out.print("Enter the value to get factorial \t: ");
        int getInput = userIntInput();
        long fact = 1;

        if(getInput <2){
            System.out.println("Factorial of "+ getInput + " = 1");
        }
        for(int i = 2; i<=getInput;i++ ){
            fact *= i;
        }
        System.out.println("Factorial of "+ getInput+ " = " + fact);
        input.close();
    }
}
