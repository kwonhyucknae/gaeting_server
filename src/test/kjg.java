package test;

import java.sql.ResultSet;
import framework.BaseForm;

public class kjg extends BaseForm {

	private kjkdb db = new kjkdb();
	public kjg()
	{
	}
	
	 /*
	  * 2016-09-20
	  * ������
	  * �׽�Ʈ �Լ�
	  */
	 public String getDog(String dog_id)
	 {
		 db.conOpen();
		 
		 boolean isArray = true;
		 String returnVal = "";
		 String sql = "SELECT * FROM gaeting_dev.Customer_dog where dog_id = ? "; 
		try {
			
			 ResultSet rs = db.getDog(sql, dog_id);
			 returnVal = ResultsetToJson(rs, isArray);
			 
		} catch (Exception e){
			
			returnVal = errorToJsonobject(e.getMessage(), isArray);
			
		} finally {
			db.conClose();
		}
		return returnVal;
	 }
	 public String getName(String ID,String Password,String Age)
	 {
		 
		 db.conOpen();
		 boolean isArray=true;
		 String returnval="";
		 String sql="Insert into gaeting_dev.Customer_Info(ID,Password,Age,gender,Phone_Number)values(?,?,?,null,null)";
		 String sql2="SELECT * FROM gaeting_dev.Customer_Info";
		
		 try
		 {
			 ResultSet rs=db.getName(sql,sql2,ID,Password,Age);  
			 returnval=ResultsetToJson(rs,isArray);
			 
		 }catch(Exception e)
		 {
			 returnval=errorToJsonobject(e.getMessage(),isArray);
		 }finally
		 {
			 db.conClose();
		 }
		 
		 return returnval;
		 
	 }
	 
	 public String getWriterInfo(String Gender,String Lotation,String Dogtype,String Title,String Age,String Price,String Pluslotate,String Note)
	 {
		 db.conOpen();
		 boolean isArray=true;
		 String returnval="";
		
	 }
}
