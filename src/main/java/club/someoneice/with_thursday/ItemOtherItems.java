package club.someoneice.with_thursday;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemOtherItems extends Item {
    public ItemOtherItems(String name) {
        this.setTextureName(ItemUtil.getTextureName(name));
        this.setUnlocalizedName(name);
        this.setCreativeTab(WithThursdayMain.Chicken);

        GameRegistry.registerItem(this, name, WithThursdayMain.MODID);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        return itemStack;
    }
}
