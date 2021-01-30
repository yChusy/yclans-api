package yclans.api;

import java.util.List;

import org.bukkit.entity.Player;

import yclans.model.Clan;
import yclans.model.ClanPlayer;

public class yClansAPI {
	
	public static yClansAPI yclansapi;
	
	public List<Clan> getClans() {
		return null;
	}
	
	public List<ClanPlayer> getClanPlayers() {
		return null;
	}
	
	public boolean containsClan(String tag) {
		return false;
	}
	
	public ClanPlayer getPlayer(String p) {
		return null;
	}
	
	public ClanPlayer getPlayer(Player p) {
		return null;
	}
	
	public Clan getClan(String tag) {
		return null;
	}
	
	public double getKDR(ClanPlayer p) {
		return 0;
	}
	
	public int getKills(Clan c) {
		return 0;
	}
	
	public int getDeaths(Clan c) {
		return 0;
	}
	
	public double getKDR(Clan c) {
		return 0;
	}
	
	public void deleteClan(Clan c) {
	}
}
