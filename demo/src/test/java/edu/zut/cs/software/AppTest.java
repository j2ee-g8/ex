package edu.zut.cs.software;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        ApplicationContext alp = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        DemoMangerImpl dml =(DemoMangerImpl)alp.getBean("dml");
        dml.setName("燕广北");
        System.out.println(dml.sayHello());
        assertTrue( true );
    }
}
