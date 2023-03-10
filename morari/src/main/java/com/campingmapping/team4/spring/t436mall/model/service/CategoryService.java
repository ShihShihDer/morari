package com.campingmapping.team4.spring.t436mall.model.service;

import java.util.List;

import com.campingmapping.team4.spring.t436mall.model.entity.Category;

public interface CategoryService {

	public Category create(Category category);

	public void deleteByPdid(int id);

	public Category updateByPdid(Category category);

	public Category selectByPdid(int Pdid);

	public List<Category> selectAll();

	public void updateBuy(List<Category> category);
}