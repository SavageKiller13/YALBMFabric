package com.savagekiller13.yalbm.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.LuckEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LuckEnchantment.class)
public class MixinFortuneLevel {

	@Inject(method = "getMaxLevel()I", at = @At("RETURN"), cancellable = true)
	private void injected(CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(10);
	}

}
