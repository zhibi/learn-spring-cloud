package cloud.test.prodiver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Prodiver2Application {

    public static void main(String[] args) {
        SpringApplication.run(Prodiver2Application.class, args);
    }

}
