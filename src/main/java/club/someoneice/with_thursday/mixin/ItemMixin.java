package club.someoneice.with_thursday.mixin;

import club.someoneice.with_thursday.ItemToolBase;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Item.class)
public abstract class ItemMixin {
    @Mutable
    @Shadow @Final
    private Item recipeRemainder;

    @Inject(method = "<init>", at = {@At("TAIL")})
    public void finishCrafting(Item.Settings settings, CallbackInfo ci) {
        Item thisInstance = (Item)(Object)this;
        if (thisInstance instanceof ItemToolBase) {
            this.recipeRemainder = thisInstance;
        }
    }
}
