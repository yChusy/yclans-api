package yclans.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import yclans.model.Clan;
import yclans.model.ClanPlayer;

public class ClanLeaveEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Clan clan;
    private final ClanPlayer cPlayer;

    public ClanLeaveEvent(Clan clan, ClanPlayer cPlayer) {
        this.clan = clan;
        this.cPlayer = cPlayer;
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

	public ClanPlayer getClanPlayer() {
		return cPlayer;
	}
}