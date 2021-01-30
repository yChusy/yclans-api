package yclans.menu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;
import yclans.model.Clan;

public class AlliesInvitesMenu {
	
	public String name;
	public int size, back, blockAllowSlot;
	public ItemStack block, allow, invite;
	public List<Integer> slots = new ArrayList<>();
	
	public void show(Main main, Player p, Clan c) {
	}
	
	public void setup(Main main) {
	}
}
