import java.util.Objects;
import java.util.Scanner;

public class Multiplechoice {
    public static void main(String[] args) {

        System.out.println("How many months in a years?");
        System.out.println("1. Ten");
        System.out.println("2. Twelve");
        System.out.println("3. Eleven");
        String CorrectAns = "twelve";

       boolean tryagain = true;
       while (tryagain) {
           Scanner scanner = new Scanner(System.in);
           String input = scanner.next();
           if (CorrectAns.equals(input.toLowerCase())) {
               System.out.println("Congratulation ! your Answer is correct");
               tryagain = false;
           } else {
               System.out.println("Sorry ! Answer is incorrect. Please Try Again.");
           }
       }
    }
}
