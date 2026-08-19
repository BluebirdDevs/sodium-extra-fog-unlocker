package bluebird.mixin;

import me.flashyreese.mods.sodiumextra.client.fog.FogDistanceHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FogDistanceHelper.class)
@Environment(EnvType.CLIENT)
public class FogDistanceHelperMixin {
    @Inject(method = "isLocalWorldAllowedForProtectedGameplayFog", at = @At("HEAD"), cancellable = true)
    private static void alwaysEnable(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
