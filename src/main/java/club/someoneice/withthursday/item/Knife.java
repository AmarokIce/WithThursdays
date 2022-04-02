package club.someoneice.withthursday.item;

import club.someoneice.withthursday.WithThursday;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

//TODO - I will create a tab for this.
public class Knife extends Item {
    public Knife() {
        super(new Item.Properties().tab(WithThursday.TAB).durability(20));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }

}
