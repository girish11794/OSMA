package com.niit.osma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.osmacart.dao.CategoryDAO;
import com.niit.osmacart.dao.SupplierDAO;
import com.niit.osmacart.model.Category;
import com.niit.osmacart.model.Supplier;

@Controller
public class SupplierController {
	@Autowired(required=true)
	private SupplierDAO supplierDAO;
	
	@Autowired(required=true)
	private Supplier supplier;
	
	
	@RequestMapping(value="/supplier")
	public String listsupplier(Model model)
	{
	model.addAttribute("supplier",supplier);
	model.addAttribute("supplierList",this.supplierDAO.list());
	return "supplier";
	}
	
	
	@RequestMapping(value="/addsupplier")
	public String addsupplier(@ModelAttribute("supplier") Supplier supplier,Model model)
	{
				{
			if (supplier.getId() == 0) {
				supplierDAO.save(supplier);
			} else {
				supplierDAO.update(supplier);
			}

			return "redirect:/supplier";
		}

    }

	
	
	@RequestMapping("/removeid2/{id}")
	public String deletesupplier(@PathVariable("id") int id)
	
	{
		System.out.println("delete");
		supplierDAO.removeSupplier(id);
		return "redirect:/supplier";
	}
	
	
	@RequestMapping("/editsupplier/{id}")
	public String editSupplier(@PathVariable("id")int id, Model model)
	{
		model.addAttribute("supplier",this.supplierDAO.get(id));
		/*model.addAttribute("category", category);*/
		model.addAttribute("supplierList", this.supplierDAO.list());
		
		return "supplier";
	}

}
