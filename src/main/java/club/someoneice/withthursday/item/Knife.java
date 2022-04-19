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
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack Knife = new ItemStack(this);
        Knife.setDamageValue(itemstack.getDamageValue() + 1);
        if (Knife.getDamageValue() >= Knife.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return Knife;
    }
}
