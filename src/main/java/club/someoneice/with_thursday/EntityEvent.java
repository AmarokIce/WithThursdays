package club.someoneice.with_thursday;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EntityEvent {
    @SubscribeEvent
    public void onEntityDeath(LivingDropsEvent event) throws Exception {
        if (event.entityLiving == null)
            return;

        if (event.entityLiving instanceof EntityChicken)
            this.dropMeat(event, ItemInit.RawChickenWings, ItemInit.CookedChickenWings);

    }

    public void dropMeat(LivingDropsEvent event, Item meat, Item cook) {
        if (event.entityLiving.isImmuneToFire())
            event.drops.add(new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY,event.entityLiving.posZ, new ItemStack(cook, 2)));
        else
            event.drops.add(new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY,event.entityLiving.posZ, new ItemStack(meat, 2)));
    }
}
