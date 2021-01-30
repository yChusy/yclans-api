package yclans.event;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import yclans.model.Clan;
import yclans.model.ClanPlayer;

public class ChestOpenEvent extends Event implements Cancellable {
	
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean cancelled = false;
    private Clan clan;
    private ClanPlayer cPlayer;
    
    public ChestOpenEvent(Clan clan, ClanPlayer cPlayer){
        this.clan = clan;
        this.cPlayer = cPlayer;
    }
    
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean value) {
    	this.cancelled = value;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

	public Clan getClan() {
		return clan;
	}

	public ClanPlayer getClanPlayer() {
		return cPlayer;
	}
}