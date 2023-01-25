package edu.ggg.waarestfullab5.services.Impl;

import edu.ggg.waarestfullab5.domain.Log;
import edu.ggg.waarestfullab5.repo.LogRepo;
import edu.ggg.waarestfullab5.services.LogService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LogServiceImpl implements LogService {
    private LogRepo repo;
    public LogServiceImpl(LogRepo repo){
        this.repo = repo;
    }
    public List<Log> findAll(){
        List<Log> logs = new ArrayList<>();
        repo.findAll().forEach(logs::add);
        return logs;
    }
    public Log findById(int id){
        return repo.findById(id).get();
    }
    public List<Log> findByPrinciple(String principle){
        List<Log> logs = new ArrayList<>();
        repo.findAll().forEach(logs::add);
        return logs.stream().filter(f -> f.getPrinciple().equals(principle)).collect(Collectors.toList());
    }
    public List<Log> findByDate(LocalDate date){
        List<Log> logs = new ArrayList<>();
        repo.findAll().forEach(logs::add);
        return logs.stream().filter(f -> f.getDate().equals(date)).collect(Collectors.toList());
    }
    public List<Log> findByOperation(String operation){
        List<Log> logs = new ArrayList<>();
        repo.findAll().forEach(logs::add);
        return logs.stream().filter(f -> f.getOperation().equals(operation)).collect(Collectors.toList());
    }

    public void save(Log log){
        repo.save(log);
    }
}
