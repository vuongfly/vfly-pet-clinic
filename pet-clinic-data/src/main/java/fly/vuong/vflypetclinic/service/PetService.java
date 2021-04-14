package fly.vuong.vflypetclinic.service;

import fly.vuong.vflypetclinic.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface PetService extends CrudService<Pet, Long> {

}
