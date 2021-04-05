package fly.vuong.vflypetclinic.bootstrap;

import fly.vuong.vflypetclinic.model.Owner;
import fly.vuong.vflypetclinic.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    public DataLoader(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Steven");
        owner1.setLastName("Gerrard");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Leo");
        owner2.setLastName("Messi");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Thiago");
        owner3.setLastName("Alcantara");
        ownerService.save(owner3);

        System.out.println("Owner Loaded...");
        System.out.println(ownerService.findAll().size());
    }
}
