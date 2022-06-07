package club.someoneice.with_thursday.init;

import java.util.ArrayList;
import java.util.List;

import club.someoneice.with_thursday.itemtool.ChickenBucket;
import club.someoneice.with_thursday.itemtool.FoodItem;
import club.someoneice.with_thursday.itemtool.ItemItems;
import club.someoneice.with_thursday.itemtool.Knife;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;

public class ItemList{
    public static final List<Item> ITEM_LIST = new ArrayList<>();
    
    // public static Item sandmanPineapple;

    public static Item itemCrumbs;
    public static Item itemOrleans;
    public static Item itemCoffeeFlour;

    public static Item foodChocolate;
    public static Item foodBeatenEggs;
    public static Item foodCheese;
    public static Item foodRawChickenBreast;
    public static Item foodCookChickenBreast;
    public static Item foodBacon;
    public static Item foodPaNiNiBread;
    public static Item foodSunEgg;
    public static Item foodOriginalRecipe;
    public static Item foodRawDicedChicken;
    public static Item foodCookDicedChicken;
    public static Item foodPotatoChips;

    public static Item foodChickenNuggets;
    public static Item foodFrenchFries;
    public static Item foodPotatoPie;
    public static Item foodThuringian;
    public static Item foodFleshBone;
    public static Item foodPopcornChicken;
    public static Item foodChickenBucket;

    public static Item foodBeefPaNini;
    public static Item foodPorkPaNini;
    public static Item foodBaconPaNini;
    public static Item foodChickenPaNini;

    public static Item foodExtraTastyCrispyBurger;
    public static Item foodChickenBurger;
    public static Item foodBBQPorkBurger;
    public static Item foodChickPorkBurger;
    public static Item foodBaconChickenBurger;

    public static Item foodIceCreamFloatCoffee;
    public static Item foodClassicCoffee;
    public static Item foodCappuccino;
    public static Item foodAppleJuice;
    public static Item foodMocha;
    public static Item foodSparklingAppleJuiceDrink;
    public static Item foodAmerican;
    public static Item foodMilkTea;
    public static Item foodSundae;
    public static Item foodCola;

    public static Item Knife;

    public static void init() {
    //    sandmanPineapple = new Sandman("pineapple");
        itemCrumbs = new ItemItems("crumbs");
        itemOrleans = new ItemItems("orleans");
        itemCoffeeFlour = new ItemItems("coffee_flour");

        foodChocolate = new FoodItem("chocolate", 2, 1F, false, true);
        foodBeatenEggs = new FoodItem("beaten_eggs", 1, 0.5F, false, true, EnumAction.DRINK);
        foodCheese = new FoodItem("cheese", 3, 1F, false, true);
        foodRawChickenBreast = new FoodItem("chicken_breast", 1, 0.5F, true, true);
        foodCookChickenBreast = new FoodItem("cooked_chicken_breast", 6, 0.5F, true, true);
        foodRawDicedChicken = new FoodItem("diced_chicken", 1, 0.5F, true, true);
        foodCookDicedChicken = new FoodItem("cooked_diced_chicken", 1, 0.5F, true, true);
        foodBacon = new FoodItem("bacon", 3, 1F, true, true);
        foodPaNiNiBread = new FoodItem("pnn_bread", 2, 0.5F, false, true);
        foodSunEgg = new FoodItem("sun_egg", 3, 1F, false, true);

        foodOriginalRecipe = new FoodItem("original_recipe", 6, 6F, true, false);
        foodPotatoChips = new FoodItem("potato_chips", 2, 1F, false, true);
        foodChickenNuggets = new FoodItem("chicken_nuggets", 4, 1F, true, true);
        foodFrenchFries = new FoodItem("french_fries", 10, 0.5F, false, true);
        foodPotatoPie = new FoodItem("potato_pie", 8, 0.5F, false, true);
        foodThuringian = new FoodItem("thuringia_sausage", 8, 0.8F, true, true);
        foodFleshBone = new FoodItem("flesh_bone", 3, 0.3F, true, true);
        foodPopcornChicken = new FoodItem("chicken_pop", 6, 0.9F, true, true);

        foodBeefPaNini = new FoodItem("beef_panini", 12, 0.5F, false, true);
        foodPorkPaNini = new FoodItem("pork_panini", 12, 0.5F, false, true);
        foodBaconPaNini = new FoodItem("bacon_panini", 12, 0.5F, false, true);
        foodChickenPaNini = new FoodItem("chicken_panini", 12, 0.5F, false, true);

        foodExtraTastyCrispyBurger = new FoodItem("etc_burger", 12, 0.5F, false, true);
        foodChickenBurger = new FoodItem("chicken_burger", 12, 0.5F, false, true);
        foodBBQPorkBurger = new FoodItem("bbq_burger", 12, 0.5F, false, true);
        foodChickPorkBurger = new FoodItem("cp_burger", 12, 0.5F, false, true);
        foodBaconChickenBurger = new FoodItem("bacon_chicken_burger", 12, 0.5F, false, true);

        foodIceCreamFloatCoffee= new FoodItem("ice_cream_float", 6, 0.5F, false, true, EnumAction.DRINK);
        foodClassicCoffee= new FoodItem("classic_coffee", 6, 0.5F, false, true, EnumAction.DRINK);
        foodCappuccino= new FoodItem("cappuccino", 6, 0.5F, false, true, EnumAction.DRINK);
        foodAppleJuice= new FoodItem("apple_juice", 6, 0.5F, false, true, EnumAction.DRINK);
        foodMocha= new FoodItem("mocha", 6, 0.5F, false, true, EnumAction.DRINK);
        foodSparklingAppleJuiceDrink= new FoodItem("sparkling_apple_juice", 6, 0.5F, false, true, EnumAction.DRINK);
        foodAmerican= new FoodItem("usa_cofe", 6, 0.5F, false, true, EnumAction.DRINK);
        foodMilkTea= new FoodItem("milk_tea", 6, 0.5F, false, true, EnumAction.DRINK);
        foodSundae= new FoodItem("sundae", 6, 0.5F, false, true, EnumAction.DRINK);
        foodCola= new FoodItem("cola", 6, 0.5F, false, true, EnumAction.DRINK);

        foodChickenBucket = new ChickenBucket();
        Knife = new Knife("knife");
    }
}
