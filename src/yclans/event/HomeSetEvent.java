package yclans.event;

import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import yclans.model.Clan;
import yclans.model.ClanPlayer;

public class HomeSetEvent extends Event implements Cancellable {
	
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean cancelled = false;
    private Clan clan;
    private ClanPlayer cPlayer;
    private Location loc;
    
    public HomeSetEvent(Clan clan, ClanPlayer cPlayer, Location loc){
        this.clan = clan;
        this.cPlayer = cPlayer;
        this.loc = loc;
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

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}
}