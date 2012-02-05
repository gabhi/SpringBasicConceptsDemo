package info.allfollowers.spring.ApplicationContextExample;

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
 *   this example also shows how to set property for a bean in conf file and how to get and set 
 *   bean values
 *   
 *   
 *   Setter Injection example
 *   
 */
public class DrawingApp {
	
	public static void main(String[] args) {
	
 		ApplicationContext appCon = new ClassPathXmlApplicationContext("spring_ApplicationContextExample.xml");
		Triangle triangle =  (Triangle) appCon.getBean("triangle");
		System.out.println( triangle.getType());
		triangle.draw();
	}

}
