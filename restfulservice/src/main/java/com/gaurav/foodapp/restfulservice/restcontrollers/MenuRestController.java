package com.gaurav.foodapp.restfulservice.restcontrollers;

import com.gaurav.foodapp.restfulservice.entities.Menu;
import com.gaurav.foodapp.restfulservice.entities.ResponseNewMenu;
import com.gaurav.foodapp.restfulservice.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuRestController {


    @Autowired
    MenuService menuService;

    @GetMapping("/menu/getAll")
    public List<Menu> getAllMenus(){
        return  menuService.getAllMenus();
    }

    @GetMapping("/menu/{menuName}")
    public Menu getMenu(@PathVariable String menuName){
        Menu result = menuService.getMenu(menuName);
        return  result;
    }

    @PostMapping("/menu/addMenu")
    public ResponseNewMenu addMenu(@RequestBody Menu menu){
        menuService.addMenu(menu);
        return new ResponseNewMenu("Menu Added "+ menu.getMenuName());
    }



}
