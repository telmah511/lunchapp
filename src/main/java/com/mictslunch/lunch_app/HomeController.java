  package com.mictslunch.lunch_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/lunch-table")
    public String lunchTable(Model model) {
        List<Employee> employees = Arrays.asList(
            new Employee("John Smith", "Jollof Rice", "Banku with Tilapia", "Waakye", "Fufu with Light Soup", "Kelewele"),
            new Employee("Jane Doe", "Red Red", "Ampesi with Palava Sauce", "Fried Rice", "Banku with Okro Stew", "Tatale"),
            new Employee("Bob Johnson", "Fufu with Groundnut Soup", "Jollof Rice", "Banku with Tilapia", "Waakye", "Fufu with Light Soup"),
            new Employee("Alice Brown", "Kelewele", "Red Red", "Ampesi with Palava Sauce", "Fried Rice", "Banku with Okro Stew"),
            new Employee("Charlie Wilson", "Tatale", "Fufu with Groundnut Soup", "Jollof Rice", "Banku with Tilapia", "Waakye"),
            new Employee("Diana Davis", "Fufu with Light Soup", "Kelewele", "Red Red", "Ampesi with Palava Sauce", "Fried Rice"),
            new Employee("Edward Miller", "Banku with Okro Stew", "Tatale", "Fufu with Groundnut Soup", "Jollof Rice", "Banku with Tilapia"),
            new Employee("Fiona Garcia", "Waakye", "Fufu with Light Soup", "Kelewele", "Red Red", "Ampesi with Palava Sauce"),
            new Employee("George Rodriguez", "Fried Rice", "Banku with Okro Stew", "Tatale", "Fufu with Groundnut Soup", "Jollof Rice"),
            new Employee("Helen Martinez", "Banku with Tilapia", "Waakye", "Fufu with Light Soup", "Kelewele", "Red Red")
        );

        model.addAttribute("employees", employees);
        return "lunch-table";
    }

}
