package com.lvksz.employeecrud.rest;

//@RestController
//@RequestMapping("/api")
//public class EmployeeRestController {

//    private EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeRestController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/employee")
//    public List<Employee> findAll(){
//        return employeeService.findAll();
//    }
//
//    @GetMapping("/employee/{employeeId}")
//    public Employee getSingleEmployee(@PathVariable int employeeId){
//
//        Employee employee = employeeService.findById(employeeId);
//
//        if (employee == null){
//            throw new RuntimeException("Employee id not found - " + employeeId);
//        }
//
//        return employee;
//    }
//
//    @PostMapping("/employee")
//    public Employee addEmployee(@RequestBody Employee employee){
//        employee.setId(0);
//        return employeeService.save(employee);
//    }
//
//    @PutMapping("/employee")
//    public Employee updateEmployee(@RequestBody Employee employee){
//        return employeeService.save(employee);
//    }
//
//    @DeleteMapping("/employee/{employeeId}")
//    public String deleteEmployee(@PathVariable int employeeId){
//
//        Employee employee = employeeService.findById(employeeId);
//
//        if (employee == null){
//            throw new RuntimeException("Employee id not found - " + employeeId);
//        }
//        employeeService.deleteById(employeeId);
//
//        return "Deleted employee id - " + employeeId;
//    }


//}
