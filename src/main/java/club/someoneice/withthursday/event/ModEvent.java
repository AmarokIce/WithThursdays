package club.someoneice.withthursday.event;

import club.someoneice.withthursday.init.ItemRegister;
import club.someoneice.withthursday.WithThursday;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = WithThursday.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvent {

    @SubscribeEvent
    public void onLifeDrop(LivingDropsEvent event) {
        if (event.getEntityLiving() == null) {
            return;
        }

        if (event.getEntityLiving() instanceof Chicken) {
            this.dropItem(event, ItemRegister.ChickenWings.get(), ItemRegister.CookedChickenWings.get());
            this.dropItem(event, ItemRegister.ChickenWings.get(), ItemRegister.CookedChickenWings.get());
            return;
        }
    }

    public void dropItem(LivingDropsEvent event, Item meat, Item cook) {
        if (event.getEntityLiving().isOnFire()) {
            event.getDrops().add(new ItemEntity(event.getEntityLiving().level, event.getEntityLiving().getX(),
                    event.getEntityLiving().getY(), event.getEntityLiving().getZ(), new ItemStack(cook)));
        } else {
            event.getDrops().add(new ItemEntity(event.getEntityLiving().level, event.getEntityLiving().getX(),
                    event.getEntityLiving().getY(), event.getEntityLiving().getZ(), new ItemStack(meat)));
        }
    }
}
