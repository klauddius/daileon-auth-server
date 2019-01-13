package br.com.klauddius.daileon.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DaileonAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaileonAuthServerApplication.class, args);
    }

}

