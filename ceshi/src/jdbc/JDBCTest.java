package jdbc;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
  
public class JDBCTest {  
    /** 
     * ʹ��JDBC���Ӳ�����mysql���ݿ� 
     */  
    public static void main(String[] args) {  
        // ���ݿ������������ַ���  
        String driver = "com.mysql.jdbc.Driver";  
        // ���ݿ����Ӵ�  
        String url = "jdbc:mysql://127.0.0.1:3306/ceshi";  
        // �û���  
        String username = "root";  
        // ����  
        String password = "123456";  
        Connection conn = null;  
        Statement stmt = null;  
        ResultSet rs = null;  
        try {  
            // 1���������ݿ������� �ɹ����غ󣬻ὫDriver���ʵ��ע�ᵽDriverManager���У�  
            Class.forName(driver);  
            // 2����ȡ���ݿ�����  
            conn = DriverManager.getConnection(url, username, password);  
            // 3����ȡ���ݿ��������  
            stmt = conn.createStatement();  
            // 4�����������SQL���  
            String sql = "select * from person_info where id = 1";  
//            String sql1 = "insert into person_info values(4,'ceshi1',20)";
            // 5��ִ�����ݿ����  
            rs = stmt.executeQuery(sql);  
          
            // 6����ȡ�����������  
            while (rs.next()) {  
                System.out.println(rs.getInt("id"));  
                System.out.println(rs.getString("name"));  
                System.out.println(rs.getInt("age"));  
            }  
//        	stmt.execute(sql1);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            // 7���رն��󣬻������ݿ���Դ  
            if (rs != null) { //�رս��������  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (stmt != null) { // �ر����ݿ��������  
                try {  
                    stmt.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
            if (conn != null) { // �ر����ݿ����Ӷ���  
                try {  
                    if (!conn.isClosed()) {  
                        conn.close();  
                    }  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
}  