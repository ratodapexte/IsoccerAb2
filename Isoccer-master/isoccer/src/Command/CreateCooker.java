package Command;

import soccer.club.employee.Cooker;

public class CreateCooker implements Command {
    Cooker cooker;

    public CreateCooker(Cooker cooker){
        this.cooker = cooker;
    }

    public void execute() {
        this.cooker = Cooker.newEmployee();
    }

    public Cooker getCooker() {
        return cooker;
    }
}
