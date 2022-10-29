package club.someoneice.with_thursday;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemUtil extends ItemFood {
    public static EnumAction action;
    public static ItemStack item;
    public ItemUtil(String name, int hunger, float sta, boolean dogfood, EnumAction action, ItemStack item) {
        super(hunger, sta, dogfood);
        this.setAlwaysEdible();
        this.setTextureName(getTextureName(name));
        this.setUnlocalizedName(name);
        this.setCreativeTab(WithThursdayMain.Chicken);

        this.action = action;
        this.item = item;

        GameRegistry.registerItem(this, name, WithThursdayMain.MODID);
    }

    public ItemUtil(String name, int hunger, float sta, boolean dogfood, EnumAction action) {
        this(name, hunger, sta, dogfood, action, new ItemStack(Blocks.air));
    }

    public ItemUtil(String name, int hunger, float sta, boolean dogfood) {
        this(name, hunger, sta, dogfood, EnumAction.eat, new ItemStack(Blocks.air));
    }

    @Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.eat;
    }

    @Override
    public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
        super.onEaten(itemStack, world, player);
        if (itemStack.stackSize - 1 != 0) {
            player.inventory.addItemStackToInventory(this.item);
        }
        return itemStack.stackSize <= 0 ? this.item : itemStack;
    }

    public static String getTextureName(String name) {
        return WithThursdayMain.MODID + ":" + name;
    }
}
