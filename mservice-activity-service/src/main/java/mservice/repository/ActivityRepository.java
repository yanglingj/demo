package mservice.repository;

import mservice.struct.ActivityPO;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<ActivityPO,Integer> {
}
