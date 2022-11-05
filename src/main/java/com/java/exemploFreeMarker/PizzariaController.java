package com.java.exemploFreeMarker;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;

@RestController
public class PizzariaController {

    private List<Pizza> pizzas = new ArrayList<>()
    {{
        add(new  Pizza("Napoletana", 7.0));
        add (new Pizza("Calabria", 6.0));
        add (new Pizza("Mussarela", 8.0));
    }};

    @GetMapping("/home")
    public ModelAndView home(Model model) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("menu");
        mv.addObject("pizzas", pizzas);
        return mv;
    }


    @PostMapping("/pizza")
    public String postCodigo(@RequestBody Pizza pizza) {
        pizzas.add(pizza);
        return "Pizza adicionada com sucesso";
    }

    @GetMapping("/api/pizzas")
    public List<Pizza> getPizzas() {
        return pizzas;
    }

}
