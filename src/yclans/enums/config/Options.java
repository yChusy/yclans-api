package yclans.enums.config;

import org.bukkit.inventory.ItemStack;

public enum Options {
	
	CANCELID("Options.Cancel ID", ""),
	CHATLEADER("Options.Chat leader", ""),
	CHATCAPTAIN("Options.Chat captain", ""),
	CHATTRUSTED("Options.Chat trusted", ""),
	CHATMEMBER("Options.Chat member", ""),
	CHATFORMAT("Options.Chat format", ""),
	ALLYCHATFORMAT("Options.Ally chat format", ""),
	HOURFORMAT("Options.Hour format", ""),
	SPYFORMAT("Options.Spy format", ""),
	ALLYSPYFORMAT("Options.Ally spy format", ""),
	LEGENDCHATTAG("Options.LegendChat tag", ""),
	LEGENDCHATCOLORTAG("Options.LegendChat colortag", ""),
	LEGENDCHATNAME("Options.LegendChat name", ""),
	LEGENDCHATSYMBOL("Options.LegendChat symbol", ""),
	PLACEHOLDERTAGHAS("Options.Placeholders.Tag has", ""),
	PLACEHOLDERTAGNOHAS("Options.Placeholders.Tag no has", ""),
	PLACEHOLDERCOLORTAGHAS("Options.Placeholders.Colortag has", ""),
	PLACEHOLDERCOLORTAGNOHAS("Options.Placeholders.Colortag no has", ""),
	PLACEHOLDERNAMEHAS("Options.Placeholders.Name has", ""),
	PLACEHOLDERNAMENOHAS("Options.Placeholders.Name no has", "");
	
	private String config;
	private String value;

	private Options(String config, String value) {
		this.config = config;
		this.value = value;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public enum Items {
		
		BACK("Options.Back", null, true),
		NEXT("Options.Next", null, true);
		
		private String tag;
		private ItemStack value;
		private boolean lore;

		private Items(String tag, ItemStack value, boolean lore) {
			this.tag = tag;
			this.value = value;
			this.lore = lore;
		}

		public ItemStack getValue() {
			return value;
		}
		
		public void setValue(ItemStack value) {
			this.value = value;
		}

		public String getTag() {
			return tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public boolean isLore() {
			return lore;
		}
	}
}
