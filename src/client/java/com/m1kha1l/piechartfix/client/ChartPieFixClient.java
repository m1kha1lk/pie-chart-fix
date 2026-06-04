package com.m1kha1l.piechartfix.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChartPieFixClient implements ClientModInitializer {
	public static final String MOD_ID = "chart-pie-fix";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {

		LOGGER.info("Pie chart fix mod is loaded");
	}
}