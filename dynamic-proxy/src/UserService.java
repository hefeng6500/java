public interface UserService {
    User login(String username, String password);
    boolean deleteUser(int id);
    User getUser(int id);
}
