package yclans.enums;

public enum Roles {

	NOTHING("Options.Roles.Nothing", ""),
	MEMBER("Options.Roles.Member", ""),
	TRUSTED("Options.Roles.Trusted", ""),
	CAPTAIN("Options.Roles.Captain", ""),
	LEADER("Options.Roles.Leader", "");

	private String config;
	private String value;

	private Roles(String config, String value) {
		this.config = config;
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String name) {
		this.value = name;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
}
