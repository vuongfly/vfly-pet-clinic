package fly.vuong.vflypetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"fly.vuong"})
//@EnableJpaRepositories(basePackages={"fly.vuong.vflypetclinic.repository"})
//@EntityScan(basePackages={"fly.vuong.vflypetclinic.model"})
public class VflyPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(VflyPetClinicApplication.class, args);
    }

}
