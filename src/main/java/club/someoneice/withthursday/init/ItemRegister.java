package club.someoneice.withthursday.init;

import club.someoneice.withthursday.WithThursday;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = WithThursday.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ItemRegister {
    public static final DeferredRegister<Item> ItemList = DeferredRegister.create(Item.class, WithThursday.MODID);

    /* Special meals on Thursdays */

    // item.
    public static final RegistryObject<Item> knife = register(Itemlist::Knife, "knife");
    public static final RegistryObject<Item> crumbs = register(Itemlist::item, "crumbs");
    public static final RegistryObject<Item> Orleans = register(Itemlist::item, "orleans");

    // food.
    /* Chicken  */

    public static final RegistryObject<Item> ChickenWings = register(() -> Itemlist.food(2, 2, true, false, true), "chicken_wings");
    public static final RegistryObject<Item> CookedChickenWings = register(() -> Itemlist.food(6, 2, true, false, true), "cooked_chicken_wings");
    public static final RegistryObject<Item> ChickenBreast = register(() -> Itemlist.food(2, 2, true, false, true), "chicken_breast");
    public static final RegistryObject<Item> CookedChickenBreast = register(() -> Itemlist.food(6, 4, true, false, true), "cooked_chicken_breast");
    public static final RegistryObject<Item> DicedChicken = register(() -> Itemlist.food(1, 0, true, true, true), "diced_chicken");
    public static final RegistryObject<Item> CookedDicedChicken = register(() -> Itemlist.food(2, 1, true, true, true), "cooked_diced_chicken");

    // restaurant 2 Update
    public static final RegistryObject<Item> OriginalRecipe = register(() -> Itemlist.food(6, 6, true, false, true), "original_recipe");
    public static final RegistryObject<Item> ChickBucket = register(() -> Itemlist.food(18,20,false,false,true), "chicken_bucket");


    /* Snack */
    public static final RegistryObject<Item> OrleansRoastedWings = register(Itemlist::OrleansRoastedWings, "orleans_roasted_wings");
    public static final RegistryObject<Item> PopcornChicken = register(() -> Itemlist.food(7, 5, true, false, true), "chicken_pop");
    public static final RegistryObject<Item> ChickenNugget = register(() -> Itemlist.food(4, 2, true, false, true), "chicken_nugget");
    public static final RegistryObject<Item> SpicySquid = register(() -> Itemlist.food(4, 2, true, false, true), "spicy_squid");
    public static final RegistryObject<Item> CornSalad = register(() -> Itemlist.food(6, 5, true, false, true), "corn_salad");
    public static final RegistryObject<Item> PotatoChips = register(() -> Itemlist.food(2, 2, true, false, true), "potato_chips");
    public static final RegistryObject<Item> FrenchFries = register(() -> Itemlist.food(6, 2, true, false, true), "french_fries");
    public static final RegistryObject<Item> MashedPotato = register(() -> Itemlist.food(6, 2, true, false, true), "mashed_potato");

    // restaurant 2 Update
    public static final RegistryObject<Item> BeatenEggs = register(() -> Itemlist.Drink(0, 1, false, false, true), "beaten_eggs");
    public static final RegistryObject<Item> SunEgg = register(() -> Itemlist.food(2, 2, false, true, true), "sun_egg");
    public static final RegistryObject<Item> PaNiNiBread = register(() -> Itemlist.food(2, 2, false, true, true), "pnn_bread");
    public static final RegistryObject<Item> PotatoPie = register(() -> Itemlist.food(6, 8, false, true, true), "potato_pie");
    public static final RegistryObject<Item> ThuringiaSausage = register(() -> Itemlist.food(2, 2, false, true, true), "thuringia_sausage");
    public static final RegistryObject<Item> FleshBonePlus = register(() -> Itemlist.food(3, 2, true, true, true), "flesh_bone");


    /* WithPack */
    public static final RegistryObject<Item> BreakfastPack = register(() -> Itemlist.food(12, 16, false, false, true), "breakfast");
    public static final RegistryObject<Item> Sundae = register(() -> Itemlist.Drink(3, 3,false, true, false), "sundae");
    
    // PaNini
    public static final RegistryObject<Item> BaconPaNini = register(() -> Itemlist.food(9, 7, false, false, true), "bacon_panini");
    public static final RegistryObject<Item> ChickenPaNini = register(() -> Itemlist.food(9, 7, false, false, true), "chicken_panini");
    public static final RegistryObject<Item> BeefPaNini = register(() -> Itemlist.food(9, 7, false, false, true), "beef_panini");
    public static final RegistryObject<Item> PorkPaNini = register(() -> Itemlist.food(9, 7, false, false, true), "pork_panini");

    // Burger
    public static final RegistryObject<Item> Extra_TastyCrispyBurger = register(() -> Itemlist.food(7, 7, false, false, true), "etc_burger");
    public static final RegistryObject<Item> ChickenBurger = register(() -> Itemlist.food(7, 7, false, false, true), "chicken_burger");
    public static final RegistryObject<Item> BaconChickenBurger = register(() -> Itemlist.food(7, 7, false, false, true), "bacon_chicken_burger");
    public static final RegistryObject<Item> OrleansBurger = register(() -> Itemlist.food(7, 7, false, false, true), "orleans_burger");
    public static final RegistryObject<Item> BBQPorkBurger = register(() -> Itemlist.food(7, 7, false, false, true), "bbq_burger");
    public static final RegistryObject<Item> ChickPorkBurger = register(() -> Itemlist.food(14, 14, false, false, true), "cp_burger");

    // Drink
    public static final RegistryObject<Item> Cola = register(() -> Itemlist.Drink(2, 2, false, false, true), "cola");
    public static final RegistryObject<Item> AppleJuice = register(() -> Itemlist.Drink(2, 2, false, false, true), "apple_juice");
    public static final RegistryObject<Item> SparklingAppleJuiceDrink = register(() -> Itemlist.Drink(2, 2, false, false, true), "sparkling_apple_juice");
    public static final RegistryObject<Item> Ice_creamFloatCoffee = register(() -> Itemlist.Drink(2, 2, false, false, true), "ice_cream_float");
    public static final RegistryObject<Item> classicCoffee = register(() -> Itemlist.Drink(2, 2, false, false, true), "classic_coffee");
    public static final RegistryObject<Item> USA = register(() -> Itemlist.Drink(2, 2, false, false, true), "usa_cofe");
    public static final RegistryObject<Item> Cappuccino = register(() -> Itemlist.Drink(2, 2, false, false, true), "cappuccino");
    public static final RegistryObject<Item> Mocha = register(() -> Itemlist.Drink(2, 2, false, false, true), "mocha");
    public static final RegistryObject<Item> MilkTea = register(() -> Itemlist.Drink(4, 6, false, false, true), "milk_tea");

    /* WithRecipes? */

    public static RegistryObject<Item> register(@Nonnull Supplier<Item> initializer, @Nonnull String name) {
        return ItemList.register(name, initializer);
    }
}
