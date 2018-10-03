/*
 * Anton dela Cruz
 * WaterComuterManufacturing.java
 * This program calculates the amount of water required to manufacture a computer and monitor
 */

package watercomputermanufacturing;
import java.util.Scanner;
/**
 *
 * @author andel7651
 */
public class WaterComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        double combos,wateramount;
        double watercombo = 1.5;
        
        
        System.out.println("A combo consists of a computer and a monitor");
        System.out.println("");
        System.out.println("How many combos do you have?");
        combos = keyedInput.nextInt();

        wateramount = combos * watercombo;
        System.out.println("The amount of water required is " + wateramount + "tons");
    }
    
}
