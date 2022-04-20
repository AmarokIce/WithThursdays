package club.someoneice.withthursday;

import club.someoneice.withthursday.event.ModEvent;
import club.someoneice.withthursday.init.ItemRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("with_thursday")
public class WithThursday {
    public static final String MODID = "with_thursday";
    public static final String Version = "r2";
    public static final Logger LOGGER = LogManager.getLogger("[with_thursday]");

    public static final CreativeModeTab TAB = new CreativeModeTab("WithThursday") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegister.BaconPaNini.get());
        }
    };

    public WithThursday() {
        MinecraftForge.EVENT_BUS.register(this);

        ItemRegister.ItemList.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(new ModEvent());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }


    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }

    public static Logger getLogger()
    {
        return LOGGER;
    }
}
