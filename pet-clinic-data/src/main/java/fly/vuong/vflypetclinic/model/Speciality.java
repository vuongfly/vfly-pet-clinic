package fly.vuong.vflypetclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
@Data
public class Speciality extends BaseEntity{
    private String description;
}
