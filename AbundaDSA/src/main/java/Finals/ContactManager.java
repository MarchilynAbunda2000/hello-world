
package Finals;

import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}

class ContactManager {
    private static final int MAX_CONTACTS = 100;
    private Contact[] contactsArray;
    private Node head;

    private static class Node {
        Contact contact;
        Node next;

        Node(Contact contact) {
            this.contact = contact;
            this.next = null;
        }
    }

    public ContactManager() {
        contactsArray = new Contact[MAX_CONTACTS];
        head = null;
    }

    public void addContactToArray(Contact contact) {
        for (int i = 0; i < MAX_CONTACTS; i++) {
            if (contactsArray[i] == null) {
                contactsArray[i] = contact;
                break;
            }
        }
    }

    public void addContactToLinkedList(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayContactsArray() {
        System.out.println("Contacts in Array:");
        for (Contact contact : contactsArray) {
            if (contact != null) {
                System.out.println(contact.name + ", " + contact.phoneNumber + ", " + contact.email);
            }
        }
    }

    public void displayContactsLinkedList() {
        System.out.println("Contacts in Linked List:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.contact.name + ", " + temp.contact.phoneNumber + ", " + temp.contact.email);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        // Adding contacts
        Contact contact1 = new Contact("John Doe", "123-456-7890", "john@example.com");
        Contact contact2 = new Contact("Jane Doe", "987-654-3210", "jane@example.com");

        contactManager.addContactToArray(contact1);
        contactManager.addContactToLinkedList(contact1);

        contactManager.addContactToArray(contact2);
        contactManager.addContactToLinkedList(contact2);

        // Displaying contacts
        contactManager.displayContactsArray();
        contactManager.displayContactsLinkedList();

        scanner.close();
    }
}

