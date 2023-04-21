package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        /* una volta che specifico l'id del bean nell xml anche commentando le due righe sotto stanti l'oggetto verrà
        * istanziato nello spring container e sarà singleton. Quindi anche se dovessi creare un dummy2
        * dummy e dummy2 faranno riferimento alla stessa istanza di Dummy (singleton) */
        Dummy dummy = (Dummy) factory.getBean("Dummy");
        dummy.sayhi();

        // come faccio a ricevere una nuova istanza dello stesso oggetto? -> file xml modifica dello scope
        // di default è singleton -> prototype in questo modo però l'oggetto verrà creato solo quando richiesto

    }
}
