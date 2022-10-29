package club.someoneice.with_thursday;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EntityEventHelper {
    @SubscribeEvent
    public void onEventDeath(EntityEvent event) {
        if (event.entity instanceof EntityChicken && event.entity.isDead) {
            dropItem((LivingDropsEvent) event, ItemInit.RawChickenWings, ItemInit.CookedChickenWings);
            dropItem((LivingDropsEvent) event, ItemInit.RawChickenWings, ItemInit.CookedChickenWings);
        }
    }

    public void dropItem(LivingDropsEvent event, Item meat, Item cook) {
        if (event.entityLiving.canRenderOnFire()) {
            event.drops.add(new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, new ItemStack(cook)));
        } else {
            event.drops.add(new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, new ItemStack(meat)));
        }
    }
}
