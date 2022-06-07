package club.someoneice.with_thursday.itemtool;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ChickenBucket extends FoodItem {
    public ChickenBucket() {
        super("chicken_bucket", 16, 0.5F, true, true);
    }

    @Override
    public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
        super.addInformation(itemstack, world, list, flag);
        list.add("\u662f\u8c01\u70b9\u4e86\u4e00\u4e2a\u662f\u8c01\u70b9\u4e86\u4e00\u4efd\u8198\u80a5\u4f53\u58ee\u7684\u5916\u5356\u5c0f\u54e5\uff01\uff1f");
    }
}
