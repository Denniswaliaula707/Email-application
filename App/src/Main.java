import EmailApp.Email;

public class Main {
    public static void main(String[] args) {

        Email email = new Email("Dennis", "Waliaula");

        System.out.println(email.showInfo());
    }
}