package fly.vuong.vflypetclinic.service;

import fly.vuong.vflypetclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface OwnerService{
    public void addOwner(Owner owner);
}
