import java.util.Scanner;

public class PracticeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecursionMethods rm = new RecursionMethods();
        System.out.println("Recursion simulator! We've got a couple methods to choose from");
        System.out.println("Factorial (f)\nSum Recursion (s)\nCountdown (c)\nSpell out a word (w)");
        System.out.println("Double a Number (d)\nDeconstruct a Word(e)");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("f")){
            System.out.println("What number would you like to make a factorial of?");
            int factor = sc.nextInt();
            System.out.println("Factorial of "+factor+":");
            System.out.println(rm.factorial(factor));
        }
        else if (choice.equalsIgnoreCase("s")){
            System.out.println("What number do you want to summate?");
            int summate = sc.nextInt();
            System.out.println("\nSum recursion of "+summate+":");
            System.out.println(rm.sum(summate));
        }
        else if (choice.equalsIgnoreCase("c")){
            System.out.println("What number are we counting down from?");
            int start = sc.nextInt();
            System.out.println("\nCount down from "+start+": t-minus-");
            rm.countdown(start);
        }
        else if (choice.equalsIgnoreCase("w")){
            System.out.println("What word are we spelling out?");
            String word = sc.nextLine();
            System.out.println("\nSpell out a word:");
            rm.spell(word, 0);
        }
        else if (choice.equalsIgnoreCase("d")){
            System.out.println("What number are we doubling?");
            int doubling = sc.nextInt();
            System.out.println("\nDouble "+doubling+":");
            rm.doubleNum(doubling);
        }
        else if (choice.equalsIgnoreCase("e")){
            System.out.println("What word are we breaking down?");
            String phrase = sc.nextLine();
            System.out.println("\nBreak down: "+phrase);
            rm.deconstructWord(phrase, phrase.length());
        }
        else {
            System.out.println("Invalid choice");

        }
    }
}
