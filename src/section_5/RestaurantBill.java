package section_5;

import java.util.Scanner;

public class RestaurantBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Enter total amount\n");
         double totalAmount = scanner.nextDouble();

        System.out.println("Enter the number of people\n");
        int totalPeople = scanner.nextInt();

        double amountPerPerson = totalAmount / totalPeople;

        System.out.format("Amount per person is %.2f", amountPerPerson);


    }
}
