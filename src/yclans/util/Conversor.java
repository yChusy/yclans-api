package yclans.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.bukkit.inventory.ItemStack;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

public class Conversor {
	
	public static String toBase64(ItemStack item) throws IllegalStateException {
		try {
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        BukkitObjectOutputStream dataOutput = new BukkitObjectOutputStream(outputStream);
	        
	        dataOutput.writeObject(item);
	        dataOutput.close();
	        
	    	return Base64.getEncoder().encodeToString(outputStream.toByteArray());
		}catch(IOException e) {
		}
		return "";
    }

	public static ItemStack fromBase64(String data) throws ClassNotFoundException {
    	try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(Base64Coder.decodeLines(data));
            BukkitObjectInputStream dataInput = new BukkitObjectInputStream(inputStream);
            
            ItemStack item = (ItemStack) dataInput.readObject();
            
            dataInput.close();
            return item;
        } catch (IOException e) {
        }
		return null;
    }
}