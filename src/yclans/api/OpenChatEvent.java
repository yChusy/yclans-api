package yclans.api;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.nickuc.chat.api.events.PublicMessageEvent;

import yclans.Main;

public class OpenChatEvent implements Listener {
	
	public OpenChatEvent(Main main) {
	}
	
	@EventHandler
	public void onTalk(PublicMessageEvent e) {
	}
}
