package yclans.api;

import org.bukkit.OfflinePlayer;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import yclans.Main;

public class PlaceholderAPI extends PlaceholderExpansion {

	public PlaceholderAPI(Main main) {
	}
	
	@Override
    public boolean canRegister(){
        return true;
    }

	@Override
	public String getAuthor() {
		return null;
	}

	@Override
	public String getIdentifier() {
		return null;
	}

	@Override
	public String getVersion() {
		return null;
	}

	@Override
	public String onRequest(OfflinePlayer player, String identifier) {
		return null;
	}
}
