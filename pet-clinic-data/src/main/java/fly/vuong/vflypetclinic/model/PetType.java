package fly.vuong.vflypetclinic.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
    private String name;
}
