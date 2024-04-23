package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    int defaltPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternativeMail;
    private String companySuffix = "anycompany.com";
    // Constructor to register the first and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the department

        this.department = setDepartment();

        // Call a method that returns a random password

        this.password = randomPassword(defaltPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("New Worker:" + firstName + " " + "DEPARTMENT CODES\n 1 for sales\n 2 for Development\n 3 for Accounting\n 0 for none\n Enter department code:");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "dev";
        } else if (departmentChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the emailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEMail(String altEmail) {
        this.alternativeMail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternativeMail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + "." + lastName +
                "\n COMPANY EMAIL: " + email +
                "\n MAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

}