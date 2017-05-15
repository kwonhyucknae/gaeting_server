package framework.properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropManager {
	
 private Properties properties;
 public PropManager(){
	 
	 //properties 객체 생성
	 properties = new Properties();
	 try {
          
		//properties가 있는 경로로 초기화
         properties.load(new FileInputStream("C:\\gaetingdev.properties"));       
         
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
 
 /*
  * 2016-09-12
  * 김지광
  * 키값에 맞는 프로퍼티를 가져옴
  */
 public String getProperties(String key) 
 {
	    return properties.getProperty(key);
 }
}