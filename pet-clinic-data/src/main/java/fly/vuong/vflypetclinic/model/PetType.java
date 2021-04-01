package fly.vuong.vflypetclinic.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class PetType extends BaseEntity{
    private String name;
}
