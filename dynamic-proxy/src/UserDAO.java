public interface UserDAO {
    User getUserByUsernameAndPassword(String username, String password);
    boolean deleteUserById(int id);
    User getUserById(int id);

    User getUserByUsernameAndPassword();
}
