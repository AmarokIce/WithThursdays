package club.someoneice.withthursday;

import club.someoneice.withthursday.item.Knife;
import club.someoneice.withthursday.item.OrleansRoastedWings;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = WithThursday.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegister {
    public static final DeferredRegister<Item> ItemList = DeferredRegister.create(ForgeRegistries.ITEMS, WithThursday.MODID);

    /* Special meals on Thursdays */

    // item.
    public static final RegistryObject<Item> knife = register(Knife::new, "knife");
    public static final RegistryObject<Item> Grinder = register(Knife::new, "grinder");
    public static final RegistryObject<Item> Crumbs = register(Itemlist::item, "crumbs");
    public static final RegistryObject<Item> Orleans = register(Itemlist::item, "orleans");
    public static final RegistryObject<Item> CoffeeFlour = register(Itemlist::item, "coffee_flour");
    public static final RegistryObject<Item> Box = register(Itemlist::item, "sauce_box");
    public static final RegistryObject<Item> BeatenEggs = register(() -> Itemlist.Drink(0, 1F, false, false, true), "beaten_eggs");
    public static final RegistryObject<Item> Cheese = register(() -> Itemlist.food(2, 1.0F, false, false, true), "cheese");
    public static final RegistryObject<Item> Chocolate = register(() -> Itemlist.food(2, 1.0F, false, false, true), "chocolate_bar");


    // food.
    /* Chicken  */
    public static final RegistryObject<Item> ChickenWings = register(() -> Itemlist.food(2, 0.5F, true, false, true), "chicken_wings");
    public static final RegistryObject<Item> CookedChickenWings = register(() -> Itemlist.food(6, 0.2F, true, false, true), "cooked_chicken_wings");
    public static final RegistryObject<Item> ChickenBreast = register(() -> Itemlist.food(2, 0.5F, true, false, true), "chicken_breast");
    public static final RegistryObject<Item> CookedChickenBreast = register(() -> Itemlist.food(6, 0.3F, true, false, true), "cooked_chicken_breast");
    public static final RegistryObject<Item> DicedChicken = register(() -> Itemlist.food(1, 0.0F, true, true, true), "diced_chicken");
    public static final RegistryObject<Item> CookedDicedChicken = register(() -> Itemlist.food(2, 0.25F, true, true, true), "cooked_diced_chicken");

    // restaurant 2 Update
    public static final RegistryObject<Item> OriginalRecipe = register(() -> Itemlist.food(10, 1.25F, true, false, true), "original_recipe");
    public static final RegistryObject<Item> ChickBucket = register(() -> Itemlist.food(18, 1.0F, false, false, true), "chicken_bucket");
    public static final RegistryObject<Item> ChocolateSundae = register(() -> Itemlist.food(5, 0.5F, false, true, false), "chocolate_sundae");
    public static final RegistryObject<Item> DragonTwister = register(() -> Itemlist.food(10, 0.5F, false, true, false), "dragon_twister");


    /* Snack */
    public static final RegistryObject<Item> orleansRoastedWings = register(OrleansRoastedWings::new, "orleans_roasted_wings");
    public static final RegistryObject<Item> PopcornChicken = register(() -> Itemlist.food(7, 0.25F, true, false, true), "chicken_pop");
    public static final RegistryObject<Item> ChickenNugget = register(() -> Itemlist.food(4, 0.25F, true, false, true), "chicken_nugget");
    public static final RegistryObject<Item> SpicySquid = register(() -> Itemlist.food(4, 0.25F, true, false, true), "spicy_squid");
    public static final RegistryObject<Item> CornSalad = register(() -> Itemlist.food(6, 0.9F, true, false, true), "corn_salad");
    public static final RegistryObject<Item> PotatoChips = register(() -> Itemlist.food(2, 0.5F, true, false, true), "potato_chips");
    public static final RegistryObject<Item> FrenchFries = register(() -> Itemlist.food(6, 0.3F, true, false, true), "french_fries");
    public static final RegistryObject<Item> MashedPotato = register(() -> Itemlist.food(6, 0.3F, true, false, true), "mashed_potato");

    // restaurant 2 Update
    public static final RegistryObject<Item> SunEgg = register(() -> Itemlist.food(2, 0.5F, false, true, true), "sun_egg");
    public static final RegistryObject<Item> PaNiNiBread = register(() -> Itemlist.food(2, 0.5F, false, true, true), "pnn_bread");
    public static final RegistryObject<Item> PotatoPie = register(() -> Itemlist.food(6, 1.125F, false, true, true), "potato_pie");
    public static final RegistryObject<Item> ThuringiaSausage = register(() -> Itemlist.food(6, 0.5F, false, true, true), "thuringia_sausage");
    public static final RegistryObject<Item> FleshBonePlus = register(() -> Itemlist.food(3, 0.5F, true, true, true), "flesh_bone");
    public static final RegistryObject<Item> Bacon = register(() -> Itemlist.food(3, 0.125F, true, true, true), "bacon");


    /* WithPack */
    public static final RegistryObject<Item> BreakfastPack = register(() -> Itemlist.food(12, 1.125F, false, false, true), "breakfast");
    public static final RegistryObject<Item> Sundae = register(() -> Itemlist.Drink(3, 0.5F, false, true, false), "sundae");

    // PaNini
    public static final RegistryObject<Item> BaconPaNini = register(() -> Itemlist.food(9, 0.5F, false, false, true), "bacon_panini");
    public static final RegistryObject<Item> ChickenPaNini = register(() -> Itemlist.food(9, 0.5F, false, false, true), "chicken_panini");
    public static final RegistryObject<Item> BeefPaNini = register(() -> Itemlist.food(9, 0.5F, false, false, true), "beef_panini");
    public static final RegistryObject<Item> PorkPaNini = register(() -> Itemlist.food(9, 0.5F, false, false, true), "pork_panini");

    // Burger
    public static final RegistryObject<Item> Extra_TastyCrispyBurger = register(() -> Itemlist.food(7, 0.5F, false, false, true), "etc_burger");
    public static final RegistryObject<Item> ChickenBurger = register(() -> Itemlist.food(7, 0.5F, false, false, true), "chicken_burger");
    public static final RegistryObject<Item> BaconChickenBurger = register(() -> Itemlist.food(7, 0.5F, false, false, true), "bacon_chicken_burger");
    public static final RegistryObject<Item> OrleansBurger = register(() -> Itemlist.food(7, 0.5F, false, false, true), "orleans_burger");
    public static final RegistryObject<Item> BBQPorkBurger = register(() -> Itemlist.food(7, 0.5F, false, false, true), "bbq_burger");
    public static final RegistryObject<Item> ChickPorkBurger = register(() -> Itemlist.food(14, 0.5F, false, false, true), "cp_burger");
    public static final RegistryObject<Item> FishBurger = register(() -> Itemlist.food(7, 0.5F, false, false, true), "fish_burger");

    // Drink
    public static final RegistryObject<Item> Cola = register(() -> Itemlist.Drink(2, 0.5F, false, false, true), "cola");
    public static final RegistryObject<Item> AppleJuice = register(() -> Itemlist.Drink(2, 0.5F, false, false, true), "apple_juice");
    public static final RegistryObject<Item> SparklingAppleJuiceDrink = register(() -> Itemlist.Drink(2, 0.5F, false, false, true), "sparkling_apple_juice");
    public static final RegistryObject<Item> Ice_creamFloatCoffee = register(() -> Itemlist.Drink(2, 0.5F, false, false, true), "ice_cream_float");
    public static final RegistryObject<Item> classicCoffee = register(() -> Itemlist.Drink(2, 0.5F, false, false, true), "classic_coffee");
    public static final RegistryObject<Item> USA = register(() -> Itemlist.Drink(2, 0.5F, false, false, true), "usa_cofe");
    public static final RegistryObject<Item> Cappuccino = register(() -> Itemlist.Drink(2, 0.5F, false, false, true), "cappuccino");
    public static final RegistryObject<Item> Mocha = register(() -> Itemlist.Drink(2, 0.5F, false, false, true), "mocha");
    public static final RegistryObject<Item> MilkTea = register(() -> Itemlist.Drink(4, 1.5F, false, false, true), "milk_tea");
    public static final RegistryObject<Item> NineFruitJuice = register(() -> Itemlist.Drink(4, 1.5F, false, false, true), "nine_fruit_juice");

    /* WithRecipes? */

    public static RegistryObject<Item> register(@Nonnull Supplier<Item> initializer, @Nonnull String name) {
        return ItemList.register(name, initializer);
    }
}
