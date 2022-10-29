package club.someoneice.with_thursday;

import cpw.mods.fml.common.registry.GameRegistry;
import joptsimple.internal.Objects;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemInit {
    public static Item Knife;
    public static Item Grinder;
    public static Item Orleans;
    public static Item Chocolate;
    public static Item Crumbs;
    public static Item CoffeeFlour;

    public static Item Beaten;
    public static Item Cheese;

    public static Item RawDicedChicken;
    public static Item ChickenNuggets;
    public static Item RawChickenWings;
    public static Item CookedChickenWings;
    public static Item RawChickenBreast;
    public static Item CookedChickenBreast;

    public static Item PopcornChicken;
    public static Item CookedDicedChicken;
    public static Item OriginalRecipe;
    public static Item ChickenBucket;
    public static Item OrleansRoastedWings;

    public static Item MashedPotato;
    public static Item PotatoChips;
    public static Item FrenchFries;
    public static Item SunEgg;
    public static Item PaNiNiBread;
    public static Item PotatoPie;
    public static Item ThuringianSausage;
    public static Item FleshBone;
    public static Item Bacon;
    public static Item BreakfastCombo;

    public static Item BeefPaNini;
    public static Item PorkPaNini;
    public static Item ChickenPaNini;
    public static Item BaconPaNini;

    public static Item ExtraTastyCrispyBurger;
    public static Item BaconChickenBurger;
    public static Item ChickenBurger;
    public static Item BBQPorkBurger;
    public static Item OrleansChickenBurger;
    public static Item ChickPorkBurger;

    public static Item Sundae;
    public static Item Cola;
    public static Item MilkTea;
    public static Item American;
    public static Item SparklingAppleJuiceDrink;
    public static Item Mocha;
    public static Item AppleJuice;
    public static Item Cappuccino;
    public static Item ClassicCoffee;
    public static Item FloatCoffee;

    public static void init() {
        // TODO
        Knife = new ItemKnife("knife");
        Grinder = new ItemKnife("grinder");

        Orleans = new ItemOtherItems("orleans");
        Crumbs = new ItemOtherItems("crumbs");
        CoffeeFlour = new ItemOtherItems("coffee_flour");

        Chocolate = new ItemUtil("chocolate", 2, 0.3F, false);
        Beaten = new ItemUtil("beaten_eggs", 0, 0.1F, false);
        Cheese = new ItemUtil("cheese", 2, 0.3F, false);

        RawDicedChicken = new ItemUtil("diced_chicken", 1, 0.0F, true);
        CookedDicedChicken = new ItemUtil("cooked_diced_chicken", 2, 0.1F, true);
        RawChickenWings = new ItemUtil("chicken_wings", 2, 0.2F, true);
        CookedChickenWings = new ItemUtil("cooked_chicken_wings", 6, 0.2F, true);
        RawChickenBreast = new ItemUtil("chicken_breast", 2, 0.2F, true);
        CookedChickenBreast = new ItemUtil("cooked_chicken_breast", 6, 0.4F, true);

        PopcornChicken = new ItemUtil("chicken_pop", 7, 0.5F, true);
        ChickenNuggets = new ItemUtil("chicken_nugget", 4, 2, true);
        OriginalRecipe = new ItemUtil("original_recipe", 10, 1.6F, true);
        ChickenBucket = new ItemUtil("chicken_bucket", 18, 2.0F, true);
        OrleansRoastedWings = new ItemUtil("orleans_roasted_wings", 6, 0.4F, true); // TODO ...?

        MashedPotato = new ItemUtil("mashed_potato", 6, 0.2F, false);
        PotatoChips = new ItemUtil("potato_chips", 2, 0.2F, false);
        FrenchFries = new ItemUtil("french_fries", 6, 0.2F, false);
        SunEgg = new ItemUtil("sun_egg", 2, 0.2F, false);
        PaNiNiBread = new ItemUtil("pnn_bread", 2, 0.2F, false);
        PotatoPie = new ItemUtil("potato_pie", 6, 0.8F, false);
        ThuringianSausage = new ItemUtil("thuringia_sausage", 6, 0.2F, false);
        FleshBone = new ItemUtil("flesh_bone", 3, 0.2F, true);
        Bacon = new ItemUtil("bacon", 3, 0.2F, true);
        BreakfastCombo = new ItemUtil("breakfast", 12, 1.6F, false);

        BeefPaNini = new ItemUtil("beef_panini", 9, 0.7F, false);
        PorkPaNini = new ItemUtil("pork_panini", 9, 0.7F, false);
        ChickenPaNini = new ItemUtil("chicken_panini", 9, 0.7F, false);
        BaconPaNini = new ItemUtil("bacon_panini", 9, 0.7F, false);

        ExtraTastyCrispyBurger = new ItemUtil("etc_burger", 7, 0.7F, false);
        BaconChickenBurger = new ItemUtil("bacon_chicken_burger", 7, 0.7F, false);
        ChickenBurger = new ItemUtil("chicken_burger", 7, 0.7F, false);
        BBQPorkBurger = new ItemUtil("bbq_burger", 7, 0.7F, false);
        OrleansChickenBurger = new ItemUtil("orleans_burger", 7, 0.7F, false);
        ChickPorkBurger = new ItemUtil("cp_burger", 7, 0.7F, false);

        // Return Item Bottle.
        ItemStack bottle = new ItemStack(Items.glass_bottle);
        Sundae = new ItemUtil("sundae", 3, 0.3F, false, EnumAction.drink, bottle);
        Cola = new ItemUtil("cola", 2, 0.2F, false, EnumAction.drink, bottle);
        MilkTea = new ItemUtil("milk_tea", 4, 0.6F, false, EnumAction.drink, bottle);
        American = new ItemUtil("usa_cofe", 2, 0.2F, false, EnumAction.drink, bottle);
        SparklingAppleJuiceDrink = new ItemUtil("sparkling_apple_juice", 2, 0.2F, false, EnumAction.drink, bottle);
        Mocha = new ItemUtil("mocha", 2, 0.2F, false, EnumAction.drink, bottle);
        AppleJuice = new ItemUtil("apple_juice", 2, 0.2F, false, EnumAction.drink, bottle);
        Cappuccino = new ItemUtil("cappuccino", 2, 0.2F, false, EnumAction.drink, bottle);
        ClassicCoffee = new ItemUtil("classic_coffee", 2, 0.2F, false, EnumAction.drink, bottle);
        FloatCoffee = new ItemUtil("ice_cream_float", 2, 0.2F, false, EnumAction.drink, bottle);
    }

    public static void recipe() {
        for (int i = 0; i < 80; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.Crumbs, 6), new ItemStack(ItemInit.Knife, 1, i), Items.bread);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.Orleans, 6), new ItemStack(ItemInit.Knife, 1, i), ItemInit.Crumbs, Items.carrot, Items.golden_carrot);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.ChickenNuggets, 2), new ItemStack(ItemInit.Knife, 1, i), ItemInit.Crumbs, ItemInit.Orleans, ItemInit.CookedChickenBreast);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.MashedPotato, 1), new ItemStack(ItemInit.Knife, 1, i), Items.baked_potato, Items.paper);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.OrleansRoastedWings, 1), new ItemStack(ItemInit.Knife, 1, i), ItemInit.Crumbs, ItemInit.Orleans, ItemInit.CookedChickenWings);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.PopcornChicken, 1), new ItemStack(ItemInit.Knife, 1, i), ItemInit.Crumbs, ItemInit.Orleans, ItemInit.CookedDicedChicken, ItemInit.CookedDicedChicken, ItemInit.CookedDicedChicken, ItemInit.CookedDicedChicken, ItemInit.CookedDicedChicken);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.PotatoChips, 1), new ItemStack(ItemInit.Knife, 1, i), Items.potato);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.OriginalRecipe, 1), new ItemStack(ItemInit.Knife, 1, i), ItemInit.Crumbs, ItemInit.CookedChickenBreast, ItemInit.CookedChickenWings, ItemInit.Beaten);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.Bacon, 1), new ItemStack(ItemInit.Knife, 1, i), ItemInit.Orleans, Items.porkchop, Items.porkchop);

            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.CoffeeFlour, 2), new ItemStack(ItemInit.Grinder, 1, i), new ItemStack(Items.dye, 1, 3), new ItemStack(Items.dye, 1, 3));

            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.RawChickenBreast, 3), new ItemStack(ItemInit.Knife, 1, i), Items.chicken);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.RawDicedChicken, 6), new ItemStack(ItemInit.Knife, 1, i), ItemInit.RawChickenBreast);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.CookedChickenBreast, 3), new ItemStack(ItemInit.Knife, 1, i), Items.cooked_chicken);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.CookedDicedChicken, 6), new ItemStack(ItemInit.Knife, 1, i), ItemInit.CookedChickenBreast);

            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.BaconChickenBurger, 1), new ItemStack(ItemInit.Knife, 1, i), Items.bread, ItemInit.Bacon, ItemInit.CookedChickenBreast, ItemInit.Cheese, ItemInit.SunEgg);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.ExtraTastyCrispyBurger, 1), new ItemStack(ItemInit.Knife, 1, i), Items.bread, ItemInit.CookedChickenWings, ItemInit.Cheese, ItemInit.Orleans);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.OrleansChickenBurger, 1), new ItemStack(ItemInit.Knife, 1, i), Items.bread, ItemInit.OrleansRoastedWings, ItemInit.Cheese, ItemInit.SunEgg);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.ChickPorkBurger, 1), new ItemStack(ItemInit.Knife, 1, i), Items.bread, ItemInit.CookedChickenBreast, Items.cooked_porkchop, ItemInit.SunEgg);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.BBQPorkBurger, 1), new ItemStack(ItemInit.Knife, 1, i), Items.bread, Items.cooked_porkchop, ItemInit.SunEgg);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.ChickenBurger, 1), new ItemStack(ItemInit.Knife, 1, i), Items.bread, ItemInit.CookedChickenBreast, ItemInit.SunEgg);

            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.BaconPaNini, 1), new ItemStack(ItemInit.Knife, 1, i), ItemInit.PaNiNiBread, ItemInit.Bacon, ItemInit.Cheese, ItemInit.SunEgg);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.PorkPaNini, 1), new ItemStack(ItemInit.Knife, 1, i), Items.cooked_porkchop, ItemInit.Cheese, ItemInit.SunEgg);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.BeefPaNini, 1), new ItemStack(ItemInit.Knife, 1, i), Items.cooked_beef, ItemInit.Cheese, ItemInit.SunEgg);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemInit.ChickenPaNini, 1), new ItemStack(ItemInit.Knife, 1, i), ItemInit.CookedChickenBreast, ItemInit.Cheese, ItemInit.SunEgg);
        }

        ShapelessRecipe(ItemInit.Beaten, Items.egg);
        ShapelessRecipe(ItemInit.Cheese, Items.sugar, Items.sugar, Items.milk_bucket, Items.milk_bucket);
        ShapelessRecipe(ItemInit.Chocolate, Items.sugar, Items.sugar, new ItemStack(Items.dye, 1, 3), new ItemStack(Items.dye, 1, 3));
        ShapelessRecipe(ItemInit.ChickenBucket, ItemInit.OriginalRecipe, ItemInit.OriginalRecipe, ItemInit.PopcornChicken, ItemInit.OrleansRoastedWings, ItemInit.ChickenNuggets);
        ShapelessRecipe(ItemInit.PaNiNiBread, Items.wheat, Items.wheat, Items.egg);
        ShapelessRecipe(ItemInit.FleshBone, Items.stick, ItemInit.CookedDicedChicken, ItemInit.CookedDicedChicken);
        ShapelessRecipe(ItemInit.Bacon, ItemInit.Orleans, Items.porkchop, Items.porkchop);
        ShapelessRecipe(ItemInit.PotatoPie, Items.potato, Items.egg, Items.potato);
        ShapelessRecipe(ItemInit.ThuringianSausage, Items.porkchop, Items.porkchop, ItemInit.Orleans);

        ShapelessRecipe(ItemInit.BreakfastCombo, ItemInit.Bacon, ItemInit.PaNiNiBread, ItemInit.PotatoPie, ItemInit.ThuringianSausage, ItemInit.SunEgg, ItemInit.MilkTea);
        ShapelessRecipe(ItemInit.BreakfastCombo, ItemInit.Bacon, ItemInit.PaNiNiBread, ItemInit.PotatoPie, ItemInit.ThuringianSausage, ItemInit.Cheese, ItemInit.American);

        Smelting(ItemInit.RawDicedChicken, ItemInit.CookedDicedChicken);
        Smelting(ItemInit.RawChickenBreast, ItemInit.CookedChickenBreast);
        Smelting(ItemInit.RawChickenWings, ItemInit.CookedChickenWings);
        Smelting(ItemInit.PotatoChips, ItemInit.FrenchFries);
        Smelting(ItemInit.Beaten, ItemInit.SunEgg);

        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.Knife), "  R", " R ", "S  ", 'R', Items.iron_ingot, 'S', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemInit.Grinder), "GGG", "GRG", "RSR", 'R', Items.iron_ingot, 'S', Items.stick, 'G', Blocks.glass);

        ShapelessRecipe(ItemInit.Sundae, Items.apple, Items.glass_bottle, Items.snowball);
        ShapelessRecipe(ItemInit.Cola, Items.sugar, Items.sugar, Items.sugar, Items.glass_bottle, ItemInit.CoffeeFlour);
        ShapelessRecipe(ItemInit.MilkTea, Items.sugar, Items.glass_bottle, Items.milk_bucket);
        ShapelessRecipe(ItemInit.American, ItemInit.CoffeeFlour, Items.glass_bottle);
        ShapelessRecipe(ItemInit.SparklingAppleJuiceDrink, ItemInit.AppleJuice, Items.sugar, ItemInit.Cola);
        ShapelessRecipe(ItemInit.AppleJuice, Items.apple, Items.glass_bottle, Items.sugar);
        ShapelessRecipe(ItemInit.Mocha, ItemInit.Chocolate, ItemInit.CoffeeFlour, Items.glass_bottle, Items.sugar);
        ShapelessRecipe(ItemInit.Cappuccino, Items.sugar, Items.glass_bottle, ItemInit.CoffeeFlour, ItemInit.CoffeeFlour, Items.milk_bucket);
        ShapelessRecipe(ItemInit.ClassicCoffee, Items.sugar, Items.glass_bottle, ItemInit.CoffeeFlour);
        ShapelessRecipe(ItemInit.FloatCoffee, ItemInit.CoffeeFlour, ItemInit.Mocha, ItemInit.Sundae, Items.sugar);
    }

    public static void Smelting(Item input, Item outpuy) {
        GameRegistry.addSmelting(new ItemStack(input), new ItemStack(outpuy), 0.5f);
    }

    public static void ShapelessRecipe(Item recipeItem, Object... items) {
        GameRegistry.addShapelessRecipe(new ItemStack(recipeItem), items);
    }
}
