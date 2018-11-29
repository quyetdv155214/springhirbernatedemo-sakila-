package quyet.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import quyet.demo.spring.model.Customer_old;
import quyet.demo.spring.service.CustomerService;

@Controller
public class CustomerController_old {
//    private final CustomerService customerService;

//    @Autowired
//    public CustomerController_old(@Qualifier(value = "customerService") CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//    @RequestMapping(value={"/", "/customer-list"})
//    public String listCustomer(Model model) {
//        model.addAttribute("listCustomer", customerService.findAll());
//        return "home";
//    }
//
//    @RequestMapping("/customer-save")
//    public String insertCustomer(Model model) {
//        model.addAttribute("customer", new Customer_old());
//        return "addCustome  r";
//    }
//
//    @RequestMapping("/customer-view/{id}")
//    public String viewCustomer(@PathVariable int id, Model model) {
//        Customer_old customer = customerService.findById(id);
//        model.addAttribute("customer", customer);
//        return "viewCustomer";
//    }
//
//    @RequestMapping("/customer-update/{id}")
//    public String updateCustomer(@PathVariable int id, Model model) {
//        Customer_old customer = customerService.findById(id);
//        model.addAttribute("customer", customer);
//        return "updateCustomer";
//    }
//
//    @RequestMapping("/saveCustomer")
//    public String doSaveCustomer(@ModelAttribute("Customer") Customer_old customer, Model model) {
//        customerService.save(customer);
//        model.addAttribute("listCustomer", customerService.findAll());
//        return "home";
//    }
//
//    @RequestMapping("/updateCustomer")
//    public String doUpdateCustomer(@ModelAttribute("Customer") Customer_old customer, Model model) {
//        customerService.update(customer);
//        model.addAttribute("listCustomer", customerService.findAll());
//        return "home";
//    }
//
//    @RequestMapping("/customerDelete/{id}")
//    public String doDeleteCustomer(@PathVariable int id, Model model) {
//        customerService.delete(id);
//        model.addAttribute("listCustomer", customerService.findAll());
//        return "home";
//    }
}
