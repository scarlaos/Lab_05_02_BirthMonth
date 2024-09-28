import java.util.Scanner;
public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int birthMonth = 0;

        System.out.print("Enter a number 1-12 that corresponds to your birth month: ");

        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();
            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("You said your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("You entered an incorrect value for a birth month: " + birthMonth);
            }
        }
        else
        {
            System.out.println("You entered a value that cannot be taken: "+ in.nextLine());
        }

    }
}