package net.swutm.symbolsofukraine;

import net.fabricmc.api.ModInitializer;
import net.swutm.symbolsofukraine.painting.ModPaintings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class symbolsofukraine implements ModInitializer {
	public static final String MOD_ID = "symbolsofukraine";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModPaintings.registerPaintings();
	}
}
