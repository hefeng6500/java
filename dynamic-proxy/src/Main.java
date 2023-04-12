public class Main {
    public static void main(String[] args) {

        UserDAO userDao = new UserDAOImpl();
        TimeRecorder timeRecorder = new TimeRecorder();
        UserService userService = new UserServiceImpl(userDao, timeRecorder);

        // 测试登录功能
        User user = userService.login("admin", "admin");
        System.out.println(user);

        // 测试删除功能
        boolean success = userService.deleteUser(1);
        System.out.println(success);

        // 测试查询功能
        User user2 = userService.getUser(2);
        System.out.println(user2);

        // 输出各个方法的耗时
        timeRecorder.printTimes();
    }
}