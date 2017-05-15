package framework.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import framework.properties.PropManager;

public class DBAdapter {

	protected PropManager _propM;
	protected Connection _conn;
	
	/*
	  * 2016-09-12
	  * ������
	  * DBAdapter
	  * DB������ �����ϰ� ������ ��ȯ���� ���� �Լ���� �����ͺ��̽� ����� ���� �������� ���� ����Ѵ�.
	  */
	public DBAdapter()
	{
		
		_propM = new PropManager();
		
		try {
			
			Class.forName(_propM.getProperties("db_className"));
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void conOpen()
	{
		  try 
		  {
			  _conn = DriverManager.getConnection(_propM.getProperties("db_url"), 
												  _propM.getProperties("db_id"), 
												  _propM.getProperties("db_pw"));
		  } 
		  catch (SQLException e) 
		  {
		   e.printStackTrace();
		  }  
	 }
	 
	 public void conClose()
	 {
		  try 
		  {
			   _conn.close();
		  } 
		  catch (SQLException e) 
		  {
		   e.printStackTrace();
		  }
	 }
	 
	 public ResultSet execDatabaseResultSet(String sql)
	 {
		 ResultSet rs = null;
		 try {
			rs = _conn.prepareStatement(sql).executeQuery();  
		 } 
		 catch (SQLException e) {
				e.printStackTrace();
		 }
		 return rs;
	 }
	 
	
}
