package net.runelite.client.plugins.slayerrecommender;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("slayerrecommender")
public interface SlayerRecommenderConfig extends Config
{
	@ConfigItem(
			position = 1,
			keyName = "bestXP",
			name = "Best XP/HR",
			description = "Display the monsters to kill for this slayer task to achieve the best xp/hr rates."
	)
	default boolean bestXP()
	{
		return true;
	}

	@ConfigItem(
			position = 2,
			keyName = "bestGP",
			name = "Best GP/HR",
			description = "Display the monsters to kill for this slayer task to achieve the best gp/hr rates."
	)
	default boolean bestGP()
	{
		return true;
	}

	@ConfigItem(
			position = 3,
			keyName = "perHourRate",
			name = "Display calculated rates",
			description = "Display the xp/hr and gp/hr rates calculated for the recommended slayer monsters."
	)
	default boolean perHourRate() {return true;}

	@ConfigItem(
			position = 4,
			keyName = "monsterTips",
			name = "Show helpful tips",
			description = "Display the best location to kill this slayer monster, items required to kill the slayer monster, and the attack style it is weak to."
	)
	default boolean monsterTips() {return true;}

}

