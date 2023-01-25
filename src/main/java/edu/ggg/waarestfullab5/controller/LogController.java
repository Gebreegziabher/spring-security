package edu.ggg.waarestfullab5.controller;

import edu.ggg.waarestfullab5.aspect.annotation.Logger;
import edu.ggg.waarestfullab5.domain.Log;
import edu.ggg.waarestfullab5.services.Impl.LogServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(("/api/v1/logs"))
public class LogController {
    private LogServiceImpl service;
    public LogController(LogServiceImpl service){
        this.service = service;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    @Logger
    public List<Log> getAll(){
        return service.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    @Logger
    public Log getById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/filter")
    @Logger
    public List<Log> getByFilter(
            @RequestParam(value = "principle", required = false) String principle,
            @RequestParam(value = "operation", required = false) String operation)
    {
        return principle != null ?
                service.findByPrinciple(principle)
                :
                operation != null ?
                        service.findByOperation(operation)
                        :
                        new ArrayList<>();
    }
}
