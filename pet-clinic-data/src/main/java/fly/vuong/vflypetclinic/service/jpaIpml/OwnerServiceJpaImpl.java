package fly.vuong.vflypetclinic.service.jpaIpml;

import fly.vuong.vflypetclinic.model.Owner;
import fly.vuong.vflypetclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Profile("jpa")
public class OwnerServiceJpaImpl implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return null;
    }

    @Override
    public Owner findById(Long id) {
        return null;
    }

    @Override
    public Owner save(Owner obj) {
        return null;
    }

    @Override
    public void delete(Owner object) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return null;
    }
}
