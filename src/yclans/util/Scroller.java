package yclans.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import yclans.Main;
import yclans.enums.config.Options.Items;

public class Scroller {

	static {
		Bukkit.getPluginManager().registerEvents(new Listener() {
			@EventHandler
			public void onClick(InventoryClickEvent e) {
				if (e.getInventory().getHolder() instanceof ScrollerHolder) {
					e.setCancelled(true);
					ScrollerHolder holder = (ScrollerHolder) e.getInventory().getHolder();
					if (e.getSlot() == holder.getScroller().previousPage) {
						if (holder.getScroller().hasPage(holder.getPage() - 1)) {
							holder.getScroller().open((Player) e.getWhoClicked(), holder.getPage() - 1);
						}
					} else if (e.getSlot() == holder.getScroller().nextPage) {
						if (holder.getScroller().hasPage(holder.getPage() + 1)) {
							holder.getScroller().open((Player) e.getWhoClicked(), holder.getPage() + 1);
						}
					} else if (e.getSlot() == holder.getScroller().backSlot) {
						e.getWhoClicked().closeInventory();
						holder.getScroller().backRunnable.run((Player) e.getWhoClicked());
					} else if (holder.getScroller().slots.contains(e.getSlot()) && holder.getScroller().onClickRunnable != null) {
						if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) return;
						holder.getScroller().onClickRunnable.run((Player) e.getWhoClicked(), e.getCurrentItem());
					}
				}
			}
		}, Main.getPlugin(Main.class));
	}

	private List<ItemStack> items;
	private HashMap<Integer, Inventory> pages;
	private String name;
	private int inventorySize;
	private List<Integer> slots;
	private int backSlot, previousPage, nextPage;
	private PlayerRunnable backRunnable;
	private ChooseItemRunnable onClickRunnable;

	public Scroller(ScrollerBuilder builder, Main main) {
		this.items = builder.items;
		this.pages = new HashMap<>();
		this.name = builder.name;
		this.inventorySize = builder.inventorySize;
		this.slots = builder.slots;
		this.backSlot = builder.backSlot;
		this.backRunnable = builder.backRunnable;
		this.previousPage = builder.previousPage;
		this.nextPage = builder.nextPage;
		this.onClickRunnable = builder.clickRunnable;
		createInventories(main);
	}

	private void createInventories(Main main) {
		if (items.isEmpty()){
			Inventory inventory = Bukkit.createInventory(new ScrollerHolder(this, 1), inventorySize, name);
			if (backRunnable != null) inventory.setItem(backSlot, Items.BACK.getValue());
			pages.put(1,inventory);
			return;
		}
		List<List<ItemStack>> lists = getPages(items, slots.size());
		int page = 1;
		for (List<ItemStack> list : lists) {
			Inventory inventory = Bukkit.createInventory(new ScrollerHolder(this, page), inventorySize, name);
			int slot = 0;
			for (ItemStack it : list) {
				inventory.setItem(slots.get(slot), it);
				slot++;
			}
			if (page != 1) inventory.setItem(previousPage, Items.NEXT.getValue());
			inventory.setItem(nextPage, Items.NEXT.getValue());
			if (backRunnable != null) inventory.setItem(backSlot, Items.BACK.getValue());
			pages.put(page, inventory);
			page++;
		}
		pages.get(pages.size()).setItem(nextPage, new ItemStack(Material.AIR));
	}

	public int getPages() {
		return pages.size();
	}

	public boolean hasPage(int page) {
		return pages.containsKey(page);
	}

	public void open(Player player) {
		open(player, 1);
	}

	public void open(Player player, int page) {
		player.openInventory(pages.get(page));
	}

	private <T> List<List<T>> getPages(Collection<T> c, Integer pageSize) {
		List<T> list = new ArrayList<T>(c);
		if (pageSize == null || pageSize <= 0 || pageSize > list.size()) pageSize = list.size();
		int numPages = (int) Math.ceil((double) list.size() / (double) pageSize);
		List<List<T>> pages = new ArrayList<List<T>>(numPages);
		for (int pageNum = 0; pageNum < numPages;) pages.add(list.subList(pageNum * pageSize, Math.min(++pageNum * pageSize, list.size())));
		return pages;
	}

	private class ScrollerHolder implements InventoryHolder {
		private Scroller scroller;
		private int page;

		public ScrollerHolder(Scroller scroller, int page) {
			super();
			this.scroller = scroller;
			this.page = page;
		}

		@Override
		public Inventory getInventory() {
			return null;
		}

		public Scroller getScroller() {
			return scroller;
		}

		public int getPage() {
			return page;
		}
	}

	public interface PlayerRunnable {

		public void run(Player player);

	}

	public interface ChooseItemRunnable {
		public void run(Player player, ItemStack item);
	}

	public static class ScrollerBuilder {
		private List<ItemStack> items;
		private String name;
		private int inventorySize;
		private List<Integer> slots;
		private int backSlot, previousPage, nextPage;
		private PlayerRunnable backRunnable;
		private ChooseItemRunnable clickRunnable;

		private final static List<Integer> ALLOWED_SLOTS = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 28, 29,
				30, 31, 32, 33, 34);

		public ScrollerBuilder() {
			this.items = new ArrayList<>();
			this.name = "";
			this.inventorySize = 54;
			this.slots = ALLOWED_SLOTS;
			this.backSlot = -1;
			this.previousPage = 18;
			this.nextPage = 26;
		}

		public ScrollerBuilder withItems(List<ItemStack> items) {
			this.items = items;
			return this;
		}

		public ScrollerBuilder withOnClick(ChooseItemRunnable clickRunnable) {
			this.clickRunnable = clickRunnable;
			return this;
		}

		public ScrollerBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public ScrollerBuilder withSize(int size) {
			this.inventorySize = size;
			return this;
		}

		public ScrollerBuilder withArrowsSlots(int previousPage, int nextPage) {
			this.previousPage = previousPage;
			this.nextPage = nextPage;
			return this;
		}

		public ScrollerBuilder withBackItem(int slot, PlayerRunnable runnable) {
			this.backSlot = slot;
			this.backRunnable = runnable;
			return this;
		}

		public ScrollerBuilder withItemsSlots(List<Integer> slots2) {
			this.slots = slots2;
			return this;
		}

		public Scroller build(Main main) {
			return new Scroller(this, main);
		}
	}
}