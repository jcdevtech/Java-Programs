import java.util.Scanner;
/**
 * Created by Multitude on 10/22/2016.
 * if the number is even : the next number = number / 2
   if the number is odd : the next number = (number * 3) + 1
   Hailstone Sequence
 *
 */
public class HailstoneSequence {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hailstone Sequence! Choose a number to start off with");
        int insertedint = input.nextInt();
        System.out.println("How long would you like the sequence to be?(Amount of numbers)");
        int sequence = input.nextInt();
        //For loop
        for (int i = 0; i<=sequence; i++){
            if (insertedint % 2 == 0) {
                int evenvalue = (insertedint / 2);
                insertedint=evenvalue;

            } else if (insertedint % 2 != 0) {
                int oddvalue = (insertedint * 3) + 1;
                insertedint = oddvalue;

            }
            //Print ten numbers on one line
            if(i%10==0){
                System.out.print("\n"+insertedint+" ");
            }
            else{
                System.out.print(insertedint+" ");
            }
        }
        System.out.println("\nThere are "+sequence+" numbers in the sequence.");
    }
}
