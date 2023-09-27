import java.util.List;

public class DBApp6 {

    public static void main(String args[]) {

        List<Employee> emplist = EmployeeDao.getAll();

        for (Employee emp : emplist) {
            System.out.print(emp.getName() + "\t");
            System.out.print(emp.getNic() + "\t");
            System.out.print(emp.getGender().getName() + "\t");
            System.out.println(" ");

        }
    }
}