package fly.vuong.vflypetclinic.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {
    private Long id;

}
