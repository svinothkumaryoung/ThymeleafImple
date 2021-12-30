package com.agreeya.ThymeleafImple.controller;

import com.agreeya.ThymeleafImple.Entity.Product;
import com.agreeya.ThymeleafImple.repo.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductDetails {
    @Autowired
    ProductRepo productRepo;

    @GetMapping("/RegisterationForm")
    public String Registeration(Product product)
    {
       //Show Registeration Form
        return "add-product";
    }
    @GetMapping("/view")
    public String viewData(Model model)
    {
        model.addAttribute("product",this.productRepo.findAll());
      return "view-data";
    }
    @PostMapping ("/addInfo")
    public String addProduct(@Valid Product product , BindingResult r, Model model)
    {
        this.productRepo.save(product);
       return "redirect:view";
    }
    @GetMapping("/edit/{id}")
    public String update(@PathVariable("id") Integer id,Model model)
    {
        Product product=this.productRepo.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Invalid Id"));
        model.addAttribute("product",product);
        return "update";
    }

    @PostMapping("changeDetails/{id}")
    public String ChangeDetails(@PathVariable ("id") Integer id,@Valid Product product , BindingResult r, Model model )
    {
        this.productRepo.save(product);
        return "view-data";
    }
    @GetMapping("delete/{id}")
    public String deleteData(@PathVariable("id") Integer id,Model model)
    {
        Product product=this.productRepo.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Invalid Id"));
       this.productRepo.delete(product);
       model.addAttribute("product",this.productRepo.findAll());
       return "view-data";
    }


}
