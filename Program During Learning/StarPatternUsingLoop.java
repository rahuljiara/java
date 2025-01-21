class StarPatternUsingLoop {
    public static void main(String[] args) {

    // Method Calls
        leftSlopePattern();
    }

    public static void leftSlopePattern(){
        int row =0;
        int totalRow = 5;
        while(row < totalRow){
            System.out.print("*");
            for(int i = 0; i<row; i++){
                System.out.print(" *");
            }
            System.out.println();
            row++;
        }
    }
}
