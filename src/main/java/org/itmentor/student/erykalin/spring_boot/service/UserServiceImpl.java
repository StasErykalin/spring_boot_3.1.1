package org.itmentor.student.erykalin.spring_boot.service;

import org.itmentor.student.erykalin.spring_boot.dao.UserDAO;
import org.itmentor.student.erykalin.spring_boot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{
   private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDAO.getById(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        userDAO.update(updatedUser);
    }

    @Override
    @Transactional
    public void delete(int id) {
        User user = userDAO.getById(id);
        userDAO.delete(user);
    }
}
