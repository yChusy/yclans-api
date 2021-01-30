package yclans.api;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import br.com.devpaulo.legendchat.api.events.ChatMessageEvent;
import yclans.Main;

public class LegendChatEvent implements Listener {
	
	public LegendChatEvent(Main main) {
	}
	
	@EventHandler
	public void onTalk(ChatMessageEvent e) {
	}
}
