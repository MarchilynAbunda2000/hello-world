import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Contact {
    String name;
    String phoneNumber;
    String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + phoneNumber + ", " + email;
    }
}

public class ContactManagerGUI extends JFrame {

    private DefaultListModel<Contact> contactListModel;
    private JList<Contact> contactList;
    private JTextField nameField, phoneField, emailField;
    private JTextArea displayArea;
    private List<Contact> contacts;

    public ContactManagerGUI() {
        super("Contact Manager");

        // Initialize components
        contactListModel = new DefaultListModel<>();
        contactList = new JList<>(contactListModel);

        nameField = new JTextField(20);
        phoneField = new JTextField(20);
        emailField = new JTextField(20);
        displayArea = new JTextArea(10, 40);

        JButton addButton = new JButton("Add Contact");
        JButton displayButton = new JButton("Display Contacts");
        JButton editButton = new JButton("Edit Contact");

        // Initialize contacts list
        contacts = new ArrayList<>();

        // Set layout
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Phone Number:"));
        inputPanel.add(phoneField);
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(emailField);
        inputPanel.add(new JLabel(""));
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(contactList), BorderLayout.CENTER);
        add(new JScrollPane(displayArea), BorderLayout.SOUTH);
        add(displayButton, BorderLayout.SOUTH);
        add(editButton, BorderLayout.SOUTH);

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addContact();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayContacts();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editContact();
            }
        });

        // Set up contact number field to accept only numeric input
        phoneField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (!phoneField.getText().matches("\\d*")) {
                    JOptionPane.showMessageDialog(
                            ContactManagerGUI.this,
                            "Please enter a valid numeric phone number.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                    phoneField.setText("");
                }
            }
        });

        // Set JFrame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addContact() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        if (!name.isEmpty() && !phone.isEmpty() && !email.isEmpty()) {
            Contact contact = new Contact(name, phone, email);
            contacts.add(contact);

            // Sort the contacts list by name
            sortContacts();

            // Update the contactListModel
            updateListModel();

            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayContacts() {
        displayArea.setText("");
        for (Contact contact : contacts) {
            displayArea.append(contact.name + ", " + contact.phoneNumber + ", " + contact.email + "\n");
        }
    }

    private void editContact() {
        int selectedIndex = contactList.getSelectedIndex();
        if (selectedIndex != -1) {
            Contact selectedContact = contactListModel.getElementAt(selectedIndex);

            // Show a dialog to edit contact information
            String newName = JOptionPane.showInputDialog(this, "Enter new name:", selectedContact.name);
            if (newName != null) {
                selectedContact.name = newName;
                sortContacts(); // Re-sort after editing
                updateListModel();
                displayContacts();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a contact to edit.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
        emailField.setText("");
    }

  private void sortContacts() {
    Collections.sort(contacts, Comparator.comparing(contact -> contact.name));
}

    private void updateListModel() {
        contactListModel.clear();
        for (Contact contact : contacts) {
            contactListModel.addElement(contact);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ContactManagerGUI::new);
    }
}
