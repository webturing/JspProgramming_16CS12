import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * jdbc MYSQL的标准连接和遍历，
 * 1. mysql connector.jar环境配置
 * 2. jdbc的基本步骤
 * 3. java.sql.*中的常用类
 * @author Administrator
 *
 */
public class JDBC {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://10.11.44.243:3306/ahstu?user=root&password=root&characterEncoding=UTF-8";
			Connection con = DriverManager.getConnection(url);
			
			Statement stmt = con.createStatement();
			String query = "select * from users";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.println("\t" + rs.getString(4));
			}
			
			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
