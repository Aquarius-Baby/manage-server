package cmy.manage.managestart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cmy.manage")
@MapperScan("cmy.manage.managedal")
public class ManageStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageStartApplication.class, args);
    }


}
