package yclans.menu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import yclans.Main;
import yclans.model.ClanPlayer;

public class MembersManagerMenu {
	
	public String name;
	public int size, back, previous, next;
	public List<Integer> slots = new ArrayList<>();
	
	public void show(Main main, Player p, ClanPlayer cPlayer) {
	}
	
	public void setup(Main main) {
	}
}