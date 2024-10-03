package net.lilyofthevoid.nullbound;

import net.fabricmc.api.ModInitializer;

import net.lilyofthevoid.nullbound.block.ModBlocks;
import net.lilyofthevoid.nullbound.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// Hoping this all works...
public class Nullbound implements ModInitializer {
	public static final String MOD_ID = "nullbound";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}