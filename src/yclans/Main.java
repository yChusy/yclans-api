package yclans;

import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.economy.Economy;
import yclans.config.Config;
import yclans.market.MarketMenu;
import yclans.menu.AlliesInvitesMenu;
import yclans.menu.AlliesMenu;
import yclans.menu.ChestMenu;
import yclans.menu.ClanManagerMenu;
import yclans.menu.ClanMenu;
import yclans.menu.ConfirmationMenu;
import yclans.menu.FriendlyFireMenu;
import yclans.menu.HomeMenu;
import yclans.menu.InvitesMenu;
import yclans.menu.MemberManagerMenu;
import yclans.menu.MembersManagerMenu;
import yclans.menu.ModtagMenu;
import yclans.menu.MoneyMenu;
import yclans.menu.NoClanMenu;
import yclans.menu.OnlineMenu;
import yclans.menu.RivalsMenu;
import yclans.menu.RolesManagerMenu;
import yclans.menu.top.KdrTopMenu;
import yclans.menu.top.MoneyTopMenu;
import yclans.menu.top.TopMenu;
import yclans.util.ConfigUtils;

public class Main extends JavaPlugin {

	public Economy econ;
	public Config config = new Config();
	public ConfigUtils noclan, clan, top, topmoney, topkdr, online, money, chest, home, membersmanager, clanmanager,
			modtag, allies, rivals, membermanager, rolesmanager, alliesinvites, invites, insiderole, friendlyfire,
			confirmation, optionsc, messages, market;

	public NoClanMenu menuNoClanMenu = new NoClanMenu();
	public ClanMenu menuClanMenu = new ClanMenu();
	public TopMenu menuTopMenu = new TopMenu();
	public MoneyTopMenu menuMoneyTopMenu = new MoneyTopMenu();
	public KdrTopMenu menuKdrTopMenu = new KdrTopMenu();
	public OnlineMenu menuOnlineMenu = new OnlineMenu();
	public MoneyMenu menuMoneyMenu = new MoneyMenu();
	public ChestMenu menuChestMenu = new ChestMenu();
	public HomeMenu menuHomeMenu = new HomeMenu();
	public MembersManagerMenu menuMembersManagerMenu = new MembersManagerMenu();
	public ClanManagerMenu menuClanManagerMenu = new ClanManagerMenu();
	public ModtagMenu menuModtagMenu = new ModtagMenu();
	public AlliesMenu menuAlliesMenu = new AlliesMenu();
	public RivalsMenu menuRivalsMenu = new RivalsMenu();
	public MemberManagerMenu menuMemberManagerMenu = new MemberManagerMenu();
	public RolesManagerMenu menuRolesManagerMenu = new RolesManagerMenu();
	public AlliesInvitesMenu menuAlliesInvitesMenu = new AlliesInvitesMenu();
	public InvitesMenu menuInvitesMenu = new InvitesMenu();
	public FriendlyFireMenu menuFriendlyFireMenu = new FriendlyFireMenu();
	public ConfirmationMenu menuConfirmationMenu = new ConfirmationMenu();
	public MarketMenu marketMenu = new MarketMenu();
	
	@SuppressWarnings("unused")
	private static boolean disabled = false;
	
	@Override
	public void onEnable() {
	}

	@Override
	public void onDisable() {
	}

	public void register() {
	}
	
	@SuppressWarnings("unused")
	private void hooks() {
	}
}