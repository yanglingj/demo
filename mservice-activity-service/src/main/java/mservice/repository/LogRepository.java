package mservice.repository;

import mservice.struct.ActivityPO;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<ActivityPO,Integer> {
}
