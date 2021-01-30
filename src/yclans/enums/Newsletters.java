package yclans.enums;

public enum Newsletters {

	CREATE("Options.Newsletters.Create"),
	JOIN("Options.Newsletters.Join"),
	LEAVE("Options.Newsletters.Leave"),
	MESSAGE("Options.Newsletters.Message"),
	KICKED("Options.Newsletters.Kicked");

	private String name;

	private Newsletters(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
