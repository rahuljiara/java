import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("CHECKING NUMBER IS +ve , -ve Or Zero ");

        System.out.print("Enter The Number TO Check \t: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println(num+ " is +ve Number");
        }
        else if(num < 0){
            System.out.println(num+ " is -ve Number");
        }
        else{
            System.out.println("Zero");
        }
        input.close();
    }
}
