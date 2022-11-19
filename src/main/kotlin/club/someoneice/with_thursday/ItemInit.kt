package club.someoneice.with_thursday

import net.minecraft.block.Blocks
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.Item.Settings
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import net.minecraft.util.UseAction
import net.minecraft.util.registry.Registry

object ItemInit {
    val ICON: Item = Item(Settings())

    fun init() {
        Registry.register(Registry.ITEM, Identifier(ThursdayMain.modid, "icon"), ICON)

        ToolItem("knife")
        ToolItem("grinder")

        Item("crumbs")
        Item("orleans")
        Item("coffee_flour")

        ItemFood("beaten_eggs", 0, 0.1F, false, false, true, UseAction.DRINK)
        ItemFood("chocolate_bar", 2, 0.3F, false, false, true)
        ItemFood("cheese", 2, 0.3F, false, false, true)

        ItemFood("chicken_wings", 2, 0.2F, true, false, true)
        ItemFood("cooked_chicken_wings", 6, 0.2F, true, false, true)
        ItemFood("chicken_breast", 2, 0.2F, true, false, true)
        ItemFood("cooked_chicken_breast", 2,0.2F,true,false,true)
        ItemFood("diced_chicken", 6,0.4F,true,false,true)
        ItemFood("cooked_diced_chicken", 1,0.0F,true,true,true)
        ItemFood("original_recipe", 2,0.1F,true,true,true)
        ItemFood("chicken_bucket", 10,0.9F,true,false,true)
        ItemFood("orleans_roasted_wings", 18,1.0F,false,false,true)
        ItemFood("chicken_pop", 7,0.5F,true,false,true)
        ItemFood("chicken_nugget", 4,0.2F,true,false,true)
        ItemFood("spicy_squid", 4,0.2F,true,false,true)
        ItemFood("corn_salad", 6,0.5F,true,false,true)
        ItemFood("potato_chips", 2,0.2F,true,false,true)
        ItemFood("french_fries", 6,0.2F,true,false,true)
        ItemFood("mashed_potato", 6,0.2F,true,false,true)
        ItemFood("sun_egg", 2,0.2F,false,true,true)
        ItemFood("pnn_bread", 2,0.2F,false,true,true)
        ItemFood("potato_pie", 6,0.8F,false,true,true)
        ItemFood("thuringia_sausage", 2,0.2F,false,true,true)
        ItemFood("flesh_bone", 3,0.2F,true,true,true)
        ItemFood("bacon", 3,0.2F,true,true,true)
        ItemFood("breakfast", 12,1.1F,false,false,true)
        ItemFood("bacon_panini", 9,0.7F,false,false,true)
        ItemFood("chicken_panini", 9,0.7F,false,false,true)
        ItemFood("beef_panini", 9,0.7F,false,false,true)
        ItemFood("pork_panini", 9,0.7F,false,false,true)
        ItemFood("etc_burger", 7,0.7F,false,false,true)
        ItemFood("chicken_burger", 7,0.7F,false,false,true)
        ItemFood("bacon_chicken_burger", 7,0.7F,false,false,true)
        ItemFood("orleans_burger", 7,0.7F,false,false,true)
        ItemFood("bbq_burger", 7,0.7F,false,false,true)
        ItemFood("cp_burger", 14,1.4F,false,false,true)

        ItemFood("cola", 2,0.2F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("apple_juice", 2,0.2F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("sparkling_apple_juice", 2,0.2F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("ice_cream_float", 2,0.2F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("classic_coffee", 2,0.2F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("usa_cofe", 2,0.2F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("cappuccino", 2,0.2F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("mocha", 2,0.2F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("milk_tea", 4,0.6F,false,false,true, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)
        ItemFood("sundae", 3,0.3F,false,true,false, ItemStack(Items.GLASS_BOTTLE), UseAction.DRINK)


    }

    private fun ToolItem(name: String) {
        val set = Settings()
        set.group(ThursdayMain.CHICKEN_GROUP)
        set.maxCount(1)
        set.maxDamage(80)

        registryItem(name, ItemToolBase(set))
    }


    private fun Item(name: String) {
        val set = Settings()
        set.group(ThursdayMain.CHICKEN_GROUP)

        registryItem(name, Item(set))
    }

    private fun ItemFood(name: String, hunger: Int, saturation: Float, wolf: Boolean, fast: Boolean, alwaysEat: Boolean) {
        val set = Settings()
        set.group(ThursdayMain.CHICKEN_GROUP)

        val builder: FoodComponent.Builder = FoodComponent.Builder()
        builder.hunger(hunger)
        builder.saturationModifier(saturation)
        if (wolf) builder.meat()
        if (fast) builder.snack()
        if (alwaysEat) builder.alwaysEdible()

        set.food(builder.build())

        registryItem(name, FoodBase(set, ItemStack(Blocks.AIR), UseAction.EAT))
    }

    private fun ItemFood(name: String, hunger: Int, saturation: Float, wolf: Boolean, fast: Boolean, alwaysEat: Boolean, useAction: UseAction) {
        val set = Settings()
        set.group(ThursdayMain.CHICKEN_GROUP)

        val builder: FoodComponent.Builder = FoodComponent.Builder()
        builder.hunger(hunger)
        builder.saturationModifier(saturation)
        if (wolf) builder.meat()
        if (fast) builder.snack()
        if (alwaysEat) builder.alwaysEdible()

        set.food(builder.build())

        registryItem(name, FoodBase(set, ItemStack(Blocks.AIR), useAction))
    }

    private fun ItemFood(name: String, hunger: Int, saturation: Float, wolf: Boolean, fast: Boolean, alwaysEat: Boolean, item: ItemStack, useAction: UseAction) {
        val set = Settings()
        set.group(ThursdayMain.CHICKEN_GROUP)

        val builder: FoodComponent.Builder = FoodComponent.Builder()
        builder.hunger(hunger)
        builder.saturationModifier(saturation)
        if (wolf) builder.meat()
        if (fast) builder.snack()
        if (alwaysEat) builder.alwaysEdible()

        set.food(builder.build())

        registryItem(name, FoodBase(set, item, useAction))
    }

    private fun registryItem(name: String, itemType: Item) {
        Registry.register(Registry.ITEM, Identifier(ThursdayMain.modid, name), itemType)
    }
}