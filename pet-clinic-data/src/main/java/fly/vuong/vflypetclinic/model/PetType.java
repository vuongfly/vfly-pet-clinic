package fly.vuong.vflypetclinic.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
    private String name;
}
