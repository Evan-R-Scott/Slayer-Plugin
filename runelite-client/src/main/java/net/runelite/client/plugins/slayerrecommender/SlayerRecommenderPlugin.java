package net.runelite.client.plugins.slayerrecommender;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Slayer Monster Recommender",
		description = "A plugin intended to optimize slayer tasks by recommending actions to achieve optimal gp/hr and/or xp/hr rates.",
		tags = {"slayer", "recommendation", "helper", "recommender", "task"}
)
public class SlayerRecommenderPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private SlayerRecommenderConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
//		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
//		{
//			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
//		}
	}

	@Provides
	SlayerRecommenderConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SlayerRecommenderConfig.class);
	}

	/*
	Super simple example to follow for using the configurations created to display our recommendations
	in the plugin panel
	if (config.bestXP()) {
		display the recommendations to achieve best xp/hr rates
	}
	if (config.bestGP()) {
		display the recommendations to achieve best gp/hr rates
	}
	if (config.perHourRate()) {
		display the rates we calculated for the monsters
	}
	if (config.monsterTips()) {
		display the helpful info (see Config file)
	}
	 */
}
