package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class RunningLocationUpdaterApplication {

    public static void main(String[] args){

        SpringApplication.run(RunningLocationUpdaterApplication.class, args);
    }
}
