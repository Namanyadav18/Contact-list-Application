import java.io.*;
import java.util.HashMap;

public class ContactManager {
    HashMap<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact c) {
        contacts.put(c.name, c);
    }

    public Contact searchContact(String name) {
        return contacts.get(name);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void saveContactsToFile(String filename) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        for (Contact c : contacts.values()) {
            bw.write(c.toString());
            bw.newLine();
        }
        bw.close();
    }

    public void loadContactsFromFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            Contact c = new Contact(data[0], data[1], data[2]);
            contacts.put(c.name, c);
        }
        br.close();
    }

    public void displayAllContacts() {
        for (Contact c : contacts.values()) {
            System.out.println(c.name + " | " + c.phoneNumber + " | " + c.email);
        }
    }
}
