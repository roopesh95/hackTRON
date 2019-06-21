package com.dbs.hackTRON.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dbs.hackTRON.common.HackTRONUrls;
import com.dbs.hackTRON.common.ResponseObject;
import com.dbs.hackTRON.service.HackTRONService;

@Controller
@RequestMapping("/")
public class HackTRONController {

	@Autowired
	HackTRONService hackTRONService;


	@RequestMapping(value = HackTRONUrls.GET_ALLUSERS_URL, method = RequestMethod.GET)
	public @ResponseBody ResponseObject getAllUsersCount() {
		ResponseObject response= new ResponseObject();
		try {
			int count=hackTRONService.getAllUsersCount();
			response.setCode(200);
			response.setData(count);
			response.setMessage("Successfull");
			response.setSuccess(true);
		}catch(Exception e) {
			response.setCode(450);
			response.setMessage(e.getMessage());
			response.setSuccess(false);
		}
		return response;
	}
}