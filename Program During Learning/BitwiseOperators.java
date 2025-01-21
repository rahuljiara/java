import java.util.Scanner;

class BitwiseOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
    AND         - & => (y = a*b)
    OR          - | => (y = a+b)
    Not         - ~ => (y = a')
    XOR         - ^ => (y = a'b + ab')
    LEFT SHIFT  - <<
    RIGHT SHIFT - >>

    When we input the number then it convert into binary number then perform given
    operation then convert into decimal value for output.
    eg :-
        000 --> 0
        001 --> 1               ==> 1+3 =    001    (This is OR Operation)
        010 --> 2                           +011
        011 --> 3                          --------
        100 --> 4                            011    = 3
        101 --> 5
        110 --> 6
        111 --> 7

 */
        System.out.println("BINARY OPERATIONS");

//        And Bitwise Operations:
        int num1, num2, andBit, orBit, xorBit, notBit, leftShift, rightShift;

        System.out.print("Enter Num1 \t: ");
        num1 = input.nextInt();

        System.out.print("Enter Num2 \t: ");
        num2 = input.nextInt();

        andBit = num1 & num2;
        orBit = num1 | num2;
        xorBit = num1 ^ num2;
        notBit = ~num1;
        leftShift = num1<<num2;
        rightShift = num1 >> num2;

        System.out.println("AND Bitwise :- \n("+num1+" & "+num2+") = \t: "+andBit+"\n");
        System.out.println("OR Bitwise :- \n("+num1+" | "+num2+") = \t: "+orBit+"\n");
        System.out.println("NOT Bitwise :- \n(~"+num1+") = \t: "+notBit+"\n");
        System.out.println("XOR Bitwise :- \n("+num1+" ^ "+num2+") = \t: "+xorBit+"\n");
        System.out.println("LEFT SHIFT :- \n("+num1+" << "+num2+") = \t: "+leftShift+"\n");
        System.out.println("RIGHT SHIFT :- \n("+num1+" >> "+num2+") = \t: "+rightShift+"\n");

        input.close();
    }
}
