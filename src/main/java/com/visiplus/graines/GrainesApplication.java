package com.visiplus.graines;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.visiplus.graines.business")
@EnableJpaRepositories("com.visiplus.graines.DAO")
public class GrainesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainesApplication.class, args);
    }

}
