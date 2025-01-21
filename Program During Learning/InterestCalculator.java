import java.util.Scanner;

class InterestCalculator {
 public static void main (String[] args){
     Scanner input = new Scanner(System.in);

     System.out.println("INTEREST CALCULATOR");

     System.out.print("Enter Principle Amount (Rs) \t:");
     int principle = input.nextInt();

     System.out.print("Enter Your Interest Rate (%) \t:");
     float rate = input.nextFloat();

     System.out.print("Enter How many years you borrowed \t: ");
     int year = input.nextInt();

     float simpleInterest = (principle * rate * year) / 100;
     double compoundInterest = principle * Math.pow((1+rate/100),year) - principle;
     double totalPayment = principle + compoundInterest;


     System.out.println("Simple Interest Of "+ principle+ "Rs For "+ year + " Year is \t: " + simpleInterest);
     System.out.println("Compound Interest Of "+ principle+ "Rs For "+ year + " Year is \t: " + compoundInterest);
     System.out.println("Total Payment To Be Done \t: "+ totalPayment);
     input.close();
 }
}
