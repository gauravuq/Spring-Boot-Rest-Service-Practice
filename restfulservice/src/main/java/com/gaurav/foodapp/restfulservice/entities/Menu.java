package com.gaurav.foodapp.restfulservice.entities;

import java.util.List;

public class Menu {

    private String menuName;
    private String timings;
    private List<Item> menuItems;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public List<Item> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<Item> menuItems) {
        this.menuItems = menuItems;
    }

    public Menu(String menuName, String timings, List<Item> menuItems) {
        this.menuName = menuName;
        this.timings = timings;
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                ", timings='" + timings + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }
}
