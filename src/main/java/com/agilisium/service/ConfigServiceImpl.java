package com.agilisium.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.agilisium.model.Config;

@Service
public class ConfigServiceImpl implements ConfigService {

	private static Set<Config> configs = new HashSet<>();

	static {
		Config config1 = new Config();
		config1.setName("config1");
		config1.setValue("Value of Config 1");
		configs.add(config1);

		Config config2 = new Config();
		config2.setName("config2");
		config2.setValue("Value of Config 2");
		configs.add(config2);

		Config config3 = new Config();
		config3.setName("config3");
		config3.setValue("Value of Config 3");
		configs.add(config3);
	}

	@Override
	public Collection<Config> getConfig() {
		// TODO Auto-generated method stub
		return configs;
	}

}