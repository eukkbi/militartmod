package sonnicon.modtemplate.content;

import mindustry.ctype.ContentList;
import mindustry.entities.bullet.BulletType;

public class SBullets implements ContentList{
    public static BulletType accelMisille;

    @Override
    public void load(){
        accelMisille = new accelMissile();

    }
}
