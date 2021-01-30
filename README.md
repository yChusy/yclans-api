# yClans

[![GitHub stars](https://img.shields.io/github/stars/yChusy/yclans-api.svg)](https://github.com/yChusy/yclans-api/stargazers)
[![GitHub All Releases](https://img.shields.io/github/downloads/yChusy/yclans-api/total.svg?logoColor=fff)](https://github.com/yChusy/yclans-api/releases/latest)
[![GitHub issues](https://img.shields.io/github/issues-raw/yChusy/yclans-api.svg?label=issues)](https://github.com/yChusy/yclans-api/issues)
[![GitHub last commit](https://img.shields.io/github/last-commit/yChusy/yclans-api.svg)](https://github.com/yChusy/yclans-api/commit)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5239a5b8f99b4ed49902b6aaee63f1b2)](https://app.codacy.com/app/heroslender/HeroMagnata?utm_source=github.com&utm_medium=referral&utm_content=yChusy/yclans-api&utm_campaign=Badge_Grade_Dashboard)

A complex clan plugin, made in fully configurable menus. It has a system of permissions for positions, custom placeholders. It has commands for administration and information commands. The plugin has a full API and with several Events. We have, home, bank, market and several legal systems! A new way to configure the clan's TAG is also present. Adding and removing allies has never been easier, only the clan that puts the rivalry can remove it.

## Overview
Here you will find the information needed to configure Placeholders and tags.
The developer API will also be visible, including events and more!


## Using the Main API
In this section you will find examples of using the Main API.

### Getting the main class
```java
yClansAPI clans = yClansAPI.yclansapi;
```

### Getting all clans
```java
List<Clan> clanList = clans.getClans();
```

### Getting all clan players
```java
List<ClanPlayer> clanPlayers = clans.getClanPlayers();
```

### Checking if the clan exists
```java
if (clans.containsClan("TAG")) { //clan exists }
```

### Getting a player
```java
ClanPlayer cPlayer = clans.getPlayer("NickName");
ClanPlayer cPlayer = clans.getPlayer(player);
```

### Getting a clan
```java
Clan clan = clans.getClan("TAG");
```

### Getting player KDR
```java
double clanPlayerKdr = clans.getKDR(cPlayer);
```

### Getting clan KDR
```java
double clanKdr = clans.getKDR(clan);
```
### Getting clan kills
```java
int clanKills = clans.getKills(clan);
```

### Getting clan deaths
```java
int clanDeaths = clans.getDeaths(clan);
```


## Using the ClanPlayer object API
In this section you will find examples of using the ClanPlayer object API.

### Getting player role
```java
Roles role = cPlayer.getRole();
```

### Checking if the player has a clan
```java
if (cPlayer.hasClan()) { //has clan }
```

### Getting player clan
```java
Clan clan = cPlayer.getClan();
```

### Getting player kills
```java
int kills = cPlayer.getKills();
```

### Getting player deaths
```java
int deaths = cPlayer.getDeaths();
```


## Using the Clan object API
In this section you will find examples of using the Clan object API.

### Getting clan leader
```java
String leader = clan.getLeader();
```

### Getting the date the clan was created
```java
Date date = clan.getDate();
```

### Getting clan tag
```java
String tag = clan.getTag();
```

### Getting clan colored tag
```java
String coloredTag = clan.getColoredTag();
```

### Getting clan name
```java
String name = clan.getName();
```

### Getting clan members list
```java
List<String> members = clan.getMembers();
```

### Getting clan money
```java
double money = clan.getMoney();
```

### Getting clan home
```java
Location home = clan.getHome();
```

### Getting clan chest items
```java
List<ItemStack> items = clan.getItems();
```

### Getting clan allies
```java
List<String> allies = clan.getAllies();
```

### Getting clan rivals
```java
List<String> rivals = clan.getRivals();
```


## Events
In this section you will find all the cancelable and non-cancelable events of the clan.

### Cancelable:
- ```BankDepositEvent``` - When a player deposits money in the bank.
- ```BankWithdrawEvent``` - When a player withdraws money from the bank.
- ```ChestOpenEvent``` - When a player opens the clan's chest.
- ```HomeDeleteEvent``` - When a player deletes the base of the clan.
- ```HomeGoEvent``` - When a player teleports to the base of the clan.
- ```HomeSetEvent``` - When a player sets the base of the clan.
- ```ToggleAllyFriendlyFireEvent``` - When a player activates / deactivates friendly fire for clan allies.
- ```ToggleMemberFriendlyFireEvent``` - When a player activates / deactivates friendly fire for clan members.

### Non-cancelable:
- ```ClanCreateEvent``` - When a player creates a clan.
- ```ClanDisbandEvent``` - When a player breaks a clan.
- ```ClanJoinEvent``` - When a player joins a clan.
- ```ClanLeaveEvent``` - When a player leaves one.
- ```ModTagEvent``` - When a player changes the color of the clan tag.
