package com.search.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.search.Dto.Lead;

@Component
public class LeadRestClient {

	public Lead getLeadById(long id) {
		RestTemplate resttemplet = new RestTemplate();
		Lead lead = resttemplet.getForObject("http://localhost:8080/api/lead/leads/" + id, Lead.class);
		return lead;

	}

}
