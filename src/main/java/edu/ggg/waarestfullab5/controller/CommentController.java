package edu.ggg.waarestfullab5.controller;

import edu.ggg.waarestfullab5.domain.dto.CommentDto;
import edu.ggg.waarestfullab5.services.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/api/v1/comments"))
public class CommentController {
    private final CommentService service;
    public CommentController(CommentService service) {
        this.service = service;
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<CommentDto> getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CommentDto getById(@PathVariable("id") int id){
        return service.findById(id);
    }
}
