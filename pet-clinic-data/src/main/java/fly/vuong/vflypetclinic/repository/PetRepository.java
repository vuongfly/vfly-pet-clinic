package fly.vuong.vflypetclinic.repository;

import fly.vuong.vflypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
