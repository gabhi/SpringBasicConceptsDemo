package info.allfollowers.spring.beanFactoryExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
/**
 * 
 * @author abhijit
 * 
 *   XmlBeanFactory  example
 *   
 *   this uses the spring_xmlBeanFactory.xml
 */
public class DrawingApp {
	
	public static void main(String[] args) {
	
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring_xmlBeanFactory.xml"));
		
		Triangle triangle =  (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
