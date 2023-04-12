import java.sql.*;

public class Main {
		public static void main(String[] args) throws Exception {
//        1. 注册驱动
				Class.forName("com.mysql.cj.jdbc.Driver");

//        2. 获取连接
				String url = "jdbc:mysql://127.0.0.1:3306/yang";
				String username = "root";
				String password = "123456";

				Connection conn = DriverManager.getConnection(url, username, password);

//        3. 定义 sql
				String sql = "SELECT * FROM stu";

//        4. 获取执行sql的对象 Statement
				Statement stmt = conn.createStatement();

//        5. 执行 sql
				ResultSet resultSet = stmt.executeQuery(sql);

//        6. 处理结果
				System.out.println(resultSet);
				while (resultSet.next()) {
						int id = resultSet.getInt("id");
						String name = resultSet.getString("name");
						// 处理查询结果
						System.out.println(id + ": " + name);
				}

//        7. 释放资源
				resultSet.close();
				stmt.close();
				conn.close();
		}
}