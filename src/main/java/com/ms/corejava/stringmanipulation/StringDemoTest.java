package com.ms.corejava.stringmanipulation;

// importing packages
import java.util.*;

// StringDemoTest class will start from here
public class StringDemoTest {
    // this string use to show the message
    static String message = """
            Press-1 : count the number of characters,words and lines\n
            Press-2 : Make the Entire sentence in the sentence cases \n
            Press-3 : Reverse the order of the words \n
            Press-4 : Reverse the entire paragraph \n
            Press-0 : Exit \n
            Enter Your Choice : """;

    // ========= main will start from here
    public static void main(String[] args) {
        // intializing the variable
        String line = "", tempString = "";
        // creating scanner object
        Scanner scanner = new Scanner(System.in);
        // showing the message
        System.out.println("----  Hey ! This Paragraph Testing Program  ----");
        System.out.println("------------------------------------------------");
        System.out.println("       Note : Type-'EXIT' only on the Line      ");
        System.out.println("  Then Press Enter to Input into the Paragraph  ");
        System.out.println("------------------------------------------------");
        System.out.println("---------:  Enter Your Paragraph  :-------------");
        // this loop will works for infinity untill for some user enter 'EXIT'
        while (true) {
            tempString = scanner.nextLine();
            // checking if user enter 'EXITt' then break the loop
            if (tempString.equals("EXIT"))
                break;
            // if user not enter 'EXIT' it will add the string
            line = line + "\n" + tempString;
        }
        // showing the entered lines
        System.out.print("-------:  Here This is Your Paragraph  :--------");
        System.out.println(line);
        System.out.println("------------------------------------------------");
        // creating creating StringClass object using argument constructor of string
        StringClass sc = new StringClass(line);
        // using startFuntion with passing StringClass object as argument
        startFunction(sc);
        // finally closing scanner object
        scanner.close();

    }

    // this method accept Stringclass object as argument and perform operation
    public static void startFunction(StringClass sc) {
        // creating scanner object for taking input
        Scanner scannerObject = new Scanner(System.in);
        // showing message using static string variable
        System.out.print(message);
        // finally taking input
        int num = scannerObject.nextInt();
        // now according to input choice doing operating
        switch (num) {
            // for case 0 : breaking and doing nothing
            case 0:
                break;
            // for case 1: counting number of chars,words and lines
            case 1:
                sc.countNumCharLines();
                break;
            // for case 2: making in sentence case
            case 2:
                sc.sentenceCase();
                break;
            // for case 3: reversing order of word
            case 3:
                sc.reverseOrderOfWord();
                break;
            // for case 4: reversing entire program
            case 4:
                sc.reverseEntireParagraph();
                break;
            // for any case : show invalid message
            default:
                System.out.println("Invalid Input !!!");
        }
        // closing scanner object
        scannerObject.close();
        // showing greetings
        System.out.println("\nThanks For Using !!");
    }
    // String Class start from here
}

class StringClass {
    // class member
    private String line;

    // constructor
    StringClass(String line) {
        this.line = line;
    }

    // method to show line
    void show() {
        System.out.println(line);
    }

    // method to count the number of char, word and line
    void countNumCharLines() {
        // initialing
        int countChar = 0;
        // removing space from edges
        line = line.trim();
        // tokening the line
        StringTokenizer st = new StringTokenizer(line, " .,;\n");
        StringTokenizer stLineCount = new StringTokenizer(line, "\n");
        // checking number of tokens
        int countWords = st.countTokens();
        // this will count token's size
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            countChar = countChar + token.length();
        }
        // showing the output
        System.out.println("------------------------------------------------");
        System.out.println("Number of characters : " + countChar);
        System.out.println("Number of words : " + countWords);
        System.out.println("number of lines : " + stLineCount.countTokens());
    }

    // this will make the line in sentence case
    void sentenceCase() {
        // initializing
        String newLine = "";
        // removing space from edges
        line = line.trim();
        // tokening
        StringTokenizer st = new StringTokenizer(line, ".");
        // making in sentence case using these tokens
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (newLine.equals(""))
                newLine = capitalizeFirstLetter(token);
            else
                newLine = newLine + "." + capitalizeFirstLetter(token);
        }
        // showing the output
        System.out.println("------------------------------------------------");
        System.out.println("------ Your Paragraph in sentence case  --------");
        System.out.println("------------------------------------------------");
        System.out.println(newLine + ".");
    }

    // this method will reverse the order of word
    void reverseOrderOfWord() {
        // here we are using stack
        Stack<String> stack = new Stack<>();
        line = line.trim();
        // tokening the line
        StringTokenizer st = new StringTokenizer(line, " .,;\n", true);
        // storing token in stack
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            stack.push(token);
        }
        // here stack will pop reverse will automatically perform
        System.out.println("------------------------------------------------");
        System.out.println("------ Your Paragraph in Reverse Order  --------");
        System.out.println("------------------------------------------------");
        // this will pop untill stack is not empty
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println("");
    }

    // this will reverse enire paragraph
    void reverseEntireParagraph() {
        // stringbuffer
        StringBuffer sb = new StringBuffer(line);
        System.out.println("------------------------------------------------");
        System.out.println("--------  Your Entire Reverse paragraph --------");
        System.out.println("------------------------------------------------");
        // string buffer reverse method
        System.out.print(sb.reverse());
    }

    // this is just helper method that will capitalized first letter
    private String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty())
            return str;
        else if ((str.substring(0, 1).equals("\n")) || (str.substring(0, 1).equals(" ")))
            return str.substring(0, 1) + str.substring(1, 2).toUpperCase() + str.substring(2);
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
