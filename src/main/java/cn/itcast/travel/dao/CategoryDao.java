package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Category;

import java.util.List;

public interface CategoryDao {
    /*
    * 查询所以
    * */
    public List<Category> findAll();
}