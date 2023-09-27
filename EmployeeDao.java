import java.util.List;

public class EmployeeDao {

    public static List<Employee> getAll(){
        List<Employee> employees = CommonDao.get("Employee.findAll"); 

        return employees;    
    }   
}
