import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name \t\t:");
        String name = input.nextLine();

        System.out.print(name+ " Enter Your Age \t:");
        int age = input.nextInt();

        System.out.println("Name :" + name );
        System.out.println("Age :" + age );

        input.close();
    }
}
