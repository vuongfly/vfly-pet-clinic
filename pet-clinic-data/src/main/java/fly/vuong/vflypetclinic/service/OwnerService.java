package fly.vuong.vflypetclinic.service;

import fly.vuong.vflypetclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService extends JpaRepository<Owner, Long> {

}
