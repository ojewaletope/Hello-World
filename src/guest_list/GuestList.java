package guest_list;

import java.util.Scanner;

public class GuestList {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        guests[0] = "jon";
        guests[1] = "doe";
        guests[2] = "jane";
        guests[3] = "jil";

        do {

            displayGuests();
            displayMenu();
            int userOption = getOption();

            if (userOption == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Enter guest name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }


            } else if (userOption == 2) {
                System.out.print("Enter guest name to delete: ");
                String guestName = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(guestName)) {
                        guests[i] = null;
                        break;
                    }


                }
                String[] tempArr = new String[guests.length];
                int tempIndex = 0;
                for (int i = 0; i < guests.length; i++) {
                    if(guests[i] != null) {
                        tempArr[tempIndex] = guests[i];
                        tempIndex++;
                    }
                }
                guests = tempArr;
            } else if (userOption == 3) {
                break;
            }

        } while (true);

        System.out.print("Exiting....");
    }

    static void displayGuests() {
        System.out.println("------------------------------\n- Guests List -\n");

        for (int i = 0; i < guests.length; i++) {

            System.out.println((i + 1) + ". " + (guests[i] == null ?  "--" : guests[i]));


        }
    }

    static void displayMenu() {
        System.out.println("------------------------------\n- Options -\n");

        System.out.println("1 - Add Guests");
        System.out.println("2 - Delete Guests");
        System.out.println("3 - Exit");

    }

    static int getOption() {
        System.out.print("Select an Option by entering the appropriate number: ");
        int userOption = scanner.nextInt();
        return userOption;

    }
}
