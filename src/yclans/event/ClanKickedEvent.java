package yclans.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import yclans.model.Clan;
import yclans.model.ClanPlayer;

public class ClanKickedEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Clan clan;
    private final ClanPlayer kicker;
    private final ClanPlayer kicked;

    public ClanKickedEvent(Clan clan, ClanPlayer kicker, ClanPlayer kicked) {
        this.clan = clan;
        this.kicker = kicker;
        this.kicked = kicked;
    }

    public Clan getClan() {
        return this.clan;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

	public ClanPlayer getKicker() {
		return kicker;
	}
	
	public ClanPlayer getKicked() {
		return kicked;
	}
}