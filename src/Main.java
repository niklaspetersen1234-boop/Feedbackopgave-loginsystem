//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

void main() {
    String[] usernames = {"Alice", "Bob", "Charlie"};
    String[] passwords = {"pass1", "pass2", "pass3"};

    Scanner input = new Scanner(System.in);
    System.out.print("Indtast brugernavn: ");
    String username = input.nextLine();

    int usernamePos = checkUserNamePos(username, usernames);
    if (usernamePos == -1) {
        System.out.println("Brugernavnet ikke fundet.");
    } else {

        int attempts = 3;
        for (int j = 0; j < 3; j++) {
            attempts = attempts - 1;
            System.out.print("Indtast adgangskode: ");
            String password = input.nextLine();
            boolean correctLogin = checkPassword(password, passwords, usernamePos);

            if (correctLogin) {
                System.out.println("Velkommen " + username + ". Login tidspunkt: " + LocalTime.now());
                j = 3;
            } else if (j >= 2) {
                System.out.println("Du har brugt alle forsøg. Kontoen er nu låst");
            } else {
                System.out.println("Forkert adgangskode du har " + attempts + " forsøg tilbage.");
            }
        }
    }
}

static int checkUserNamePos(String username, String[] usernames) {
    for (int i = 0; i < usernames.length; i++) {
        if (username.equals(usernames[i])) {
            return i;
        }
    }
    return -1;
}

static boolean checkPassword(String password, String[] passwords, int userNamePos) {
    if (passwords[userNamePos].equals(password)) {
        return true;
    }
    return false;
}