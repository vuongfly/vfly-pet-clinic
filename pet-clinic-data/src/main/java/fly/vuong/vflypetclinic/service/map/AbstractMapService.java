package fly.vuong.vflypetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }


}
