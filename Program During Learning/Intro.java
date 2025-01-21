package Intro;
import java.util.Scanner;

class Intro {
    /**
     * This Is Java Docs.
     * This is also a comment which can be seen as a documentation
     * When we hover on the methods. (Hover on main method to see this)
     * @param args
     */
    public static void main(String[] args) {
         /*
            Comments are the text which is used to instruct or understand other person or
            yourself , it is ignored by compiler while compiling.
            There are three types of comments:
                1. single line
                2. Multi line
                3. Java Docs
         */
        // This is single line comment.
        /*
            This
            Is
            Multi-line
            Comment
         */

        // Console Output
        System.out.println("Console Output");

        /* Data Types
           Name             

         */

        // User Input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = input.next();
        System.out.println(name);

        input.close();


    }
}
