package com.gaurav.foodapp.restfulservice.services;

import com.gaurav.foodapp.restfulservice.entities.Item;
import com.gaurav.foodapp.restfulservice.entities.Menu;
import com.gaurav.foodapp.restfulservice.exceptions.MenuNotFoundException;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class MenuService {

    private static Map<String, Menu> menus = new HashMap<>();

    static {
        Item[] itemArrayLunch = {new Item("Dish1", 1, "100gm"),
                new Item("Dish2", 1, "200gm"),
                new Item("Dish3", 1, "300gm")};
        Menu lunchMenu = new Menu("LUNCH", "", Arrays.asList(itemArrayLunch));
        menus.put("LUNCH", lunchMenu);

    }

    public Menu getMenu(String menuName) {
        String uppercaseMenuName =menuName.toUpperCase();
        if (menus.containsKey(uppercaseMenuName))
            return menus.get(uppercaseMenuName);
        else
            throw new MenuNotFoundException("Menu of Name " + menuName + " Not Present");
    }

    public void addMenu(Menu menu) {
        menus.put(menu.getMenuName().toUpperCase(), menu);
    }

    public List<Menu> getAllMenus() {
        return menus.values().stream().collect(Collectors.toList());
    }


}
