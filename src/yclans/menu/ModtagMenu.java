package yclans.menu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import yclans.Main;
import yclans.model.ClanPlayer;

public class ModtagMenu {
	
	public String name, letter1Name, letter2Name, letter3Name;
	public int size, letter1Slot, letter2Slot, letter3Slot, backslot;
	public List<String> letter1Lore = new ArrayList<>();
	public List<String> letter2Lore = new ArrayList<>();
	public List<String> letter3Lore = new ArrayList<>();
	
	public void show(Main main, Player p, ClanPlayer cPlayer) {
	}
	
	public void setup(Main main) {
	}
}