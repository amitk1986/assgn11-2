package com.diablo.assgn112;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diablo.assgn112.HelloworldApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        HelloworldApp he = (HelloworldApp)ac.getBean("hello");
        he.getMessage();
    }
}
