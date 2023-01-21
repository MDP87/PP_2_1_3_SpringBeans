package app.config;

import app.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean (name = "cat")
    public Cat getCat() {
        return new Cat();
    }
    @Bean (name = "dog")
    public Dog getDog() {
        return new Dog();
    }
    @Bean (name = "animalsCage")
    public AnimalsCage getAnimalsCage() {
        return new AnimalsCage();
    }

    @Bean (name = "timer")
    public Timer getTimer() {
        return new Timer();
    }



}
