import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        multiplication();
    }

   public static int userInput(){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Number To Print Table \t: ");
       return input.nextInt();
    }

    public static void multiplication(){
        int getNumber = userInput();
        for(int i=1;  i<=10; i++){
            int table = getNumber * i;
            System.out.println(getNumber + " X "+ i +" = "+ table);
        }
    }
}
