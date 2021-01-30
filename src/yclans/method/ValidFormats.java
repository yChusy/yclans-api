package yclans.method;

import java.util.Arrays;
import java.util.List;

public class ValidFormats {
	
	private static List<String> formats = Arrays.asList("&0", "&1", "&2", "&3", "&4", "&5", "&6", "&7", "&8", "&9", "&a", "&b", "&c", "&d", "&e");
	
	public static void setFormats(List<String> formats) {
		ValidFormats.formats = formats;
	}
	
	public static List<String> getFormats(){
		return formats;
	}
}
