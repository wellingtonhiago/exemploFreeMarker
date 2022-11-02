package com.java.exemploFreeMarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class PizzeriaController {
    private List<Pizza> pizzaList = List.of(
            new Pizza("Calabria", 6.0),
            new Pizza("Napoletana", 6.0),
            new Pizza("Calzone", 7.5)
    );

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("pizzas", pizzaList);
        return "menu";
    }

    @PostMapping("/pizza")
    public Id postCodigo(@RequestBody Pizza pizza) {
        pizzaList.add(pizza);
        Id id = new Id();
        return id;
    }
}
