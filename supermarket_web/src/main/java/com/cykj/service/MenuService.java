package com.cykj.service;


import com.cykj.supermarket_base.model.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenu(int roleId);
}
