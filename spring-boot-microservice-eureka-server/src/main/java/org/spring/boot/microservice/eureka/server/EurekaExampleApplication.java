package org.spring.boot.microservice.eureka.server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // This is the only annotation we need for this to become a Server
public class EurekaExampleApplication {
 public static void main(String[] args) {
  SpringApplication.run(EurekaExampleApplication.class, args);
 }
}