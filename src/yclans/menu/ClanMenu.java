package yclans.menu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;
import yclans.model.ClanPlayer;

public class ClanMenu {
	
	public String name;
	public int size, profileSlot, topSlot, onlineSlot, moneySlot, chestSlot, homeSlot, inviteSlot, alliesSlot,
			rivalsSlot, newslettersSlot, infoSlot, clanManagerSlot, marketSlot, leaveDisbandSlot;
	public ItemStack profile, top, online, money, chest, home, invite, allies, rivals, newsletters, info, clanManager,
			market, leave, disband;
	public boolean moneyActive, chestActive, marketActive, homeActive;
	
	public List<String> inviteLoreHas = new ArrayList<>();
	public List<String> inviteLoreMax = new ArrayList<>();
	public List<String> newslettersLoreHas = new ArrayList<>();
	public List<String> newslettersLoreNormal = new ArrayList<>();

	public void show(Main main, Player p, ClanPlayer cPlayer) {
	}
	
	public void setup(Main main) {
	}
}
