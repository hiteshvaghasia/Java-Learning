import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 to 10");

        Scanner input = new Scanner(System.in);
        int InputtedNumber = input.nextInt();

        if (InputtedNumber < 5) {
            System.out.println("Enjoy the Good Luck a friends bring you !");
        } else {
            System.out.println(" Your Shoe selection make you very happy !");
        }
    }
}
