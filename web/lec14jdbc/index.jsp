<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page import="java.util.*,java.sql.*,java.io.*"%>
<%
try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://10.11.44.243:3306/ahstu?user=root&password=root&characterEncoding=UTF-8";
			Connection con = DriverManager.getConnection(url);
			
			Statement stmt = con.createStatement();
			String query = "select * from users limit 20;";
			ResultSet rs = stmt.executeQuery(query);


			while (rs.next()) {
				out.print(rs.getString(1)+" ");
				out.print( rs.getString(2)+" ");
				out.print( rs.getString(3)+" ");
				out.println(rs.getString(5)+"<br/>");
			}
			
			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {
			out.println(e.toString());
		}
%>