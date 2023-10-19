package org.itmentor.student.erykalin.spring_boot.dao;

import org.itmentor.student.erykalin.spring_boot.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDAO {

    List<User> getAll();
    User getById(int id);
    void save(User user);
    void update(User updatedUser);
    void delete(User user);


}
