package com.tech.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.stereotype.Component;
import com.tech.rest.model.Student;

@Component
public class StudentDao {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	/*
	 * method for inserting student details
	 */
	public void insertDetails(Student student) {
		// TODO Auto-generated method stub
		System.out.println("in dao");
		Connection con=null;
		boolean res=false;
		String sql="insert into student_reg values(?,?,?)";
		try{
			/* calling getConnection() method for getting db connection */
			con = getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, student.getFirstName());
			ps.setString(2,student.getLastName());
			ps.setString(3,student.getAddress());
			  res=ps.execute();
			 if(res)
			 {
				 System.out.println("row inserted successfully");
			 }
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * method for getting connection with database
	 * @return connection object
	 */
	private Connection getConnection() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
