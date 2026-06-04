package com.m1kha1l.piechartfix.client.mixin;

import net.minecraft.client.KeyboardHandler;
import net.minecraft.client.Minecraft;
//import net.minecraft.client.gui.components.debugchart.ProfilerPieChart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// keyboard mixin
@Mixin(KeyboardHandler.class)
public class KeyboardHandlerMixin {
	@ModifyArg(
			method = "keyPress",
		at = @At(
				value = "INVOKE",
				target = "Lnet/minecraft/client/gui/components/debugchart/ProfilerPieChart;profilerPieChartKeyPress(I)V")
	)
	private int modifyPiePress(int index){
		if( Minecraft.getInstance().hasShiftDown() && index != -1)
		{
			return index + 10;
		}
		return index;
	}
}