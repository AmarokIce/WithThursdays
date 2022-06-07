package club.someoneice.with_thursday;

import club.someoneice.with_thursday.init.ItemList;
import club.someoneice.with_thursday.init.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
    public static final String MODID = "with_thursday";
    public static final String VERSION = "1";
    public static CreativeTabs WithThursday = new CreativeTabs("WithThursday") {

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemList.foodSunEgg);
        }
    };

    @Mod.Instance(Main.MODID)
    public static Main instance;

    public Main() {
        //ItemList.init();
        MinecraftForge.EVENT_BUS.register(this);
        //MinecraftForge.EVENT_BUS.register(new ItemRegister());
    }



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ItemList.init();
        MinecraftForge.EVENT_BUS.register(new ItemRegister());

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
