package com.softuni.exam_prep1.web;

import com.softuni.exam_prep1.models.entities.enums.CategoryNameEnum;
import com.softuni.exam_prep1.models.view.ProductViewModel;
import com.softuni.exam_prep1.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    private final ProductService productService;
    private final ModelMapper modelMapper;

    public HomeController(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("user") == null) {
            return "index";
        }

        model.addAttribute("totalSum", productService.getTotalSum());
        model.addAttribute("foods", productService.findAllProductsByCategoryName(CategoryNameEnum.FOOD)
                .stream()
                .map(p -> modelMapper.map(p, ProductViewModel.class))
                .collect(Collectors.toList()));
        model.addAttribute("drinks", productService.findAllProductsByCategoryName(CategoryNameEnum.DRINK)
                .stream()
                .map(p -> modelMapper.map(p, ProductViewModel.class))
                .collect(Collectors.toList()));
        model.addAttribute("households", productService.findAllProductsByCategoryName(CategoryNameEnum.HOUSEHOLD)
                .stream()
                .map(p -> modelMapper.map(p, ProductViewModel.class))
                .collect(Collectors.toList()));
        model.addAttribute("others", productService.findAllProductsByCategoryName(CategoryNameEnum.OTHER)
                .stream()
                .map(p -> modelMapper.map(p, ProductViewModel.class))
                .collect(Collectors.toList()));


        return "home";
    }
}
