import java.util.Scanner;

class Grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalMarks = 500;
        System.out.println("STUDENT GRADE FINDER");
        System.out.println("Total Possible Marks Considered (100) For Each Subject: \n");

        System.out.print("ENTER MARKS OF English \t: ");
        int engMarks = input.nextInt();
        System.out.print("ENTER MARKS OF Maths \t: ");
        int mathMarks = input.nextInt();
        System.out.print("ENTER MARKS OF Physics \t: ");
        int phyMarks = input.nextInt();
        System.out.print("ENTER MARKS OF Chemistry \t: ");
        int cheMarks = input.nextInt();
        System.out.print("ENTER MARKS OF Biology \t: ");
        int bioMarks = input.nextInt();

        int totalGotMarks = engMarks + mathMarks + phyMarks + cheMarks + bioMarks;
        float totalPercent = (float)(totalGotMarks* 100) / totalMarks;

       if((engMarks < 40) || (mathMarks < 40) || (phyMarks <40)|| (cheMarks <40)|| (bioMarks <40))  {
           System.out.println("You are Fail.");
           System.out.println("You Got " + totalPercent + "% \t Grade : \"F\"");
       }
       else{
           if(totalPercent > 90){
               System.out.println("You Got " + totalPercent + "% \t Grade : \"Outstanding\"");
           }
           else if(totalPercent > 80){
               System.out.println("You Got " + totalPercent + "% \t Grade : \"A+\"");
           }
           else if(totalPercent > 70){
               System.out.println("You Got " + totalPercent + "% \t Grade : \"A\"");
           }
           else if(totalPercent > 55){
               System.out.println("You Got " + totalPercent + "% \t Grade : \"B+\"");
           }
           else if(totalPercent > 50){
               System.out.println("You Got " + totalPercent + "% \t Grade : \"B\"");
           }
           else if(totalPercent > 45){
               System.out.println("You Got " + totalPercent + "% \t Grade : \"C\"");
           }
           else if(totalPercent > 40){
               System.out.println("You Got " + totalPercent + "% \t Grade : \"Pass\"");
           }
           else{
               System.out.println("You Got " + totalPercent + "% \t Grade : \"Fail\"");
           }
       }
       input.close();
    }
}
