package Emp.System.Controller;

import Emp.System.entity.Employee;
import Emp.System.service.EmpService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpController {

    @Autowired
    private EmpService service;


    @GetMapping("/")
    public String home()
    {
        return "index";
    }

    @GetMapping("/addemp")
    public String addEmpform()
    {
        return "Add_emp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e, HttpSession session){
        System.out.println(e);
        service.addEmp(e);
        session.setAttribute("message","Employee Added Successfully");
        return "redirect:/";
    }
}
