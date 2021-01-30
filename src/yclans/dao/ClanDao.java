package yclans.dao;

import java.util.Map;
import java.util.TreeMap;

import yclans.model.Clan;

public class ClanDao {
	
	public static Map<String, Clan> clans = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

}
