package info.allfollowers.spring.InnerBeanExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
/**
 * 
 * @author abhijit
 * 
 *  Inner bean example
 *   
 */
public class DrawingApp {
	
	public static void main(String[] args) {
	
 		ApplicationContext appCon = new ClassPathXmlApplicationContext("spring_InnerBeanExample.xml");
		Triangle triangle =  (Triangle) appCon.getBean("triangle");
		triangle.draw();
  	}

}
