package club.someoneice.withthursday.tool;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import static net.minecraft.world.item.UseAnim.DRINK;

public class DrinkItem extends Item {

    public DrinkItem(Item.Properties Properties) {
        super(Properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack item, Level LV, LivingEntity player) {
        if (player instanceof Player) {
            if (!((Player) player).getInventory().add(new ItemStack(Items.GLASS_BOTTLE))) {
                ((Player) player).drop(new ItemStack(Items.GLASS_BOTTLE), false);
            }
        }
        return super.finishUsingItem(item, LV, player);
    }
}
