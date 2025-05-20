package Q_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Power of 10 (ex: 6/9/12/15/18/21/30/100) : ");
        int power = scan.nextInt();
        String result = "";
        if (power == 6) {
            result = "Million";
        } else if (power == 9) {
            result = "Billion";
        } else if (power == 12) {
            result = "Trillion";
        } else if (power == 15) {
            result = "Quadrillion";
        } else if (power == 18) {
            result = "Quintillion";
        } else if (power == 21) {
            result = "Sextillion";
        } else if (power == 30) {
            result = "Nonillion";
        } else if (power == 100) {
            result = "Googol";
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("10^" + power + " = " + result);
    }
}


