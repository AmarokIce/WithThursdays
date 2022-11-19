package club.someoneice.with_thursday

import net.minecraft.item.Item

class ItemToolBase(settings: Settings): Item(settings) {
    override fun hasRecipeRemainder(): Boolean {
        return true
    }
}