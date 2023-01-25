package edu.ggg.waarestfullab5.services;

import edu.ggg.waarestfullab5.domain.Log;
import edu.ggg.waarestfullab5.domain.dto.CommentDto;

import java.time.LocalDate;
import java.util.List;

public interface LogService {
    List<Log> findAll();
    Log findById(int id);
    List<Log> findByPrinciple(String principle);
    List<Log> findByDate(LocalDate date);
    List<Log> findByOperation(String operation);
    void save(Log p);
}
