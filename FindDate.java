/**
 * Created by Multitude on 10/29/2016.
 */
import javax.swing.*;
import java.util.Scanner;
public class FindDate extends JFrame {
    JTextArea textArea;
    public static void main(String[] args){
        System.out.println("----Find the day of the week of a given date----");
        System.out.println("Type in Date in this **/**/** format ");
        Scanner ui = new Scanner(System.in);
        int day = ui.nextInt();
        int month = ui.nextInt();
        int year = ui.nextInt();


        int dayOfTheWeek = (year-1900) * 365 +(year -1900)/4;

        if(year % 4 ==0 && month <=2){

            dayOfTheWeek--;
        }
        switch (month){
            case 12: dayOfTheWeek+=30;
            case 11: dayOfTheWeek+=31;
            case 10: dayOfTheWeek+=30;
            case 9: dayOfTheWeek+=31;
            case 8: dayOfTheWeek+=31;
            case 7: dayOfTheWeek+=30;
            case 6: dayOfTheWeek+=31;
            case 5: dayOfTheWeek+=30;
            case 4: dayOfTheWeek+=31;
            case 3: dayOfTheWeek+=30;
            case 2: dayOfTheWeek+=28;
            case 1: dayOfTheWeek+=31;
        }

        dayOfTheWeek =(day+dayOfTheWeek)%7;
        switch (dayOfTheWeek){

            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wensday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
        }
    }

}
