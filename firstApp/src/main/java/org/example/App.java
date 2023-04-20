package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Dummy dummy = (Dummy) beanFactory.getBean("Dummy");
        dummy.sayhi();

    }
}
