package yclans.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import yclans.Main;

public class ClanCommand implements CommandExecutor {
	
	public ClanCommand(Main main) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
	}
}
