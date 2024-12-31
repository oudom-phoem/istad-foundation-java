package section9_oop.encapsulation;

import section9_oop.encapsulation.model.User;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUuid(UUID.randomUUID().toString());
        user.setName("Sokpheng");
        user.setEmail("sokpheng@gmail.com");
        user.setPassword("123456");
        user.setDeleted(false);
        System.out.printf("""
                ID: %d
                UUID: %s
                Name: %s
                Email: %s
                Password: %s
                Deleted: %b
                """, user.getId(), user.getUuid(),user.getName(), user.getEmail(), user.getPassword(), user.getDeleted());
    }
}
