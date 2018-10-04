package soccer.club.employee;

import utilities.Utilities.*;

import java.util.ArrayList;

import static utilities.Utilities.*;

public class President extends Employee
{
    public President(double salary, String name, String cpf, String phone, String email)
    {
        super(salary, name, cpf, phone, email);
    }

    public static President newEmployee()
    {
        System.out.println("***** Cadastro de presidente *****");
        double salary = askSalary();
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String email = askEmail();

        return new President(salary, name, cpf, phone, email);
    }

    public static void showPrsident(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Lista de presidentes *****");
        for (Employee employee: listOfEmployee) {
            if(employee instanceof President)
            {
                System.out.println("*********************************************************************************");
                employee.toString();
                System.out.println("*********************************************************************************");
            }
        }
    }
}
