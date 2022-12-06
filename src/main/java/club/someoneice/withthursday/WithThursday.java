package club.someoneice.withthursday;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@Mod(WithThursday.MODID)
public class WithThursday {
    public static final String MODID = "with_thursday";
    public static final String Version = "r5";

    public static final CreativeModeTab TAB = new CreativeModeTab("WithThursday") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegister.BaconPaNini.get());
        }
    };

    public WithThursday() {
        ItemRegister.ItemList.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(new ModEvent());
        MinecraftForge.EVENT_BUS.register(this);
    }
}
