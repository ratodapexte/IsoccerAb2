package Command;

import soccer.club.employee.Lawyer;

public class CreateLawyer implements Command {
    Lawyer lawyer;

    public CreateLawyer(Lawyer lawyer)
    {
        this.lawyer = lawyer;
    }

    @Override
    public void execute() {
        this.lawyer = Lawyer.newEmployee();
    }

    public Lawyer getLawyer() {
        return lawyer;
    }
}
