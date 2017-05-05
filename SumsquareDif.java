/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;
/**
 *
 * @author Jacob Chapple 5/5/2017
 */
import static java.lang.Math.pow;
import java.util.ArrayList;

public class SumsquareDif {
    
    public static void main(String[] args) {
        int sumofsquares=0;
        int squareofsum=0;
        for(int i=0;i<101;i++){
            sumofsquares+=pow(i,2);
            squareofsum+=i;
        }
        System.out.println(pow(squareofsum,2));
        System.out.println(pow(squareofsum,2)-sumofsquares);
        
        
    }
    
    
}
