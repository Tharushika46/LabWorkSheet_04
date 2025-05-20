package Q_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> Entree = new ArrayList<String>(Arrays.asList("Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"));
        ArrayList<Double> EntreePrice = new ArrayList<Double>(Arrays.asList(3.49, 4.59, 5.99, 2.99));
        ArrayList<String> SideDish = new ArrayList<String>(Arrays.asList("Rice Cracker", "No-Salt Fries", "Zucchini", " Brown Rice"));
        ArrayList<Double> SideDishPrice  = new ArrayList<Double>(Arrays.asList(0.79, 0.69, 1.09, 0.59));
        ArrayList<String> Drink = new ArrayList<String>(Arrays.asList("Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"));
        ArrayList<Double> DrinkPrice  = new ArrayList<Double>(Arrays.asList(1.99, 1.90, 2.49, 0.99));
        ArrayList<Integer> Orderid = new ArrayList<>();

        System.out.println("Welcome to the restaurant!");

        while(true){
            System.out.println("  ");
            for(int i=0; i<Entree.size(); i++){
                System.out.println((i+1) + ". " + Entree.get(i) + " - $" + EntreePrice.get(i));
            }
            System.out.print("Enter Your Entree Number: ");
            int order = scan.nextInt();
            Double Price = 0.0;
            for (int i = 0; i < Entree.size(); i++) {
                if (order < 1 || order > Entree.size()) {
                    System.out.println("Invalid Order Number. Please try again.");
                    continue;
                }
                if (order == i + 1) {
                    System.out.println("You have selected: " + Entree.get(i) + " - $" + EntreePrice.get(i));
                    Price += EntreePrice.get(i);
                    Orderid.add(i);
                    break;
                }
            }

//Side Dish
            System.out.println("  ");
            System.out.println("Select a Side Dish:");
            for (int i = 0; i < SideDish.size(); i++) {
                System.out.println((i + 1) + ". " + SideDish.get(i) + " - $" + SideDishPrice.get(i));
                }
            System.out.print("Enter Your Side Dish Number: ");
            order = scan.nextInt();
            for (int i = 0; i < SideDish.size(); i++) {
                if (order < 1 || order > SideDish.size()) {
                    System.out.println("Invalid Order Number. Please try again.");
                    continue;
                }
                if (order == i + 1) {
                    System.out.println("You have selected: " + SideDish.get(i) + " - $" + SideDishPrice.get(i));
                    Price += SideDishPrice.get(i);
                    Orderid.add(i);
                    break;
                }
            }
//Drink
            System.out.println("  ");
            System.out.println("Select a Drink:");
            for (int i = 0; i < Drink.size(); i++) {
                System.out.println((i + 1) + ". " + Drink.get(i) + " - $" + DrinkPrice.get(i));
            }
            System.out.print("Enter Your Drink Number: ");
            order = scan.nextInt();
            for (int i = 0; i < Drink.size(); i++) {
                if (order < 1 || order > Drink.size()) {
                    System.out.println("Invalid Order Number. Please try again.");
                    continue;
                }
                if (order == i + 1) {
                    System.out.println("You have selected: " + Drink.get(i) + " - $" + DrinkPrice.get(i));
                    Price += DrinkPrice.get(i);
                    Orderid.add(i);
                    break;
                }
            }
            System.out.println("======================");
            System.out.println("You have selected: ");
            System.out.println(Entree.get(Orderid.get(0)) + " - $" + EntreePrice.get(Orderid.get(0)));
            System.out.println(SideDish.get(Orderid.get(1)) + " - $" + SideDishPrice.get(Orderid.get(1)));
            System.out.println(Drink.get(Orderid.get(2)) + " - $" + DrinkPrice.get(Orderid.get(2)));
            System.out.println("======================");
            System.out.println("Total Price : $" + Price);
            System.out.println("======================");
            Orderid.clear();

        }
    }
}
