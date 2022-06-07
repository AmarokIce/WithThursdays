package club.someoneice.with_thursday.itemtool;

import club.someoneice.with_thursday.init.ItemList;
import club.someoneice.with_thursday.Main;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class FoodItem extends ItemFood {

    private PotionEffect[] effects;
    private int probability;
    private ItemStack returnItem;
    private int maxUseDuration;

    public FoodItem(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible, PotionEffect[] effects, int probability, ItemStack returnItem, int useDuration, int setMaxStackSize, EnumAction DrinkItem) {

        super(food, saturation, wolfFood);

        this.setUnlocalizedName(name);
        this.setRegistryName(name);

        if (setAlwaysEdible)
            this.setAlwaysEdible();

        this.setMaxStackSize(setMaxStackSize);

        this.effects = effects;
        this.probability = probability;
        this.returnItem = returnItem;
        this.maxUseDuration = useDuration;
        this.setCreativeTab(Main.WithThursday);

        ItemList.ITEM_LIST.add(this);
    }

    public FoodItem(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible, PotionEffect[] effects, ItemStack returnItem, int useDuration, int setMaxStackSize, EnumAction DrinkItem) {
        this(name, food, saturation, wolfFood, setAlwaysEdible, new PotionEffect[] {}, 1, returnItem, useDuration,
                setMaxStackSize, DrinkItem);
    }

    public FoodItem(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible, ItemStack returnItem, int useDuration, int setMaxStackSize, EnumAction DrinkItem) {
        this(name, food, saturation, wolfFood, setAlwaysEdible, new PotionEffect[] {}, returnItem, useDuration,
                setMaxStackSize, DrinkItem);
    }

    public FoodItem(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible, int useDuration, EnumAction DrinkItem) {
        this(name, food, saturation, wolfFood, setAlwaysEdible, new PotionEffect[] {}, null, useDuration, 64,
                DrinkItem);
    }

    public FoodItem(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible, EnumAction DrinkItem) {
        this(name, food, saturation, wolfFood, setAlwaysEdible, new PotionEffect[] {}, null, 32, 64, DrinkItem);
    }

    public FoodItem(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible) {
        this(name, food, saturation, wolfFood, setAlwaysEdible, new PotionEffect[] {}, null, 32, 64, EnumAction.EAT);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entity) {

        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;

            world.playSound(player, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_BURP,
                    SoundCategory.PLAYERS, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
            player.getFoodStats().addStats(this, stack);
            this.onFoodEaten(stack, world, player);
            player.addStat(StatList.getObjectUseStats(this));

            if (player instanceof EntityPlayerMP)
                CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP) player, stack);
        }

        for (PotionEffect effect : effects) {
            if (world.rand.nextInt(probability) == 0) {
                entity.addPotionEffect(new PotionEffect(effect));
            }
        }


        stack.shrink(1);
        return returnItem != null ? returnItem : stack;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {

        return maxUseDuration;
    }
}