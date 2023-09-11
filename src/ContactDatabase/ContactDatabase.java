package ContactDatabase;

import java.util.Scanner;
public class ContactDatabase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] contacts = new String[100]; // Initialize an array to store contacts
        int contactCount = 0; // Initialize the count of contacts

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add contacts");
            System.out.println("2. Show contacts");
            System.out.println("3. Search in contacts");
            System.out.println("4. Edit contact");
            System.out.println("5. Delete contact");
            System.out.println("6. Delete All");
            System.out.println("7. Add sample contacts");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int number = in.nextInt();
            in.nextLine();
            switch (number) {
                case 1:
                    System.out.println("Enter a contact to add it: ");
                    String contact = in.nextLine();
                    if (!contact.isEmpty()) {
                        contacts[contactCount++] = contact;
                    } else {
                        System.out.println("Contact not added. Please enter a valid contact.");
                    }
                    break;

                case 2:
                    System.out.println("Contacts: ");
                    for (int i = 0; i < contactCount; i++) {
                        System.out.println((i + 1) + ". " + contacts[i]);
                    }
                    break;

                case 3:
                    System.out.println("Enter search phrase: ");
                    String searchPhrase = in.nextLine();
                    System.out.println("Search Results:");
                    for (int i = 0; i < contactCount; i++) {
                        if (contacts[i].contains(searchPhrase)) {
                            System.out.println((i + 1) + ". " + contacts[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter the number of the contact to edit it: ");
                    int contactNumber = in.nextInt();
                    in.nextLine();
                    if (contactNumber >= 1 && contactNumber <= contactCount) {
                        System.out.print("Enter new value for this contact: ");
                        String newValue = in.nextLine();
                        contacts[contactNumber - 1] = newValue;
                    } else {
                        System.out.println("Invalid contact number.");
                    }
                    break;

                case 5:
                    System.out.println("Enter the number of the contact to delete it: ");
                    int deleteNumber = in.nextInt();
                    in.nextLine();
                    if (deleteNumber >= 1 && deleteNumber <= contactCount) {
                        contacts[deleteNumber - 1] = "Deleted";
                    } else {
                        System.out.println("Invalid contact number.");
                    }
                    break;

                case 6:
                    System.out.println("Deleting all contacts.");
                    for (int i = 0; i < contactCount; i++) {
                        contacts[i] = null;
                    }
                    contactCount = 0;
                    break;

                case 7:
                    System.out.println("Adding sample contacts.");
                    contacts[contactCount++] = "Andriy Boyko";
                    contacts[contactCount++] = "Denys Ostapenko";
                    contacts[contactCount++] = "Ivan Shwetz";
                    break;

                case 8:
                    System.out.println("Exiting the program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        }
    }
}
