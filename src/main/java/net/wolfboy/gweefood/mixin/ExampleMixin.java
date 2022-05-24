package net.wolfboy.gweefood.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.wolfboy.gweefood.GweeFood;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		GweeFood.LOGGER.info("Welcome To Gwee's Baking, have a Snack!");
	}
}
