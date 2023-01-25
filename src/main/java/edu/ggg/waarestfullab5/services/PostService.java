package edu.ggg.waarestfullab5.services;

import edu.ggg.waarestfullab5.domain.dto.PostDto;

import java.util.List;

public interface PostService {
    public List<PostDto> findAll();
    PostDto findById(int id);
    List<PostDto> findByTitle(String title);
    void save(PostDto p);
    void delete(int id);
    void update(int id, PostDto p);
}
