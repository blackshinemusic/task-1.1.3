package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Иван", "Фролов", (byte) 20);
        userDao.saveUser("Татьяна", "Иванова", (byte) 20);
        userDao.saveUser("Максим", "Мирный", (byte) 20);
        userDao.saveUser("Елена", "Холодова", (byte) 20);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
