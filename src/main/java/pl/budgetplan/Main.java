package pl.budgetplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Main main = new Main();
        String name = "world";
        main.helloWorld(name);
    }

    public String helloWorld(String name){
        return "Hello " + name;
    }
}

