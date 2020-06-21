package com.progrema.createrecipe.controllers;

import com.progrema.createrecipe.domain.Category;
import com.progrema.createrecipe.domain.MeasurementUnit;
import com.progrema.createrecipe.repositories.CategoryRepository;
import com.progrema.createrecipe.repositories.MeasurementUnitRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private MeasurementUnitRepository measurementUnitRepository;

    public IndexController(CategoryRepository categoryRepository,
                           MeasurementUnitRepository measurementUnitRepository) {
        this.categoryRepository = categoryRepository;
        this.measurementUnitRepository = measurementUnitRepository;
    }

    @RequestMapping({"/", "", "/index"})
    public String getIndexPage(Model model) {

        Optional<Category> optionalCategory = categoryRepository.findByDescription("American");
        Optional<MeasurementUnit> optionalMeasurementUnit = measurementUnitRepository.findByDescription("Teaspoon");

        System.out.println(optionalCategory.get().toString());
        System.out.println(optionalMeasurementUnit.get().toString());

        return "index";
    }

}
