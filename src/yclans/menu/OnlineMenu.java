package yclans.menu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;
import yclans.model.ClanPlayer;

public class OnlineMenu {
	
	public String name, bannerName;
	public int size, back, previous, next;
	public ItemStack item;
	public List<Integer> slots = new ArrayList<>();
	public List<String> bannerLore = new ArrayList<>();
	
	public void show(Main main, Player p, ClanPlayer cPlayer) {
	}
	
	public void setup(Main main) {
	}
}
