package yclans.menu;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;
import yclans.model.ClanPlayer;

public class FriendlyFireMenu {
	
	public String name;
	public int size, backslot, memberSlot, allySlot;
	public ItemStack member, ally;
	public ArrayList<String> loreActive = new ArrayList<>();
	public ArrayList<String> loreNormal = new ArrayList<>();
	
	public void show(Main main, Player p, ClanPlayer cPlayer) {
	}
	
	public void setup(Main main) {
	}
}