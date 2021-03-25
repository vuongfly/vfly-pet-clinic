package fly.vuong.vflypetclinic.service;

import fly.vuong.vflypetclinic.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface VetService extends JpaRepository<Vet, Long> {
}
