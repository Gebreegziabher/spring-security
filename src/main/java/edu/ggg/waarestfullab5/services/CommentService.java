package edu.ggg.waarestfullab5.services;

import edu.ggg.waarestfullab5.domain.dto.CommentDto;

import java.util.List;

public interface CommentService {
    public List<CommentDto> findAll();
    CommentDto findById(int id);
    void save(CommentDto p);
    void delete(int id);
    void update(int id, CommentDto p);
}
