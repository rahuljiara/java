import java.util.Scanner;
class SumOfNumbers {
    public static void main(String[] args) {
        allSum();
        oddSum();
        evenSum();

     
    }

//    Takes User Input
    public static int userIntInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    //   Sum all the numbers up to user input
    public static void allSum(){
        System.out.print("Enter the number up to which you want to sum \t: ");
        int getInput = userIntInput();
        int sum = 0;
        for(int i = 1; i<=getInput; i++){
                sum += i;
        }
        System.out.println("Sum Of All Value Form 1 To "+ getInput+ " = "+ sum);
    }

    //   Sum odd numbers up to user input
    public static void oddSum(){
        System.out.print("Enter the number up to which you want to sum all odd numbers \t: ");
        int getInput = userIntInput();
        int sum = 0;
        for(int i = 1; i<=getInput; i++){
            if(i%2 !=0){
                sum += i;
            }
        }
        System.out.println("Sum Of Odd Value Form 1 To "+ getInput+ " = "+ sum);
    }

    //   Sum even numbers up to user input
    public static void evenSum(){
        System.out.print("Enter the number up to which you want to sum all even numbers \t: ");
        int getInput = userIntInput();
        int sum = 0;
        for(int i = 1; i<=getInput; i++){
            if(i%2 ==0){
                sum += i;
            }
        }
        System.out.println("Sum Of Even Value Form 1 To "+ getInput+ " = "+ sum);
    }



}
