package fly.vuong.vflypetclinic.service.jpaIpml;

import fly.vuong.vflypetclinic.model.Owner;
import fly.vuong.vflypetclinic.repository.OwnerRepository;
import fly.vuong.vflypetclinic.repository.PetRepository;
import fly.vuong.vflypetclinic.repository.PetTypeRepository;
import fly.vuong.vflypetclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("jpa")
public class OwnerServiceJpaImpl implements OwnerService {

    private final OwnerRepository ownerRepo;
    private final PetRepository petRepo;
    private final PetTypeRepository petTypeRepo;

    public OwnerServiceJpaImpl(OwnerRepository ownerRepo, PetRepository petRepo,
                               PetTypeRepository petTypeRepo) {
        this.ownerRepo = ownerRepo;
        this.petRepo = petRepo;
        this.petTypeRepo = petTypeRepo;
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();

        ownerRepo.findAll().forEach(owners::add);

//        ownerRepo.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepo.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepo.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepo.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepo.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepo.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepo.findAllByLastNameLike(lastName);
    }
}
