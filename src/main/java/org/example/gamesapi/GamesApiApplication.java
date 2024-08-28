package org.example.gamesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GamesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamesApiApplication.class, args);
    }

}
