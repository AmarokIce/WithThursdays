package club.someoneice.withthursday;

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
        if (event.getEntity() == null) {
            return;
        }

        if (event.getEntity() instanceof Chicken) {
            this.dropItem(event, ItemRegister.ChickenWings.get(), ItemRegister.CookedChickenWings.get());
            this.dropItem(event, ItemRegister.ChickenWings.get(), ItemRegister.CookedChickenWings.get());
        }
    }

    public void dropItem(LivingDropsEvent event, Item meat, Item cook) {
        if (event.getEntity().isOnFire()) {
            event.getDrops().add(new ItemEntity(event.getEntity().level, event.getEntity().getX(),
                    event.getEntity().getY(), event.getEntity().getZ(), new ItemStack(cook)));
        } else {
            event.getDrops().add(new ItemEntity(event.getEntity().level, event.getEntity().getX(),
                    event.getEntity().getY(), event.getEntity().getZ(), new ItemStack(meat)));
        }
    }
}
