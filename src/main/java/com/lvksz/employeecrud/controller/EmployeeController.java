package com.lvksz.employeecrud.controller;

import com.lvksz.employeecrud.entity.Employee;
import com.lvksz.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model model){

        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);

        return "list-employees";
    }

    @GetMapping("/addEmployeeForm")
    public String addEmployeeForm(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "employee-form";
    }

    @PostMapping("/save")
    public String addEmployee(@ModelAttribute("employee") Employee employee){

        employeeService.save(employee);

        return "redirect:/employees/list";
    }

    @GetMapping("/updateEmployeeForm")
    public String updateEmployeeForm(@RequestParam("employeeId") int id,
                                     Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);

        return "employee-form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int id){

        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }
}
