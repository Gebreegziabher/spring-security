package edu.ggg.waarestfullab5.repo;

import edu.ggg.waarestfullab5.domain.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment,Integer>{
}