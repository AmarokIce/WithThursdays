package club.someoneice.withthursday.init;

import club.someoneice.withthursday.item.OrleansRoastedWings;
import club.someoneice.withthursday.tool.DrinkItem;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.food.FoodProperties;
import club.someoneice.withthursday.WithThursday;
import club.someoneice.withthursday.item.Knife;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.UseAnim;

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
        return new DrinkItem(Properties, UseAnim.DRINK);
    }

    public static Item Knife() {
        return new Knife();
    }

    public static Item OrleansRoastedWings() {
        return new OrleansRoastedWings();
    }


}