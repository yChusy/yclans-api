package yclans.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemBuilder {

	private ItemStack is;

	public ItemBuilder(Material m) {
		this(m, 1);
	}

	public ItemBuilder(ItemStack is) {
		this.is = is;
	}

	public ItemBuilder(Material m, int quantia) {
		this.is = new ItemStack(m, quantia);
	}

	public ItemBuilder(Material m, int quantia, byte durabilidade) {
		this.is = new ItemStack(m, quantia, (short) durabilidade);
	}

	public ItemBuilder clone() {
		return new ItemBuilder(this.is);
	}

	public ItemBuilder setDurability(short durabilidade) {
		this.is.setDurability(durabilidade);
		return this;
	}

	public ItemBuilder setAmount(int amount) {
		this.is.setAmount(amount);
		return this;
	}

	public ItemBuilder setDurability(int durabilidade) {
		this.is.setDurability(Short.valueOf("" + durabilidade).shortValue());
		return this;
	}

	public ItemBuilder setName(String nome) {
		if (nome.equalsIgnoreCase("nulo")) {
			return this;
		}
		ItemMeta im = this.is.getItemMeta();
		im.setDisplayName(nome);
		this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder addUnsafeEnchantment(Enchantment ench, int level) {
		this.is.addUnsafeEnchantment(ench, level);
		return this;
	}

	public ItemBuilder addEnchants(List<String> enchants) {
		if (enchants.get(0).equalsIgnoreCase("nulo")) {
			return this;
		}
		for (String s : enchants) {
			Enchantment ench = Enchantment.getByName((String) s.split(":")[0]);
			int level = Integer.valueOf(s.split(":")[1]);
			this.is.addUnsafeEnchantment(ench, level);
		}
		return this;
	}

	public ItemBuilder setGlow(boolean b) {
		if (!b) {
			return this;
		}
		this.is.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta im = this.is.getItemMeta();
        im.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ENCHANTS});
        this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder setType(Material m) {
		this.is.setType(m);
		return this;
	}

	public ItemBuilder removeEnchantment(Enchantment ench) {
		this.is.removeEnchantment(ench);
		return this;
	}

	public ItemBuilder setSkullOwner(String dono) {
		try {
			SkullMeta im = (SkullMeta) this.is.getItemMeta();
			im.setOwner(dono);
			this.is.setItemMeta((ItemMeta) im);
		} catch (ClassCastException im) {
		}
		return this;
	}

	public ItemBuilder addEnchant(Enchantment ench, int level) {
		ItemMeta im = this.is.getItemMeta();
		im.addEnchant(ench, level, true);
		this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder addEnchantments(Map<Enchantment, Integer> enchantments) {
		this.is.addEnchantments(enchantments);
		return this;
	}

	public ItemBuilder setInfinityDurability() {
		this.is.setDurability((short) 32767);
		return this;
	}

	public ItemBuilder addItemFlag(ItemFlag flag) {
		ItemMeta im = this.is.getItemMeta();
		im.addItemFlags(new ItemFlag[] { flag });
		this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder setLore(String... lore) {
		ItemMeta im = this.is.getItemMeta();
		im.setLore(Arrays.asList(lore));
		this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder setLore(List<String> lore) {
		if (lore.get(0).equalsIgnoreCase("nulo")) {
			return this;
		}
		ItemMeta im = this.is.getItemMeta();
		im.setLore(lore);
		this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder removeLoreLine(String linha) {
		ItemMeta im = this.is.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>(im.getLore());
		if (!lore.contains(linha)) {
			return this;
		}
		lore.remove(linha);
		im.setLore(lore);
		this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder removeLoreLine(int index) {
		ItemMeta im = this.is.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>(im.getLore());
		if (index < 0 || index > lore.size()) {
			return this;
		}
		lore.remove(index);
		im.setLore(lore);
		this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder addLoreLine(String linha) {
		ItemMeta im = this.is.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>();
		if (im.hasLore()) {
			lore = new ArrayList<String>(im.getLore());
		}
		lore.add(linha);
		im.setLore(lore);
		this.is.setItemMeta(im);
		return this;
	}

	public ItemBuilder addLoreLine(String linha, int pos) {
		ItemMeta im = this.is.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>(im.getLore());
		lore.set(pos, linha);
		im.setLore(lore);
		this.is.setItemMeta(im);
		return this;
	}

	@SuppressWarnings("deprecation")
	public ItemBuilder setDyeColor(DyeColor cor) {
		this.is.setDurability((short) cor.getData());
		return this;
	}

	@Deprecated
	public ItemBuilder setWoolColor(DyeColor cor) {
		if (!this.is.getType().equals((Object) Material.WOOL)) {
			return this;
		}
		this.is.setDurability((short) cor.getData());
		return this;
	}

	public ItemBuilder setLeatherArmorColor(Color cor) {
		try {
			LeatherArmorMeta im = (LeatherArmorMeta) this.is.getItemMeta();
			im.setColor(cor);
			this.is.setItemMeta((ItemMeta) im);
		} catch (ClassCastException im) {
		}
		return this;
	}

	public ItemStack toItemStack() {
		return this.is;
	}
}
