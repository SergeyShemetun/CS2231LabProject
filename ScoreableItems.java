package com.LabProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ScoreableItems {
    private Map<String, Integer> items;

    public ScoreableItems() {
        initializeItems();
    }

    private void initializeItems(){
        items = new HashMap<String, Integer>();
        items.put("Fortune Cookie", 10);
        items.put("Cheetos", 15);
        items.put("Bomb", -20);
        items.put("Mighty Sword", 20);
        items.put("Poison", -15);
        items.put("Healing Potion", 25);
        items.put("Fried Chicken", 25);
    }

    public void displayCurrentItems(){
        Set<String> keys = items.keySet();
        Iterator<String> iter = keys.iterator();

        while (iter.hasNext()) {
            String key = iter.next();
            Integer value = items.get(key);
            System.out.println("Item:" + key + ", value: " + value);
        }
    }

    public Integer getItem(String key){
        return items.get(key);
    }
}
