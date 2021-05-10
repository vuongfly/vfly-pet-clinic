package fly.vuong.vflypetclinic.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;
}
