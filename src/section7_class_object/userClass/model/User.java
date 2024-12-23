package section7_class_object.userClass.model;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class User {
    public Long id = new Random().nextLong(1000000);
    public String uuid = UUID.randomUUID().toString();
    public String username;
    public String email;
    public String password;
    public Boolean isDeleted = false;
    public Boolean isVerified = false;
    public LocalDateTime creationDate;

    public void inputUserInfo(Scanner scanner) {
        System.out.print("[+] Enter username: ");
        username = scanner.nextLine();
        System.out.print("[+] Enter email: ");
        email = scanner.nextLine();
        System.out.print("[+] Enter password: ");
        password = scanner.nextLine();
        creationDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isDeleted=" + isDeleted +
                ", isVerified=" + isVerified +
                ", creationDate=" + creationDate +
                '}';
    }
}
