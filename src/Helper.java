import java.util.Random;
import java.util.Scanner;

public class Helper {

    public static int numericalInputs(int upperLimit)
    {

        /* This reads the input provided by user
         * using keyboard
         */
        int num = -1;

        while(num < 1 || num >upperLimit)
        {
            try{
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter your option: ");

                // This method reads the number provided using keyboard
                num = scan.nextInt();

                if(num < 1 || num > upperLimit)
                {
                    System.out.println("You are a hero....do not bow done in the face of fear!! Try again...\n");
                }
            }

            catch(Exception e)
            {
                System.out.println("You are a hero....do not bow done in the face of fear!! Try again...\n");
            }
        }

        return num;
    }

    public static int getRandomNumber(int limit)
    {
        int rand;
        Random r = new Random();
        rand = r.nextInt(limit);
        return rand;
    }

}
