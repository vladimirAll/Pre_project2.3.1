package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {

    void addUser (User user);

    List<User> getAllUsers();

    void deleteUser(Long id);

    User updateUser(User user);

    User findById(Long id);

}
