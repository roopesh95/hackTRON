package com.dbs.hackTRON.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.hackTRON.dao.HackTRONDAO;

@Service
public class HackTRONServiceImpl implements HackTRONService{

	@Autowired
	HackTRONDAO hackTRONDAO;
	
	public int getAllUsersCount() {
		return hackTRONDAO.getAllUsersCount();
	}

}
