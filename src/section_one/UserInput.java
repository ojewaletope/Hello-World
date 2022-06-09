package section_one;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Input: ");
        String input = sc.nextLine();
        System.out.printf("You entered %s", input);
    }
}
