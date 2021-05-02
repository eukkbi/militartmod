package core;

import mindustry.mod.Mod;
import sonnicon.modtemplate.content.Modloader;

public class Main extends Mod{

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        new Modloader().load();
    }
}
