package fly.vuong.vflypetclinic.service.jpaIpml;

import fly.vuong.vflypetclinic.model.Speciality;
import fly.vuong.vflypetclinic.repository.SpecialityRepository;
import fly.vuong.vflypetclinic.service.SpecialityService;

import java.util.HashSet;
import java.util.Set;

public class SpecialityServiceJpaImpl implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityServiceJpaImpl(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
