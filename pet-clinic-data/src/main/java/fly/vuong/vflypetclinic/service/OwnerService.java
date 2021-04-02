package fly.vuong.vflypetclinic.service;

import fly.vuong.vflypetclinic.model.Owner;

//
public interface OwnerService extends CrudService<Owner, Long>{
    public void addOwner(Owner owner);
}
