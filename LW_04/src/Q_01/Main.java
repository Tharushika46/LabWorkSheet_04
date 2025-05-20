package Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 01/03 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 02/03 : ");
        int num2 = scan.nextInt();
        System.out.print("Enter number 03/03 : ");
        int num3 = scan.nextInt();
        int min;
        if (num1 < num2){
            min = num1;
            if (num1<num3)
                min = num1;
            else
                min = num3;
        }else if(num2 < num3){
            min = num2;
        }else{
            min = num3;
        }
        System.out.println("The minimum number is: " + min);
    }
}
