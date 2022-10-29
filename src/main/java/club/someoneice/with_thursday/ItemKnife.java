package club.someoneice.with_thursday;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemKnife extends Item {
    public ItemKnife(String name) {
        this.setMaxDamage(80);
        this.setMaxStackSize(1);
        this.setNoRepair();
        // this.setContainerItem(ItemInit.Knife);

        this.setTextureName(ItemUtil.getTextureName(name));
        this.setUnlocalizedName(name);
        this.setCreativeTab(WithThursdayMain.Chicken);

        GameRegistry.registerItem(this, name, WithThursdayMain.MODID);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack item = itemStack;
        if (itemStack.getItemDamage() <= itemStack.getMaxDamage())
            item.setItemDamage(item.getItemDamage() + 1);
        return item;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }
}