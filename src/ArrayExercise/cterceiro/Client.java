package ArrayExercise.cterceiro;

import java.util.Scanner;

public class Client {
    private String name;
    private String email;


    public Client(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(String next) {
    }
}
