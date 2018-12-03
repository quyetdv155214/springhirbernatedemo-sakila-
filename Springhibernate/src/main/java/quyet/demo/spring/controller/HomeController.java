package quyet.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import quyet.demo.spring.model.Address;
import quyet.demo.spring.model.Product;
import quyet.demo.spring.model.Store;
import quyet.demo.spring.service.AddressService;
import quyet.demo.spring.service.StoreService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private StoreService storeService;

    @RequestMapping(value = {"/", "/customer-list"})
    public String home(Model model) {
        List<Store> listStore = storeService.getAllStore();
        model.addAttribute("listStore", listStore);
        return "index";
    }

    @RequestMapping(value = "/store/{id}")
    public String viewShopById(Model model, @PathVariable int id) {
        Store store = storeService.findById(id);
//        List<Product> products = store.getProducts();
        model.addAttribute("store", store);
        model.addAttribute("products", new ArrayList<Product>());

        return "store";
    }


    @RequestMapping(value = "/add")
    public String addProduct(Model model) {
//        Store store = storeService.findById(id);
//        List<Product> products = store.getProducts();
//        model.addAttribute("store", store);
//        model.addAttribute("products", new ArrayList<Product>());

        return "add";
    }


}
