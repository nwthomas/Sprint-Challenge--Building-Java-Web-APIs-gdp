package com.lambdaschool.gdp.Controller;

import com.lambdaschool.gdp.GdpApplication;
import com.lambdaschool.gdp.Model.GDP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/gdp")
public class GdpController
{
	private static final Logger logger = LoggerFactory.getLogger(GdpController.class);

	@Autowired
	RabbitTemplate rt;

	@GetMapping(value = "/countries", produces = {"application/json"})
	public ResponseEntity<?> getAllCountriesByName()
	{
		ArrayList<GDP> tempList = GdpApplication.ourGdpList.gdpList;
		tempList.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
		logger.info("/api/gdp/countries accessed at " + new Date());
		return new ResponseEntity<>(tempList, HttpStatus.OK);
	}
}
