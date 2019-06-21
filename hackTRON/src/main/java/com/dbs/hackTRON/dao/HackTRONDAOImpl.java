package com.dbs.hackTRON.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dbs.hackTRON.common.HackTRONQueryProperties;

@PropertySource("classpath:conf\\application.properties")
@Repository
public class HackTRONDAOImpl implements HackTRONDAO {

	@Qualifier("metaDBTemplate")
	@Autowired
	private JdbcTemplate metaDBTemplate;

	@Autowired
	private Environment environment;

	public int getAllUsersCount() {
		int userCount = 0;
		userCount = metaDBTemplate.queryForObject(environment.getProperty(HackTRONQueryProperties.META_GET_USERCOUNT),
				new Object[] {}, Integer.class);

		return userCount;
	}

}
