import java.util.Random;
import java.util.Scanner;
public class Task1
{
    private static final int MIN_RANGE=1;
    private static final int MAX_RANGE=100;
    private static final int MAX_ATTEMPT=15;
    private static final int MAX_ROUND=3;
    public static void main(String args[])
    {
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        int totalscore=0;
        int number;
        System.out.println("NUMBER GUSSING GAME" );
        System.out.println("Total number of round:3");
        System.out.println("Total number of attempts in each round: 15 \n");
        for(int i=1;i<=MAX_ROUND;i++)
        {
        number=ran.nextInt(MAX_RANGE)+MIN_RANGE;
        int attempt=0;
        System.out.printf("\nRound %d:Guess the number between %d and %d  in %d attempts \n",i,MIN_RANGE,MAX_RANGE,MAX_ATTEMPT);
        while(attempt < MAX_ATTEMPT)
        {
            System.out.println("enter your guess:");
            int guess_number=sc.nextInt();
            attempt=attempt+1;
            if(guess_number == number)
            {
                int score=MAX_ATTEMPT-attempt;
                totalscore=totalscore+score;
                System.out.printf("Hurray ! number gussed succesfully ,Attempts = %d,Round score =%d \n",attempt,score);
                break;
            }
            else if(guess_number < number)
            {
                System.out.printf("the number is greater than %d,attempts left=%d \n",guess_number,MAX_ATTEMPT-attempt);
            }
            else if(guess_number > number)
            {
                System.out.printf("the number is less than %d,attempts left=%d \n",guess_number,MAX_ATTEMPT-attempt);
            }


        }
            if (attempt == MAX_ATTEMPT)
            {
            System.out.printf("\nRound =%d\n",i);
            System.out.printf("Attempts =0");
            System.out.printf("the random number is:%d\n",number);
            }
        }
        System.out.printf("Game over,totalscore=%d \n",totalscore);
        sc.close();
    }
}