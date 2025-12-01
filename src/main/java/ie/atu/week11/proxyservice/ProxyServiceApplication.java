package ie.atu.week11.proxyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProxyServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProxyServiceApplication.class, args);
    }
}
