package club.someoneice.with_thursday;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = WithThursdayMain.MODID, version = WithThursdayMain.VERSION)
public class WithThursdayMain {
    public static final String MODID = "with_thursday";
    public static final String VERSION = "1.0";

    public static final CreativeTabs Chicken = new CreativeTabs("tab_withthursday") {
        public Item getTabIconItem() {
            return ItemInit.ChickenBucket;
        }
    };
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        ItemInit.init();
        ItemInit.recipe();
        MinecraftForge.EVENT_BUS.register(new EntityEvent());
        FMLCommonHandler.instance().bus().register(new EntityEvent());
    }
}
