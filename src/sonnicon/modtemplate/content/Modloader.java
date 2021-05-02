package sonnicon.modtemplate.content;

import mindustry.ctype.ContentList;

public class Modloader implements ContentList {
    private  final  ContentList[] contents = {
    };
    @Override
    public void load() {
        for(ContentList list : contents){
            list.load();
        }
    }
}
