package fly.vuong.vflypetclinic.service;

import fly.vuong.vflypetclinic.model.Owner;

import java.util.List;

//
public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
