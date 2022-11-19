package club.someoneice.with_thursday

import net.minecraft.entity.ItemEntity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.UseAction
import net.minecraft.world.World

class FoodBase(itemSettings: Settings, private val returnItem: ItemStack, private val useAction: UseAction): Item(itemSettings) {
    override fun getUseAction(stack: ItemStack?): UseAction {
        return useAction
    }

    override fun finishUsing(stack: ItemStack?, world: World, user: LivingEntity): ItemStack {
        if (stack != null) {
            if (!(user as PlayerEntity).inventory.insertStack(returnItem)) {
                world.spawnEntity(ItemEntity(world, user.x, user.y, user.z, returnItem))
            }
        }
        return super.finishUsing(stack, world, user)
    }
}