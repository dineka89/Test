package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDaoJDBC = new UserDaoHibernateImpl();
    public void createUsersTable() throws SQLException, ClassNotFoundException {
        userDaoJDBC.createUsersTable();
    }

    public void dropUsersTable() throws SQLException, ClassNotFoundException {
        userDaoJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException, ClassNotFoundException {
        userDaoJDBC.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) throws SQLException, ClassNotFoundException {
        userDaoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException, ClassNotFoundException {
        return userDaoJDBC.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException, ClassNotFoundException {
        userDaoJDBC.cleanUsersTable();
    }


}
