package fly.vuong.vflypetclinic.model;

import lombok.Data;

@Data
public class Person extends BaseEntity {
    private String lastName;
    private String firstName;
}
