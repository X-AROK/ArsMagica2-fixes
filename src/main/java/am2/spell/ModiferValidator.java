package am2.spell;

import java.util.HashMap;
import java.util.Set;

public class ModiferValidator {
    HashMap<String, Integer> counter;

    public ModiferValidator(){
        counter = new HashMap<>();
    }

    public void addModifier (String modifierClass){
        if(counter.containsKey(modifierClass)){
            counter.replace(modifierClass, counter.get(modifierClass) + 1);
        }
        else{
            counter.put(modifierClass, 1);
        }
    }

    public boolean isValid(){
        Set<String> keySet = counter.keySet();
        for(String key : keySet){
            if(counter.get(key) > 3){
                return false;
            }
        }

        return true;
    }
}
