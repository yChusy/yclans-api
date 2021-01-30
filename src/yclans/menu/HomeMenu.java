package yclans.menu;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;
import yclans.model.ClanPlayer;

public class HomeMenu {
	
	public String name;
	public int size, backslot, setSlot, goSlot, deleteSlot;
	public ItemStack set, go, delete;
	public ArrayList<String> loreHas = new ArrayList<>();
	public ArrayList<String> loreDontHas = new ArrayList<>();
	
	public void show(Main main, Player p, ClanPlayer cPlayer) {
	}
	
	public void setup(Main main) {
	}
}
