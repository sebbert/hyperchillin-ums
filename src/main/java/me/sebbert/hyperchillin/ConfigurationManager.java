package me.sebbert.hyperchillin;

public class ConfigurationManager {
	private static ConfigurationManager _instance = null;
	Configuration _config;
	
	private ConfigurationManager() {
		_config = new Configuration();
	}
	
	public ConfigurationManager getInstance() {
		if(_instance == null) {
			_instance = new ConfigurationManager();
		}
		
		return _instance;
	}
	
	public Configuration getConfiguration() {
		return _config;
	}
	
	public void setConfiguration(Configuration config) {
		_config = config;
	}
}
