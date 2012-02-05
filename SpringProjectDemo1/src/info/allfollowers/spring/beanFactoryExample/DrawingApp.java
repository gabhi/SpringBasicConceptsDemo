package info.allfollowers.spring.beanFactoryExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
	
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		Triangle triangle =  (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
