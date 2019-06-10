package com.lambdaschool.gdp;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.amqp.core.Queue;

@EnableWebMvc
@SpringBootApplication
public class GdpApplication
{
	public static GdpList ourGdpList;
	public static final String EXCHANGE_NAME = "GDPServer";
	public static final String QUEUE_GDP = "GDPPriorityQueue";

	public static void main(String[] args)
	{
		ourGdpList = new GdpList();
		ApplicationContext ctx = SpringApplication.run(GdpApplication.class, args);

		DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");

		dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}

	    @Bean
	    public TopicExchange appExchange()
	    {
	        return new TopicExchange(EXCHANGE_NAME);
	    }

	    @Bean
	    public Queue appQueueHigh()
	    {
	        return new Queue(QUEUE_GDP);
	    }

	    @Bean
	    public Binding declareBindingHigh()
	    {
	        return BindingBuilder.bind(appQueueHigh()).to(appExchange()).with(QUEUE_GDP);
	    }

	    @Bean
	    public Jackson2JsonMessageConverter producerJackson2MessageConverter()
	    {
	        return new Jackson2JsonMessageConverter();
	    }
}
