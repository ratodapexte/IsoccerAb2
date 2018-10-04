package Command;

import soccer.club.employee.*;

public class CreateEmployee implements Command{
    Employee employee;
    public CreateEmployee(Employee employee)
    {
      //  if(employee instanceof President)
            System.out.println("President");
        this.employee = employee;
    }

    public void execute()
    {
        if(this.employee instanceof President)
//            System.out.println("President");
            this.employee = President.newEmployee();
        if(this.employee instanceof Coach)
            this.employee = Coach.newEmployee();
        else if(this.employee instanceof Cooker)
            this.employee = Cooker.newEmployee();
        else if(this.employee instanceof Driver)
            this.employee = Driver.newEmployee();
        else if(this.employee instanceof Lawyer)
            this.employee = Lawyer.newEmployee();
        else if(this.employee instanceof Medic)
            this.employee = Medic.newEmployee();
        else if(this.employee instanceof PersonalTrainer)
            this.employee = PersonalTrainer.newEmployee();
        else if(this.employee instanceof Player)
            this.employee = Player.newEmployee();

//        System.out.println("Empregado " + this.employee.getName() + " foi criado");
    }
/*    public President getPresident()
    {
        return this.president;
    }*/
}
