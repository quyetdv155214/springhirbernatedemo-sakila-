package quyet.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import quyet.demo.spring.model.Address;
import quyet.demo.spring.service.AddressService;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private AddressService addressService;

    @RequestMapping(value={"/", "/customer-list"})
    public String home(Model model) {
        List<Address> addressByStoreId = addressService.getAddressByStoreId(1);
        model.addAttribute("addressByStoreId", addressByStoreId);
        return "index";

    }
}
