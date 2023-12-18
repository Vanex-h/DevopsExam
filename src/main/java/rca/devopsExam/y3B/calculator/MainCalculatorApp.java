package rca.devopsExam.y3B.calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableCaching



public class MainCalculatorApp {
    public static void main(String[] args) {
        SpringApplication.run(MainCalculatorApp.class, args);
    }

}
