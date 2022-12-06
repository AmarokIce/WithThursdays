package club.someoneice.withthursday;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

public class Itemlist {
    public static Item item() {
        Item.Properties Properties = new Item.Properties();
        Properties.tab(WithThursday.TAB);
        FoodProperties.Builder Builder = new FoodProperties.Builder();
        return new Item(Properties);
    }

    public static Item food(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Properties Properties = new Properties();
        Properties.tab(WithThursday.TAB);

        Builder Builder = new Builder();
        Builder.nutrition(nutrition);
        Builder.saturationMod(saturation);

        if (isMeat) Builder.meat();
        if (fastFood) Builder.fast();
        if (alwaysEat) Builder.alwaysEat();

        Properties.food(Builder.build());
        return new Item(Properties);
    }

    public static Item Drink(int nutrition, float saturation, boolean isMeat, boolean fastFood, boolean alwaysEat) {
        Properties Properties = new Properties();
        Properties.tab(WithThursday.TAB);
        Builder Builder = new Builder();
        Builder.nutrition(nutrition);
        Builder.saturationMod(saturation);
        if (isMeat) {
            Builder.meat();
        }
        if (fastFood) {
            Builder.fast();
        }
        if (alwaysEat) {
            Builder.alwaysEat();
        }
        Properties.food(Builder.build());
        return new DrinkItem(Properties);
    }
}