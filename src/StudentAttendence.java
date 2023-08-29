import java.util.Scanner;

public class StudentAttendence {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        //char studentFirstInitial = 'K';
        //char studentLastInitial = 'H';
        boolean hasperfectattendence = true;
        //String studentname = "Hitesh Vaghasia";
        String studentFirstName = "Hitesh";
        String studentLastName = "Vaghasia";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);


        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasperfectattendence);
        System.out.println(studentFirstName + " " + studentLastName + " has GPA of " + studentGPA );
        System.out.println("What GPA do you want to update? ");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + "now has GPA of " + studentGPA );
    }
}
