package org.itmentor.student.erykalin.spring_boot.service;

import org.itmentor.student.erykalin.spring_boot.model.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {
    List<User> getAll();
    User getById(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
