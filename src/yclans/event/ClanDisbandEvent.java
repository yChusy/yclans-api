package yclans.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import yclans.model.Clan;

public class ClanDisbandEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Clan clan;

    public ClanDisbandEvent(Clan clan) {
        this.clan = clan;
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
}