package club.someoneice.withthursday.item;

import club.someoneice.withthursday.WithThursday;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class Knife extends SwordItem {
    public Knife() {
        super(Tiers.IRON, 3, -2.4F, (new Item.Properties()).tab(WithThursday.TAB).durability(80).setNoRepair());
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack Knife = new ItemStack(this);
        Knife.setDamageValue(itemstack.getDamageValue() + 1);
        if (Knife.getDamageValue() >= Knife.getMaxDamage()) return ItemStack.EMPTY;
        return Knife;
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }
}
