package test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import framework.database.DBAdapter;


public class kjkdb extends DBAdapter {

	public kjkdb()
	{
		super();
	}
	
	private PreparedStatement psmt;
	/*
	  * 2016-09-25
	  * 김지광
	  * 테스트 데이터베이스 함수
	  */
	 public ResultSet getDog(String sql, String dog_id)
	 {
		
		ResultSet rs = null;
		try {
			
			 psmt = _conn.prepareStatement(sql);
			 psmt.setString(1, dog_id);
			 rs = psmt.executeQuery();
			 
		} catch (Exception e){
			/* 로그 찍는 함수 추가 필요*/
			
		} finally {
			
		}
		return rs;
	 }
	 public ResultSet getName(String sql,String sql2,String ID,String Password,String Age)
	 {
		 ResultSet rs=null;
		 try
		 {
			 psmt=_conn.prepareStatement(sql);  
			 psmt.setString(1, ID);
			 psmt.setString(2, Password);
			 psmt.setString(3, Age);
			 psmt.executeUpdate();			
			 psmt=_conn.prepareStatement(sql2);    
			 rs=psmt.executeQuery();			
		 }catch(Exception e)
		 {
			e.printStackTrace();
			 
		 }finally
		 {
			 
		 }
		 return rs;								
	 }
	 
	 public ResultSet getWriterInfo(String sql,String sql2,String Gender,String Lotation,String Dogtype,String Title,String Age,String Price,String Pluslotate,String Note)
	 {
		 ResultSet rs=null;
		 try
		 {
			 psmt=_conn.prepareStatement(sql);
			 psmt.setString(1, Gender);
			 psmt.setString(2, Lotation);
			 psmt.setString(3, Dogtype);
			 psmt.setString(4, Title);
			 psmt.setString(5, Age);
			 psmt.setString(6, Price);
			 psmt.setString(7, Pluslotate);
			 psmt.setString(8, Note);
			 psmt.executeUpdate();
			 psmt=_conn.prepareStatement(sql2);
			 rs=psmt.executeQuery();
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }finally
		 {
			 
		 }
		 return rs;
	 }
}
