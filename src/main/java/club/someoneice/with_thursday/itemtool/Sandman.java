package club.someoneice.with_thursday.itemtool;

import club.someoneice.with_thursday.init.ItemList;
import net.minecraft.item.Item;

public class Sandman extends Item {
    public Sandman(String name){
        this.setUnlocalizedName(name);
        this.setRegistryName(name);

        ItemList.ITEM_LIST.add(this);
    }
}