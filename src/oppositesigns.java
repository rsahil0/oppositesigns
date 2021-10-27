import java.util.Scanner;

public class oppositesigns {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        number = input.nextInt();
        input.close();

        if (number>0)
            System.out.println("Positive Number");

        else if (number<0)
                System.out.println("Negative Number");

        else
                System.out.println("Number is Zero");
    }
}
