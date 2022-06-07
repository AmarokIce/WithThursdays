package club.someoneice.with_thursday.itemtool;

import club.someoneice.with_thursday.Main;
import club.someoneice.with_thursday.init.ItemList;
import net.minecraft.item.Item;

public class ItemItems extends Item {
    public ItemItems(String name){
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Main.WithThursday);

        ItemList.ITEM_LIST.add(this);
    }
}