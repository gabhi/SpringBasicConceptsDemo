package info.allfollowers.without_spring.src;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


/**
 * 
 * @author abhijit
 
 * 
 * Basic example code without Spring framework
 */


public class DrawingApp {
	
	public static void main(String[] args) {
	
	//simple Java class	
	Triangle t = new Triangle();
	t.draw();
	}

}
