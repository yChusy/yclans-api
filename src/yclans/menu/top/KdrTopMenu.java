package yclans.menu.top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;

public class KdrTopMenu {
	
	public String name;
	public int size, back, previous, next;
	public ItemStack item;
	public List<Integer> slots = new ArrayList<>();
	
	public void show(Main main, Player p) {
	}
	
	@SuppressWarnings("unused")
	private Map<String, Double> getTop(HashMap<String, Double> hash) {
		return null;
	}
	
	public void setup(Main main) {
	}
}
