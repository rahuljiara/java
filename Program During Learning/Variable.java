class Variable {
    public static void main(String[] args) {


        /*
            [dataType variableName = literals;]
            integer Literals    -> 1,2,3,4,5,6
            floating Point Literals      -> 1.1,2.4,5.7
            character Literals  -> 'a', 'b', 'T' , .....
            string Literals     -> "This IS A String"
         */

//        declaration + initialization
        int num1 = 125;
        char ch = 'R';

        //        declaration
        float num2;
        //        Initialization
        num2 = 1.5f; // f means assigned number will fit in float otherwise it'll show error

        boolean isProgrammer = true;
        isProgrammer = false;

        String greet = "Hii Rahul This Side.";

        //        Printing Variables value
        System.out.println(ch);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(isProgrammer);
        System.out.println(greet);
    }
}
