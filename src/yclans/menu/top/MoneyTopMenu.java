package yclans.menu.top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;

public class MoneyTopMenu {
	
	public String name;
	public int size, back, previous, next;
	public ItemStack item;
	public List<Integer> slots = new ArrayList<>();
	
	public void show(Main main, Player p) {
	}
	
	@SuppressWarnings("unused")
	private List<String> getTop(HashMap<String, Double> hash) {
		return null;
	}
	
	public void setup(Main main) {
	}
}
