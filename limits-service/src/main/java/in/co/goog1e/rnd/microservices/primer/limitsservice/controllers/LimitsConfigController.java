package in.co.goog1e.rnd.microservices.primer.limitsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.goog1e.rnd.microservices.primer.limitsservice.configuration.Configuration;
import in.co.goog1e.rnd.microservices.primer.limitsservice.configuration.LimitConfiguration;

@RestController
public class LimitsConfigController {

	@Autowired
	private Configuration config;

	@GetMapping("limits")
	public LimitConfiguration retriveLimitsFromConfigurations() {
		return new LimitConfiguration(config.getMaximum(),config.getMinimum());
	}


}
