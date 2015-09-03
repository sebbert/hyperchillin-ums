package me.sebbert.hyperchillin;

public class Configuration {
	private String _username;
	private String _password;
	
	public String getUsername() {
		return _username;
	}
	
	public String getPassword() {
		return _password;
	}
	
	public Configuration(String username, String password) {
		this();
		
		if(username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
			_username = username;
			_password = password;
		}
	}
	
	public Configuration() {
		_username = "petterhaugland@gmail.com";
		_password = "petter97";
	}
}
