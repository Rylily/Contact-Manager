import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactManager {
    public ArrayList<Contacts> Contactlist;
    public Scanner myScanner;

    public ContactManager() {
        Contactlist = new ArrayList<>();
    }

    public void View() {
        for (Contacts contacts : Contactlist) {
            System.out.println("----------------------");
            System.out.println(contacts);
        }
    }

    public void AddContact() {
        System.out.println("Enter name: ");
        String name = myScanner.nextLine();
        System.out.println("Enter phone number");
        int phonenumber = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Enter Country Code(eg 65)");
        int countrycode = myScanner.nextInt();
        myScanner.nextLine();
        Contactlist.add(new Contacts(name, phonenumber, countrycode));
        System.out.println("Contact has been added");

    }

    public void DeleteContact() {
        Iterator<Contacts> iterator= Contactlist.iterator();
        System.out.println("Enter name: ");
        String name = myScanner.nextLine();
        while (iterator.hasNext()) {
            Contacts obj = iterator.next();
            if (obj.name().equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }
    }

    public void run() {
        myScanner = new Scanner(System.in);
        while (true) {
            int inputnumber = 0;
            while (inputnumber != 1 && inputnumber != 2 && inputnumber != 3) {
                System.out.println("-------------MAIN MENU-------------");
                System.out.println("1. View Contacts");
                System.out.println("2. Add Contact");
                System.out.println("3. Remove Contact");
                System.out.println("Input: ");
                inputnumber = myScanner.nextInt();
                myScanner.nextLine();
            }

            switch(inputnumber) {
                case 1:
                    View();
                    break;
                case 2:
                    AddContact();
                    break;
                case 3:
                    DeleteContact();
                    break;

            }
        }

    }

    public static void main(String[] args) {
        ContactManager newcm = new ContactManager();
        newcm.run();
    }
}