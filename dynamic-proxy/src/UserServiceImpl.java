public class UserServiceImpl implements UserService {
    private UserDAO userDao;
    private TimeRecorder timeRecorder;

    public UserServiceImpl(UserDAO userDao, TimeRecorder timeRecorder) {
        this.userDao = userDao;
        this.timeRecorder = timeRecorder;
    }

    public User login(String username, String password) {
        long startTime = System.currentTimeMillis();
        User user = userDao.getUserByUsernameAndPassword(username, password);
        long endTime = System.currentTimeMillis();
        timeRecorder.recordTime("login", endTime - startTime);
        return user;
    }

    public boolean deleteUser(int id) {
        long startTime = System.currentTimeMillis();
        boolean success = userDao.deleteUserById(id);
        long endTime = System.currentTimeMillis();
        timeRecorder.recordTime("deleteUser", endTime - startTime);
        return success;
    }

    public User getUser(int id) {
        long startTime = System.currentTimeMillis();
        User user = userDao.getUserById(id);
        long endTime = System.currentTimeMillis();
        timeRecorder.recordTime("getUser", endTime - startTime);
        return user;
    }
}
