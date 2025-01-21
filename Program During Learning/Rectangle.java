import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" RECTANGLE ");
        System.out.print("Enter The Length Of The Rectangle \t: ");
        float length = input.nextFloat();

        System.out.print("Enter The Width Of The Rectangle \t:" );
        float width = input.nextFloat();

        float area = length * width;
        float parameter = 2 * (length + width);

        System.out.println("Area \t\t = "+ area);
        System.out.println("Parameter \t = " + parameter);
        input.close();

    }
}
