import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("AGE CALCULATOR");
        int age;
        String personType;
        System.out.print("Enter Your Age \t:");
        age = input.nextInt();

        if(age > 60){
            personType = "Senior Citizen";
        }
        else if(age >= 20){
            personType = "an Adult";
        }
        else if(age >= 13){
            personType = "Teen";
        }
        else{
            personType = "Child";
        }

        System.out.println("You are "+ personType);

        input.close();
    }
}
