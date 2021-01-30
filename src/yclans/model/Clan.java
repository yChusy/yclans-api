package yclans.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import yclans.enums.Roles;

public class Clan {

	private String tag, coloredLetter1, coloredLetter2, coloredLetter3, name, leader;
	private List<String> members, allies, moneyTransfers, chestTransfers, newsletters;
	private List<Roles> permKick, permChest, permBase, permDepositBank, permWithdrawBank, permInvite,
			permAddAlly, permRemoveAlly, permAddRival, permRemoveRival, permAddNewsletters, permFriendlyFire, permBuyMarket;
	private boolean friendlyFireAlly, friendlyFireMember, allyInvitation;
	private double money;
	private List<String> items;
	private String home;
	private Date date;
	private HashMap<String, String> rivals;
	private HashMap<String, Date> invitations;

	public Clan(String tag, String coloredLetter1, String coloredLetter2, String coloredLetter3, String name,
			List<String> members, List<String> allies, HashMap<String, String> rivals, List<String> moneyTransfers,
			List<String> chestTransfers, List<String> newsletters, double money,
			List<String> items, String home, Date date, String leader, List<Roles> permKick, List<Roles> permChest,
			List<Roles> permBase, List<Roles> permDepositBank, List<Roles> permWithdrawBank, List<Roles> permInvite,
			List<Roles> permAddAlly, List<Roles> permRemoveAlly, List<Roles> permAddRival, List<Roles> permRemoveRival,
			List<Roles> permAddNewsletters, List<Roles> permFriendlyFire, List<Roles> permBuyMarket, boolean friendlyFireAlly,
			boolean friendlyFireMember, boolean allyInvitation, HashMap<String, Date> invitations) {
		this.tag = tag;
		this.coloredLetter1 = coloredLetter1;
		this.coloredLetter2 = coloredLetter2;
		this.coloredLetter3 = coloredLetter3;
		this.name = name;
		this.members = members;
		this.allies = allies;
		this.rivals = rivals;
		this.moneyTransfers = moneyTransfers;
		this.chestTransfers = chestTransfers;
		this.newsletters = newsletters;
		this.invitations = invitations;
		this.money = money;
		this.items = items;
		this.home = home;
		this.date = date;
		this.leader = leader;
		this.permKick = permKick;
		this.permChest = permChest;
		this.permBase = permBase;
		this.permDepositBank = permDepositBank;
		this.permWithdrawBank = permWithdrawBank;
		this.permInvite = permInvite;
		this.permAddAlly = permAddAlly;
		this.permRemoveAlly = permRemoveAlly;
		this.permAddRival = permAddRival;
		this.permRemoveRival = permRemoveRival;
		this.permAddNewsletters = permAddNewsletters;
		this.permFriendlyFire = permFriendlyFire;
		this.permBuyMarket = permBuyMarket;
		this.friendlyFireAlly = friendlyFireAlly;
		this.friendlyFireMember = friendlyFireMember;
		this.allyInvitation = allyInvitation;
	}

	public String getTag() {
		return tag;
	}

	public String getNameClan() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMembers() {
		return members;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public List<String> getAllies() {
		return allies;
	}

	public void setAllies(List<String> allies) {
		this.allies = allies;
	}

	public List<String> getMoneyTransfers() {
		return moneyTransfers;
	}

	public List<String> getChestTransfers() {
		return chestTransfers;
	}

	public Date getDate() {
		return date;
	}

	public String getLeader() {
		return leader;
	}

	public String getColoredLetter1() {
		return coloredLetter1;
	}

	public void setColoredLetter1(String coloredLetter1) {
		this.coloredLetter1 = coloredLetter1;
	}

	public String getColoredLetter2() {
		return coloredLetter2;
	}

	public void setColoredLetter2(String coloredLetter2) {
		this.coloredLetter2 = coloredLetter2;
	}

	public String getColoredLetter3() {
		return coloredLetter3;
	}

	public void setColoredLetter3(String coloredLetter3) {
		this.coloredLetter3 = coloredLetter3;
	}
	
	public String getColoredTag() {
		return getColoredLetter1() + getColoredLetter2() + getColoredLetter3();
	}

	public List<Roles> getPermKick() {
		return permKick;
	}

	public List<Roles> getPermChest() {
		return permChest;
	}

	public List<Roles> getPermBase() {
		return permBase;
	}

	public List<Roles> getPermDepositBank() {
		return permDepositBank;
	}

	public List<Roles> getPermWithdrawBank() {
		return permWithdrawBank;
	}

	public List<Roles> getPermInvite() {
		return permInvite;
	}

	public List<Roles> getPermAddAlly() {
		return permAddAlly;
	}

	public List<Roles> getPermRemoveAlly() {
		return permRemoveAlly;
	}

	public List<Roles> getPermAddRival() {
		return permAddRival;
	}

	public List<Roles> getPermRemoveRival() {
		return permRemoveRival;
	}

	public List<Roles> getPermAddNewsletters() {
		return permAddNewsletters;
	}

	public List<Roles> getPermFriendlyFire() {
		return permFriendlyFire;
	}

	public boolean isFriendlyFireAlly() {
		return friendlyFireAlly;
	}

	public void setFriendlyFireAlly(boolean friendlyFireAlly) {
		this.friendlyFireAlly = friendlyFireAlly;
	}

	public boolean isFriendlyFireMember() {
		return friendlyFireMember;
	}

	public void setFriendlyFireMember(boolean friendlyFireMember) {
		this.friendlyFireMember = friendlyFireMember;
	}

	public HashMap<String, String> getRivals() {
		return rivals;
	}

	public List<String> getNewsletters() {
		return newsletters;
	}

	public boolean isAllyInvitation() {
		return allyInvitation;
	}

	public void setAllyInvitation(boolean allyInvitation) {
		this.allyInvitation = allyInvitation;
	}

	public HashMap<String, Date> getInvitations() {
		return invitations;
	}

	public List<Roles> getPermBuyMarket() {
		return permBuyMarket;
	}
	
	public void setLeader(String leader) {
		this.leader = leader;
	}
}
