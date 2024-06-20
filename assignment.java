/**
 * Implementation of the assignment for the 
 * `Oracle NetSuite's Summer Camp 2024` application. 
 * 
 * Assignment:
 * "Write a program in Java/JavaScript that prints out the 
 * numbers 0 to 100 (without boundaries). If the number is even, 
 * print "Baz" instead of the number. If it's divisible by 5,  
 * print "inga!". If both conditions are met, write both strings 
 * concatenated."
 * 
 * @author Tereza Vrabcová
 */

public class Assignment {
    /**
     * This method prints out string, as per the assignment, for 
     * numbers <1-99>. The strings are concatenated utilising 
     * ternary operators.
     */
    public void runLoopTernaryOperator() {
        String s;
        for (int i = 1; i < 100; i++) {
            s = (i % 2 == 0) ? "Baz" : "";
            s += (i % 5 == 0) ? "inga!" : "";
            System.out.println((s.length() == 0) ? i : s);
        }
    }
    
    /**
     * This method prints out string, as per the assignment, for
     * numbers <1-99>. The strings are created using the StringBuilder 
     * class.
     */
    public void runLoopStringBuilder() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                str.append("Baz");
            }
            if (i % 5 == 0) {
                str.append("inga!");
            }
            if (str.length() == 0) {
                str.append(i);
            }
            System.out.println(str.toString());
            str.setLength(0);
        }
    }

    /**
    * This method prints out string, as per the assignment, for 
    * numbers <1-99>. This method does not use concatenation, and 
    * thus has to have an extra condition set for `mod 10`.
    */
   public void runLoopWithoutConcatenation() {
    for (int i = 1; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Bazinga!"); 
            } else if (i % 5 == 0) {
                System.out.println("inga!");
            } else if (i % 2 == 0) {
                System.out.println("Baz");
            } else {
                System.out.println(i);
            }
        }
   }

   public static void main(String args[]) {
        Assignment a = new Assignment();
        a.runLoopTernaryOperator();
        //a.runLoopStringBuilder();
        //a.runLoopWithoutConcatenation();
    }
}
