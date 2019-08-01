package mservice.repository;

import mservice.struct.LogPO;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<LogPO,Integer> {
}
