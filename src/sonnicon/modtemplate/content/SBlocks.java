package sonnicon.modtemplate.content;

import mindustry.content.Bullets;
import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;

import static mindustry.type.ItemStack.with;

public class SBlocks implements ContentList{
    public static Block misilleTurret;

    @Override
    public void load() {
        misilleTurret = new ItemTurret("Ground-to-Ground-Air"){{
            size = 4;
            health = 1260;
            requirements(Category.turret, with(Items.copper, 10));
            ammo(Items.silicon, Bullets.standardHoming);
        }};
    }
}
