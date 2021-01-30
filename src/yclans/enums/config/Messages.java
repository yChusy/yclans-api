package yclans.enums.config;

import java.util.ArrayList;

public enum Messages {

	PERMISSION("Messages.Permission"),
	TAGCOUNT("Messages.Tag count"),
	TAGINVALID("Messages.Tag invalid"),
	NAMECOUNT("Messages.Name count"),
	NAMEINVALID("Messages.Name invalid"),
	CANCELED("Messages.Canceled"),
	CANCELEDTRANSFER("Messages.Canceled transfer"),
	CANCELEDNAME("Messages.Canceled name"),
	CREATED("Messages.Created"),
	DONTHAVE("Messages.Dont have"),
	NULLMESSAGE("Messages.Null message"),
	CREATING("Messages.Creating"),
	DONTHAVEMONEY("Messages.Dont have money"),
	NOTANUMBER("Messages.Not a number"),
	DEPOSITED("Messages.Deposited"),
	CANCELEDMONEY("Messages.Canceled money"),
	CLANDONTHAVEMONEY("Messages.Clan dont have money"),
	WITHDRAWN("Messages.Withdrawn"),
	LOCATIONSET("Messages.Location set"),
	HOMEGO("Messages.Home go"),
	LOCATIONNOTSET("Messages.Location not set"),
	LOCATIONDELETED("Messages.Location deleted"),
	CANCELEDINVITE("Messages.Canceled invite"),
	PLAYERNULL("Messages.Player null"),
	PLAYERHASCLAN("Messages.Player has clan"),
	PLAYERBLOCKED("Messages.Player blocked"),
	PLAYERREACHEDMAX("Messages.Player reached max"),
	ALREADYSENT("Messages.Already sent"),
	DECLINED("Messages.Declined"),
	ACCEPTED("Messages.Accepted"),
	REACHEDMAX("Messages.Reached max"),
	ENTERED("Messages.Entered"),
	CANCELEDCOLOR("Messages.Canceled color"),
	INVALIDFORMAT("Messages.Invalid format"),
	COLORSET("Messages.Color set"),
	CANTMANAGELEADER("Messages.Cant manage leader"),
	PLAYERKICKED("Messages.Player kicked"),
	ROLECHANGED("Messages.Role changed"),
	PLAYERKICKEDP("Messages.Player kicked p"),
	ROLECHANGEDP("Messages.Role changed p"),
	ALREADYROLE("Messages.Already role"),
	ONLYLEADER("Messages.Only leader"),
	LEFT("Messages.Left"),
	LEFTMEMBER("Messages.Left member"),
	DISBAND("Messages.Disband"),
	DISBANDMEMBER("Messages.Disband member"),
	SENTINVITATION("Messages.Sent invitation"),
	ROLEPERMISSION("Messages.Role permission"),
	ALREADYOPEN("Messages.Already open"),
	RIVALRYREMOVED("Messages.Rivalry removed"),
	RIVALRYREMOVEDCLAN("Messages.Rivalry removed clan"),
	CANCELEDRIVAL("Messages.Canceled rival"),
	CLANDONOTEXISTS("Messages.Clan do not exists"),
	REACHEDMAXRIVAL("Messages.Reached max rival"),
	REACHEDMAXRIVALCLAN("Messages.Reached max rival clan"),
	RIVALRYADDED("Messages.Rivalry added"),
	RIVALRYADDEDCLAN("Messages.Rivalry added clan"),
	ALREADYHAVERIVALRY("Messages.Already have rivalry"),
	ALREADYHAVETAG("Messages.Already have tag"),
	ALREADYHAVENAME("Messages.Already have name"),
	YOUROWNRIVAL("Messages.Your own rival"),
	ONLYTHERIVALRYOWNER("Messages.Only the rivalry owner"),
	NEWSLETTERSCLEARED("Messages.Newsletters cleared"),
	CANCELEDNEWSLETTER("Messages.Canceled newsletter"),
	NEWSLETTERADDED("Messages.Newsletter added"),
	ALLYREMOVED("Messages.Ally removed"),
	ALLYREMOVEDCLAN("Messages.Ally removed clan"),
	CANCELEDALLY("Messages.Canceled ally"),
	YOUROWNALLY("Messages.Your own ally"),
	REACHEDMAXALLY("Messages.Reached max ally"),
	REACHEDMAXALLYCLAN("Messages.Reached max ally clan"),
	REACHEDMAXALLYINVITES("Messages.Reached max ally invites"),
	REACHEDMAXALLYINVITESCLAN("Messages.Reached max ally invites clan"),
	ALREADYHAVEALLY("Messages.Already have ally"),
	SENTALLYINVITATION("Messages.Sent ally invitation"),
	DECLINEDALLY("Messages.Declined ally"),
	DECLINEDALLYCLAN("Messages.Declined ally clan"),
	ALLYSUCCESS("Messages.Ally success"),
	ALLYSUCCESSCLAN("Messages.Ally success clan"),
	ALLYBLOCKED("Messages.Ally blocked"),
	ALLYINVITATIONALREADY("Messages.Ally invitation already"),
	COMMANDINFO("Command.Info"),
	COMMANDTAG("Command.Tag"),
	COMMANDDELETE("Command.Delete"),
	COMMANDPLAYERNOTFOUND("Command.Player not found"),
	COMMANDCLANNOTFOUND("Command.Clan not found"),
	BUYMARKET("Messages.Buy market"),
	INVFULL("Messages.Inv full"),
	CANNOTRIVALALLY("Messages.Can not rival ally"),
	CANNOTALLYRIVAL("Messages.Can not ally rival"),
	SPYTOGGLEDON("Messages.Spy toggled on"),
	SPYTOGGLEDOFF("Messages.Spy toggled off"),
	STAFFDISBAND("Messages.Staff disband"),
	STAFFDISBANDCLAN("Messages.Staff disband clan"),
	MONEYTOCREATE("Messages.Money to create"),
	ALREADYFFWORLDADD("Messages.Already ff world add"),
	ALREADYFFWORLDDEL("Messages.Already ff world del"),
	WORLDFFADDED("Messages.World ff added"),
	WORLDFFDELETED("Messages.World ff deleted"),
	DONTHAVEP("Messages.Dont have p"),
	NOTSAME("Messages.Not same"),
	TRANSFERED("Messages.Transfered"),
	TRANSFEREDP("Messages.Transfered p"),
	NAMECHANGED("Messages.Name changed");

	private String name;

	private Messages(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static enum MessagesList {
		
		PUTTAG("Messages.Put tag", new ArrayList<String>()),
		PUTLETTER("Messages.Put letter", new ArrayList<String>()),
		PUTNAME("Messages.Put name", new ArrayList<String>()),
		PUTNICKTRANSFER("Messages.Put nick transfer", new ArrayList<String>()),
		PUTADD("Messages.Put add", new ArrayList<String>()),
		PUTREMOVE("Messages.Put remove", new ArrayList<String>()),
		PUTNICK("Messages.Put nick", new ArrayList<String>()),
		PUTRIVAL("Messages.Put rival", new ArrayList<String>()),
		PUTALLY("Messages.Put ally", new ArrayList<String>()),
		PUTNEWSLETTER("Messages.Put newsletter", new ArrayList<String>()),
		RECEIVEDINVITATION("Messages.Received invitation", new ArrayList<String>()),
		RECEIVEDALLYINVITATION("Messages.Received ally invitation", new ArrayList<String>()),
		NEWSLETTERS("Messages.Newsletters", new ArrayList<String>()),
		COMMANDHELP("Command.Help", new ArrayList<String>()),
		COMMANDINFOMESSAGEHAVECLAN("Command.Info message have clan", new ArrayList<String>()),
		COMMANDINFOMESSAGEDONOTHAVECLAN("Command.Info message do not have clan", new ArrayList<String>()),
		COMMANDTAGMESSAGE("Command.Tag message", new ArrayList<String>());
		
		private String tag;
		private ArrayList<String> value;

		private MessagesList(String tag, ArrayList<String> value) {
			this.tag = tag;
			this.value = value;
		}

		public ArrayList<String> getValue() {
			return value;
		}
		
		public void setValue(ArrayList<String> value) {
			this.value = value;
		}

		public String getTag() {
			return tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}
	}
}