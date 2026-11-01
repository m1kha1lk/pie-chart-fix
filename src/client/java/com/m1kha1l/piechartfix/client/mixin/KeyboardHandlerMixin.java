package com.m1kha1l.piechartfix.client.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.debugchart.ProfilerPieChart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

// keyboard mixin
@Mixin(ProfilerPieChart.class)
public class KeyboardHandlerMixin {
	@ModifyVariable(
			method = "profilerPieChartKeyPress",
			at = @At("HEAD"),
			argsOnly = true
	)
	private int modifyPiePress(int index){
		if( Minecraft.getInstance().hasShiftDown() && index != -1)
		{
			return index + 10;
		}
		return index;
	}
}