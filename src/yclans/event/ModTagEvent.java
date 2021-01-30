package yclans.event;

import java.util.List;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import yclans.model.Clan;

public class ModTagEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final Clan clan;
    private final List<String> players;

    public ModTagEvent(Clan clan, List<String> players) {
        this.clan = clan;
        this.players = players;
    }

    public Clan getClan() {
        return this.clan;
    }

    public List<String> getClanMembers() {
        return this.players;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
