package club.someoneice.with_thursday.itemtool;

import club.someoneice.paster_fix.init.ItemList;
import club.someoneice.with_thursday.Main;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Knife extends Item {
    public Knife(String name){
        this.setMaxDamage(20);
        this.setMaxStackSize(1);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.pineapple);
        this.setContainerItem(this);

        ItemList.ITEM_LIST.add(this);
    }

    @Override
    public int getMaxDamage(ItemStack itemStack) {
        return 0;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemstack) {
        return 0;
    }

    @Override
    public float getDestroySpeed(ItemStack itemStack, IBlockState blockState) {
        return 1f;
    }

}
