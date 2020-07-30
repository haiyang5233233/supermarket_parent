package com.cykj.mapper;


import com.cykj.supermarket_base.model.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getMenu(int roleId);
}
