package club.someoneice.with_thursday

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

class ThursdayMain {
    companion object {
        const val modid: String = "with_thursday"

        val CHICKEN_GROUP: ItemGroup =
            FabricItemGroupBuilder.build(Identifier(modid, "with_thursday")) {
                ItemStack(ItemInit.ICON)
        }
    }
}

fun init() {
    ItemInit.init()
}