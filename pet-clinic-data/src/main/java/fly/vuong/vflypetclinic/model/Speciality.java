package fly.vuong.vflypetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "specialities")

public class Speciality extends BaseEntity{
    private String description;
}
