package yclans.menu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import yclans.Main;

public class RolesManagerMenu {
	
	public String name, nameMember, nameTrusted, nameCaptain;
	
	public int size, backslot, memberSlot, trustedSlot, captainSlot, insideSize, insideBack, kickSlot, chestSlot,
			homeSlot, depositSlot, withdrawSlot, inviteSlot, addAllySlot, removeAllySlot, addRivalSlot, removeRivalSlot,
			newslettersSlot, friendlyFireSlot, buyMarketSlot;

	public ItemStack member, trusted, captain, kick, chest, home, deposit, withdraw, invite, addAlly, removeAlly,
			addRival, removeRival, newsletters, friendlyFire, buyMarket;
	public List<String> loreHas = new ArrayList<>();
	public List<String> loreNormal = new ArrayList<>();
	
	public void show(Main main, Player p) {
	}
	
	public void setup(Main main) {
	}
}