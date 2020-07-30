package com.cykj.service.impl;


import com.cykj.mapper.MenuMapper;
import com.cykj.service.MenuService;
import com.cykj.supermarket_base.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getMenu(int roleId) {
        return menuMapper.getMenu(roleId);
    }
}
