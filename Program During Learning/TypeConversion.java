class TypeConversion {
    public static void main(String[] args) {
        /*
            Implicit (Widening)
                Small size datatype converted into large automatically by compiler
                byte --> short --> int --> long --> float --> double

            Explicit (Narrowing) : -
                Large data type converted into small by programmer, it can't be done by
                compiler because large value cannot be converted into small value so programmer
                has to do it by force;
                byte <-- short <-- int <-- long <-- float <-- double
         */


    // Implicit
        float myFloat = 5; // we entered integer but it will be converted into float
        double myDouble = 5.43f;
        long myLong = 1;


        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myLong);


    // Explicit
        int myInt = (int) 4.5f;
        myFloat = (int) 45.8976;

        System.out.println(myInt);
        System.out.println(myFloat);


    }
}
