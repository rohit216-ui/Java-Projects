package com.employee_mgmt.controller;

import com.employee_mgmt.model.Employee;
import com.employee_mgmt.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // List all employees
    @GetMapping
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employees";   // employees.html
    }

    // form 
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee_form";   // employee_form.html
    }

    
    @PostMapping
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

   
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        return employeeRepository.findById(id)
                .map(emp -> {
                    model.addAttribute("employee", emp);
                    return "employee_form";
                })
                .orElse("redirect:/employees");
    }

  
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        employeeRepository.deleteById(id);
        return "redirect:/employees";
    }
}
