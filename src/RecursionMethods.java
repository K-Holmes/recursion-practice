public class RecursionMethods {

    //takes in a number and solves for its factorial, written in math like:  x!
    int factorial( int n ) {
        if (n != 0) {
            if (n!=1){
                System.out.print(n + "x");
            } else {
                System.out.print(n);
            }
            return n * factorial(n - 1); // recursive call
        }
        else {
            System.out.println("=");
            return 1;
        }
    }

    //takes a number and stores it into a sum before subtracting 1 and adding to the sum
    //similar to the factorial except with adding
    public int sum(int i) {
        if (i > 0) {
            if (i!=1){
                System.out.print(i+"+");
            } else {
                System.out.print(i+"=");
            }
            return i + sum(i - 1); // recursive call
        } else {
            return 0;
        }
    }

    //counts down from a number until it reaches 0
    public void countdown(int i) {
        if (i < 0) {
            return;
        }
        System.out.println(i);
        i = i - 1;
        countdown(i); // recursive call
    }

    //spells out a given word letter by letter
    public void spell(String s, int i){
        if (i<s.length()){
            System.out.println(s.charAt(i));
            spell(s, i+1); // recursive call
        }
        else {
            return;
        }
    }
}

