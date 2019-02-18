package com.bridgelabz.jdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.jdbc.model.LoginUser;
import com.bridgelabz.jdbc.model.RegisterUser;

public class RegisterRepository implements RegisterRepositoryInterface {
	static String url = "jdbc:mysql://127.0.0.1:3306/JDBC";
	static String uid = "root";
	static String password = "nisha@123";
	Connection con;
	PreparedStatement stmt_ins;
	PreparedStatement stmt_sel;
	@Override
	/*
	 * To open connection through Driver manager(non-Javadoc)
	 * 
	 * @see com.labz.jdbc.repository.RegisterRopositoryInterface#openConnection()
	 */
	public void openConnection() throws SQLException {
		con = DriverManager.getConnection(url, uid, password);
	}

	/*
	 * Releasing the connection established (non-Javadoc)
	 * 
	 * @see com.labz.jdbc.repository.RegisterRopositoryInterface#closeConnection()
	 */
	@Override
	public void closeConnection() throws SQLException {
		con.close();
	}

	/*
	 * To insert user inputs into data base (non-Javadoc)
	 * 
	 * @see
	 * com.labz.jdbc.repository.RegisterRopositoryInterface#save(com.labz.jdbc.model
	 * .RegisterUser)
	 */
	@Override
	public void save(RegisterUser user) throws SQLException {
		openConnection();
		String sql = "insert into regUser_table(reg_name,reg_email,reg_password) values (?,?,?);";
		stmt_ins = con.prepareStatement(sql);
		stmt_ins.setString(1, "" + user.getUserName());
		stmt_ins.setString(2, "" + user.getUserEmail());
		stmt_ins.setString(3, "" + user.getPassword());
		stmt_ins.execute();
		stmt_ins.close();
		closeConnection();

	}
	/*
	 * To perform login Action
	 */
	public List loginCheck(LoginUser loginUser) throws SQLException {
		openConnection();
	///	Boolean check;
		String sql = "select * from regUser_table";
		stmt_sel = con.prepareStatement(sql);
		stmt_sel.execute();
		ResultSet rs = stmt_sel.getResultSet();
		List listUser=new ArrayList();
		String email;
		String password;
		String name;
		int id;
		outer: while (rs.next()) {
			email = rs.getString("reg_email");
			password = rs.getString("reg_password");
			name=rs.getString("reg_name");
			id=rs.getInt("reg_id");
			if (email.equals(loginUser.getUserEmail()) && password.equals(loginUser.getPassword())) {
				System.out.println("");
				
				 listUser.add(id); listUser.add(name); listUser.add(email);
				 
				System.out.println("User Details:");
				System.out.println("**********************************************");
				System.out.println("user id : "+id);
				System.out.println("user name : "+name);
				System.out.println("User email: "+email);
				System.out.println("**********************************************");

				break outer;
			}
		}
		int n = rs.getRow();
		if (n != 0) {
			System.out.println("Login Sucessful..........");
			
		} else {
			System.out.println("Login failed!!!!!!!!!!");
		}
		stmt_sel.close();
		
		closeConnection();
		return listUser;
	}

}
