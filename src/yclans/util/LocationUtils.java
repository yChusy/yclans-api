package yclans.util;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class LocationUtils {
	
	public String getSerializedLocation(Location loc) {
		return loc.getWorld().getName()+";"+loc.getX()+";"+loc.getY()+";"+loc.getZ()+";"+loc.getYaw()+";"+loc.getPitch();
	}
	
	public Location getDeserializedLocation(String s) {
		if (s == null)
			return null;
		
		if (s.isEmpty())
			return null;
		
		if (s.equalsIgnoreCase("none"))
			return null;
		
		String[] split = s.split(";");
		World world = Bukkit.getServer().getWorld(split[0]);
		double x = Double.parseDouble(split[1]);
		double y = Double.parseDouble(split[2]);
		double z = Double.parseDouble(split[3]);
		float yaw = Float.parseFloat(split[4]);
		float pitch = Float.parseFloat(split[5]);
		return new Location(world, x, y, z, yaw, pitch);
	}
}
