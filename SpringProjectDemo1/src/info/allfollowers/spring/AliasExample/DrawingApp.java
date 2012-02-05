package info.allfollowers.spring.AliasExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
/**
 * 
 * @author abhijit
 * 
 *   XmlBeanFactory  example
 *   
 *   this uses the conf file for ApplicationContextExample
 *   
 *  Alias example
 *   
 */
public class DrawingApp {
	
	public static void main(String[] args) {
	
 		ApplicationContext appCon = new ClassPathXmlApplicationContext("spring_AliasBeanExample.xml");
		Triangle triangle =  (Triangle) appCon.getBean("triangle=alias");
		triangle.draw();
  	}

}
