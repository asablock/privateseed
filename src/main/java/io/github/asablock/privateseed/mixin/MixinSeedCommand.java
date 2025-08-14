package io.github.asablock.privateseed.mixin;

import net.minecraft.server.command.SeedCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(SeedCommand.class)
public class MixinSeedCommand {
    @ModifyVariable(method = "method_13618", at = @At("HEAD"), argsOnly = true)
    private static boolean modifyDedicated(boolean value) {
        return true;
    }
}
