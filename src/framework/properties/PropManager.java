package framework.properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropManager {
	
 private Properties properties;
 public PropManager(){
	 
	 //properties ��ü ����
	 properties = new Properties();
	 try {
          
		//properties�� �ִ� ��η� �ʱ�ȭ
         properties.load(new FileInputStream("C:\\gaetingdev.properties"));       
         
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
 
 /*
  * 2016-09-12
  * ������
  * Ű���� �´� ������Ƽ�� ������
  */
 public String getProperties(String key) 
 {
	    return properties.getProperty(key);
 }
}