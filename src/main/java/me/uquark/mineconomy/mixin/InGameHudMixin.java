package me.uquark.mineconomy.mixin;

import me.uquark.mineconomy.MineconomyClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public abstract class InGameHudMixin extends DrawableHelper {
    @Inject(method = "render", at = @At("HEAD"))
    public void render(float tickDelta, CallbackInfo info) {
        if (!MinecraftClient.getInstance().options.debugEnabled)
            MineconomyClient.balanceHud.render();
    }
}
