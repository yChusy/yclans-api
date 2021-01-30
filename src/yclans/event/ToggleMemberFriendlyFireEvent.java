package yclans.event;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import yclans.model.Clan;
import yclans.model.ClanPlayer;

public class ToggleMemberFriendlyFireEvent extends Event implements Cancellable {
	
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean cancelled = false;
    private Clan clan;
    private ClanPlayer cPlayer;
    private boolean state;
    
    public ToggleMemberFriendlyFireEvent(Clan clan, ClanPlayer cPlayer, boolean state){
        this.clan = clan;
        this.cPlayer = cPlayer;
        this.state = state;
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

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}