package org.test.demo.Service;

import org.test.demo.Controller.UserController;
import org.test.demo.Dao.UserDao;
import com.paul.ioc.annotation.Autowired;
import com.paul.ioc.annotation.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired("userDao")
    private UserDao userDao;

    @Autowired
    private UserController userController;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    @Override
    public String getUser(int id) {
        return userDao.get(id);
    }
}
