package edu.ggg.waarestfullab5.repo;

import edu.ggg.waarestfullab5.domain.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepo extends CrudRepository<Log, Integer> {
}
