package com.springcore.spEL;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {

	private static ApplicationContext con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		con = new ClassPathXmlApplicationContext("com/springcore/spEL/config.xml");
		
		Demo d = con.getBean("demo", Demo.class);
		System.out.println(d);
		
		//Spring Expression Parser
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("44+55");
		System.out.println(expression.getValue());

	}

}
