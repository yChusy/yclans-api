package yclans.dao;

import java.util.Map;
import java.util.TreeMap;

import yclans.model.ClanPlayer;

public class ClanPlayerDao {
	
	public static Map<String, ClanPlayer> players = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

}
