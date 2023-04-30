package com.search.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.search.Dto.Lead;

@Controller
public class SearchLeadController {
	@Autowired
	private LeadRestClient leadresrclient;

	@RequestMapping("/Search") // localhost:9090/Search
	public String GetSearchLeadById() {
		return "search_lead";
	}

	@RequestMapping("/getLeadBy")
	public String getLeadById(@RequestParam("id") long id, Model model) {
		Lead lead = leadresrclient.getLeadById(id);
		model.addAttribute("leads", lead);
		return "lead_result";
	}

}
