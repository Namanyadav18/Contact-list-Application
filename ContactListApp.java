import java.util.Scanner;

public class ContactListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();
        int choice;

        do {
            System.out.println("\nContact List Application");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Phone: ");
                        String phone = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        manager.addContact(new Contact(name, phone, email));
                        System.out.println("Contact added.");
                        break;

                    case 2:
                        System.out.print("Enter name: ");
                        Contact c = manager.searchContact(sc.nextLine());
                        if (c != null)
                            System.out.println(c.name + " | " + c.phoneNumber + " | " + c.email);
                        else
                            System.out.println("Contact not found.");
                        break;

                    case 3:
                        manager.displayAllContacts();
                        break;

                    case 4:
                        manager.saveContactsToFile("contacts.txt");
                        System.out.println("Saved successfully.");
                        break;

                    case 5:
                        manager.loadContactsFromFile("contacts.txt");
                        System.out.println("Loaded successfully.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 6);

        sc.close();
    }
}
