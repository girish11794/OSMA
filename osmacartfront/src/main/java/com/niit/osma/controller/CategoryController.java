package com.niit.osma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.osmacart.dao.CategoryDAO;
import com.niit.osmacart.model.Category;
@Controller
public class CategoryController {
	@Autowired(required=true)
	private CategoryDAO categoryDAO;
	
	@Autowired(required=true)
	private Category category;
	
	
	@RequestMapping(value="/categories")
	public String listcategory(Model model)
	{
	model.addAttribute("category",category);
	model.addAttribute("categoryList",this.categoryDAO.list());
	return "categories";
	}
	
	
	@RequestMapping(value="/addcategory")
	public String addcategory(@ModelAttribute("category") Category category,Model model)
	{
				{
			if (category.getId() == 0) {
				categoryDAO.save(category);
			} else {
				categoryDAO.update(category);
			}

			return "redirect:/categories";
		}

    }

	
	
	@RequestMapping("/removeid/{id}")
	public String deleteCategory(@PathVariable("id") int id)
	
	{
		System.out.println("delete");
		categoryDAO.removeCategory(id);
		return "redirect:/categories";
	}
	
	
	@RequestMapping("/editcategory/{id}")
	public String editCategory(@PathVariable("id")int id, Model model)
	{
		model.addAttribute("category",this.categoryDAO.get(id));
		/*model.addAttribute("category", category);*/
		model.addAttribute("categoryList", this.categoryDAO.list());
		
		return "categories";
	}

}
