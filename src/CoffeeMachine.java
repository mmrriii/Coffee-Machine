import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        final String ESPRESSO = "Espresso";
        final String AMERICANO = "Americano";
        final String CAPPUCCINO = "Cappuccino";
        final String LATTE = "Latte";
        double milk = 1000;
        double beans = 400;
        double sugar = 200;
        double water = 3000;
        String heyMessage = "Hey, please select a drink: " + "\n1 - " + ESPRESSO + "\n2 - " + AMERICANO +
                "\n3 - " + CAPPUCCINO + "\n4 - " + LATTE;
        String errorMessage = "Please, enter a valid number and try again";

        System.out.println(heyMessage);
        Scanner sc = new Scanner(System.in);
        int yourChoice;
        yourChoice = sc.nextInt();
        if (yourChoice == 1) {
            System.out.println("Espresso");
            water -= 20;
            beans -= 4;
        } else if (yourChoice == 2) {
            System.out.println("Americano");
            water -= 50;
            beans -= 4;
        } else if (yourChoice == 3) {
            System.out.println("Cappuccino");
            water -= 90;
            beans -= 4;
            milk -= 40;
        } else if (yourChoice == 4) {
            System.out.println("Latte");
            water -= 100;
            beans -= 5;
            milk -= 50;
        } else {
            System.out.println(errorMessage);
        } String endMessage = "water: " + water + "\nbeans: " + beans + "\nsugar: " + sugar + "\nmilk: " + milk;

        System.out.println(endMessage);


    }


}
