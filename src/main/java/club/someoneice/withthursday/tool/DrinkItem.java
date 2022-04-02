package club.someoneice.withthursday.tool;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class DrinkItem extends Item {
    UseAnim type;

    public DrinkItem(Item.Properties Properties, UseAnim type) {
        super(Properties);
        this.type = type;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return this.type;
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
