package com.lambdaschool.logger.services;

import com.lambdaschool.logger.LoggerApplication;
import com.lambdaschool.logger.model.MessageDetail;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener
{
	@RabbitListener(queues = LoggerApplication.QUEUE_GDP)
	public void receiveHighMessage(MessageDetail msg)
	{
		System.out.println("Received High Queue message {" + msg.toString() + "}");
	}

	@RabbitListener(queues = LoggerApplication.QUEUE_GDP)
	public void receiveLowMessage(MessageDetail msg)
	{
		System.out.println("Received Low Queue message {" + msg.toString() + "}");
	}

	@RabbitListener(queues = LoggerApplication.QUEUE_GDP)
	public void receiveErrorMessage(MessageDetail msg)
	{
		System.out.println("Received Error Queue message {" + msg.toString() + "}");
	}
}
