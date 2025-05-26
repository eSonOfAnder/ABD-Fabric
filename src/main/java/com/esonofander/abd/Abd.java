package com.esonofander.abd;

import com.esonofander.abd.block.AbdBlocks;
import com.esonofander.abd.item.AbdItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Abd implements ModInitializer {
	public static final String MOD_ID = "abd";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AbdBlocks.initialize();
		AbdItems.initialize();
	}
}