package gascalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of shoes did you buy?");
        String shoes = scanner.nextLine();
        System.out.println("How many "+shoes+" did you buy?");
        int quantity = scanner.nextInt();
        System.out.println("How much did the "+shoes+" cost?");
        double shoeCost = scanner.nextDouble();
        double totalPlatterPrice = (quantity * shoeCost);
        scanner.nextLine();
        System.out.println("How many miles did you travel?");
        int miles = scanner.nextInt();
        
        double fee = 0.0;

        if (miles >= 0 && miles <= 5){
            fee = 2;
        }else if (miles >=6 && miles <= 15){
            fee = 5;
        }else if (miles >=16 && miles <= 25){
            fee = 10;
        }else if (miles >= 26 && miles <= 50){
            fee = 15;
        }else if (miles > 50){
            fee = 20;
        }
        double totalCost = (totalPlatterPrice + fee);
        System.out.println("______________________________________________________");
        System.out.println("Product         Qty       Price       Miles      Total\n"+"----            ---        -----      -----      -----\n"+ shoes +"         "+quantity+ "         "+totalPlatterPrice+ "         "+ miles +"        "+ totalCost);
        System.out.println("              Thank you come again!");



    }
}
