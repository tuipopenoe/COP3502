import java.util.ArrayList;
import java.util.Scanner;

public class HW3{

    private Scanner input = new Scanner(System.in);
    private boolean exit = false;

    public void run(){
        char charIn;

        while(!exit){
            System.out.println("Enter 'A' for String reversal.");
            System.out.println("Enter 'B' for subString.");
            System.out.println("Enter 'C' for alphabet listing.");
            System.out.println("Enter 'D' to exit the program.");

            // Get input char
            charIn = input.nextLine().charAt(0);

            // Run method based on input char
            switch(charIn){
                case 'A':
                    this.caseA();
                    break;

                case 'B':
                    this.caseB();
                    break;
                case 'C':
                    this.caseC();
                    break;
                case 'D':
                    this.caseD();
                    break;
                default:
                    System.out.println("Invalid entry, try again.");
            }
        }
    }

    public void caseA(){
        System.out.println("Enter the string to be reversed: ");
        String temp1 = input.nextLine();
        String reversed = this.reverse(temp1);
        System.out.println("The string reversed is: " + reversed);
    }

    public void caseB(){
        System.out.println("Enter the full string: ");
        String temp2 = input.nextLine();

        System.out.println("Enter the start index: ");
        int startInt = input.nextInt();

        System.out.println("Enter the end index: ");
        int endInt = input.nextInt();

        String sub = this.substring(temp2, startInt, endInt);

        System.out.println("The substring is: " + sub);

        // flush input buffer
        input.nextLine();
    }

    public void caseC(){
        System.out.println("Enter the start character: ");
        char startChar = input.nextLine().charAt(0);

        System.out.println("Enter the end character: ");
        char endChar = input.nextLine().charAt(0);

        String alpha = this.alphabet(startChar, endChar);

        System.out.println("The characters between " + startChar +
            " and " + endChar + " are: " + alpha);
    }

    public void caseD(){
        System.out.println("Exiting...");
        this.exit = true;
    }




    // String Manipulation Methods

    // Returns string in reverse order
    public String reverse(String str){
        String result = "";

        for(int i=str.length()-1; i>=0; i--){
            result +=str.charAt(i);
        }

        return result;
    }

    // Return list of ASCII characters bounded by input ints
    public String alphabet(char startChar, char endChar){
        String result = "";
        int startIndex = (int)startChar;
        int endIndex = (int)endChar;

        for(int i = startIndex; i<endIndex; i++){
            result += (char)i;
        }

        return result;
    }

    // Return substring from startIndex to endIndex
    public String substring(String str, int startIndex, int endIndex){
        // return str.substring(startIndex, endIndex);
        String result = "";

        for(int i = startIndex; i < endIndex; i++){
            result += str.charAt(i);
        }

        return result;
    }
}