package yclans.menu;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;
import yclans.model.ClanPlayer;

public class NoClanMenu {
	
	public String name;
	public int size, createSlot, onlineSlot, invitationsSlot, topSlot, profileSlot;
	public ItemStack create, online, invitations, top, profile;
	
	public void show(Main main, Player p, ClanPlayer cPlayer) {
	}
	
	public void setup(Main main) {
	}
}
