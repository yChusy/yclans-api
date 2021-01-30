package yclans.config;

import java.util.ArrayList;
import java.util.List;

import yclans.Main;

public class Config {
	
	public boolean menusClanPerfilGlow;
	public String optionsAllyChatCommand, optionsClanChatCommand;
	public int optionsMaxMembers, optionsMaxNameLetters, optionsMaxAllies, optionsMaxRivals, optionsMaxMenuNewsletters,
			optionsMaxNewsletters;
	public double optionsCreateCost;
	
	public List<String> optionsActiveFriendlyFire = new ArrayList<>();
	public List<String> optionsBlockedFriendlyFire = new ArrayList<>();
	
	public Config setup(Main main) {
		return this;
	}
	
	@SuppressWarnings("unused")
	private Config setupOptions(Main main, Config config) {
		return this;
	}
}
