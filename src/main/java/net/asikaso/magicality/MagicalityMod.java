package net.asikaso.magicality;

import net.asikaso.magicality.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicalityMod implements ModInitializer {
	public static final String MOD_ID = "magicality";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		LOGGER.info("Hello Magic World!");
	}
}