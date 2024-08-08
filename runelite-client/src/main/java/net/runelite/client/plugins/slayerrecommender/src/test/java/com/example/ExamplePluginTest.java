package net.runelite.client.plugins.slayerrecommender.src.test.java.com.example;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.slayerrecommender.SlayerRecommenderPlugin;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(SlayerRecommenderPlugin.class);
		RuneLite.main(args);
	}
}