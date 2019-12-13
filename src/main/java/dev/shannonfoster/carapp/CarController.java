package dev.shannonfoster.carapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CarController {
    @Autowired
    CarRepo carRepo;

    @RequestMapping("/")
    public String homePage(Model model){
        Car testCar = new Car();
        testCar.setBrand("Tesla");
        testCar.setModel("CyberTruck");
        testCar.setExteriorColor("Silver");
        testCar.setInterior("Black Leather with granite dashboard");
        testCar.setSeats(7);
        testCar.setType("Electric");
        testCar.setAvailability(false);
        carRepo.save(testCar);
        model.addAttribute("cars", carRepo.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String addCarForm(Model model){
        model.addAttribute("car", new Car());
        return "addcarform";
    }

    @PostMapping("/final")
    public String processForm(@Valid Car car, BindingResult result){
        if(result.hasErrors()){
            return "addcarform";
        }
        carRepo.save(car);
        return "redirect:/";
    }

}
