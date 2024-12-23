package section7_class_object.gunClass.model;

import java.time.LocalDateTime;

public class Gun {
    public int id;
    public String uuid;
    public String model;
    public LocalDateTime releaseDate;

    void getGunInfo() {
        System.out.println("model.Gun ID: " + id);
        System.out.println("model.Gun UUID: " + uuid);
        System.out.println("Model: " + model);
        System.out.println("Release Date: " + releaseDate);
    }

    @Override
    public String toString() {
        return "model.Gun{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", model='" + model + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
