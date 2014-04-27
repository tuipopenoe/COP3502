public class UserOperations{
    private boolean integerCalculations;
    private int total;

    public UserOperations(){
        this.integerCalculations = false;
        this.total = 0;
    }

    public boolean getIntegerCalculations(){
        return this.integerCalculations;
    }

    public void setIntegerCalculations(boolean calculations){
        this.integerCalculations = calculations;
    }

    public int getTotal(){
        return this.total;
    }

    public void setTotal(int total){
        this.total = total;
    }

    public void printDescription(){
        System.out.println("printDescription(): prints a description of each" +
            "of the operational methods defined here.");
        System.out.println("divide(int leftOperand, int rightOperand): will" +
            "divide the leftOperand by the rightOperand and return the " +
            "result");
        System.out.println("divide(double leftOperand, double rightOperand):" +
            "will divide the leftOperand by the rightOperand and return the" +
            "result.");
        System.out.println("changeToLowerCase(char upperCaseLetter): will" +
            "use the numeric distance (32 characters) between the upper and" +
            "lower case letters, returning the lower case letters.");
        System.out.println("changeToUpperCase(char lowerCaseLetter): will" +
            "use the numeric distance (32 characters) between the lower and" +
            " upper case letters, returning the upper case letters.");
        System.out.println("printLogicalORTruthTable(): will print the truth" +
            " table of the logical OR.");
    }

    public int divide(int leftOperand, int rightOperand){
        return (leftOperand/rightOperand);
    }

    public double divide(double leftOperand, double rightOperand){
        return (leftOperand/rightOperand);
    }

    public char changeToLowerCase(char upperCaseLetter){
        return (char)(upperCaseLetter + 32);
    }

    public char changeToUpperCase(char lowerCaseLetter){
        return (char)(lowerCaseLetter - 32);
    }

    public void printLogicalORTruthTable(){
        System.out.println("  | T | F |");
        System.out.println("T | T | T |");
        System.out.println("F | T | F |");
    }
}