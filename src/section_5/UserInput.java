package section_5;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name: ");
        String username = scanner.nextLine();
        System.out.println("Your name is " + username );
        System.out.format("Your name has %d number of characters", username.length());

        System.out.println("\nHow old are you " + username );
        int userAge = scanner.nextInt();
//        System.out.println(username + " is " + userAge + " years" + " old");
        System.out.format("\nYou have lived %d years. In another %d years you will be %d years", userAge, userAge, 2*userAge);

        System.out.println("\nYour height?: ");
        double userHeight = scanner.nextDouble();
        System.out.println("You are " + userHeight + "m"+ " tall");

        double averageMaleHeight = userHeight - 1.70;
        double averageFemaleHeight = userHeight - 1.62;
        System.out.println("\nThe between your height and average height is");
        System.out.format("%.2fm if you are male", averageMaleHeight);
        System.out.format("\n%.2fm if you are female", averageFemaleHeight);

        System.out.println("How much do you have: \"\\00A3\"");
        double money = scanner.nextDouble();

    }
}
