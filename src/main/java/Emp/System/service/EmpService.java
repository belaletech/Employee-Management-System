package Emp.System.service;

import Emp.System.entity.Employee;
import Emp.System.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;

    public void addEmp(Employee e)
    {
     repo.save(e);

    }

}
