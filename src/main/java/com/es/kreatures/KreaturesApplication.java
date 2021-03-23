package com.es.kreatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KreaturesApplication {

    public static void main(String[] args) {

        SpringApplication.run(KreaturesApplication.class, args);

        new Gea().run();
    }

}
