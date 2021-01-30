package yclans.model;

import java.util.Date;
import java.util.HashMap;

import yclans.dao.ClanDao;
import yclans.enums.Roles;

public class ClanPlayer {
	
	private String name, clanTag;
	private Roles role;
	private int kills, deaths;
	private HashMap<String, Date> invitations;
	private boolean blockInvitations;
	
	public ClanPlayer(String name, Roles role, String clanTag, int kills, int deaths, HashMap<String, Date> invitations, boolean blockInvitations) {
		this.name = name;
		this.role = role;
		this.clanTag = clanTag;
		this.kills = kills;
		this.deaths = deaths;
		this.invitations = invitations;
		this.blockInvitations = blockInvitations;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Roles getRole() {
		return role;
	}
	
	public void setRole(Roles role) {
		this.role = role;
	}
	
	public String getClanTag() {
		return clanTag;
	}
	
	public void setClanTag(String clanTag) {
		this.clanTag = clanTag;
	}
	
	public boolean hasClan() {
		if (clanTag == null)
			return false;
		
		return ClanDao.clans.containsKey(this.clanTag);
	}
	
	public Clan getClan() {
		return ClanDao.clans.get(this.clanTag);
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public HashMap<String, Date> getInvitations() {
		return invitations;
	}

	public boolean isBlockInvitations() {
		return blockInvitations;
	}

	public void setBlockInvitations(boolean blockInvitations) {
		this.blockInvitations = blockInvitations;
	}
}
