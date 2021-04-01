package fly.vuong.vflypetclinic.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Person extends BaseEntity {
    private String lastName;
    private String firstName;
}
