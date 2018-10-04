package soccer.club.employee;
import java.util.ArrayList;
import static utilities.Utilities.*;

public class PersonalTrainer extends Employee
{
    public PersonalTrainer(double salary, String name, String cpf, String phone, String email)
    {
        super(salary, name, cpf, phone, email);
    }

    public static PersonalTrainer newEmployee()
    {
        System.out.println("***** Cadastro de prepardor fisico *****");
        double salary = askSalary();
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String email = askEmail();
        return new PersonalTrainer(salary, name, cpf, phone, email);
    }

    public static void showPersonalTrainer(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Lista de preparadores fisicos *****");
        for (Employee employee: listOfEmployee) {
            if(employee instanceof PersonalTrainer)
            {
                System.out.println("*********************************************************************************");
                employee.toString();
                System.out.println("*********************************************************************************");
            }
        }
    }
}
