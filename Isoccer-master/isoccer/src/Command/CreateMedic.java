package Command;

import soccer.club.employee.Medic;

public class CreateMedic implements Command {
    Medic medic;

    public CreateMedic(Medic medic){
        this.medic = medic;
    }

    @Override
    public void execute() {
        this.medic = Medic.newEmployee();
    }

    public Medic getMedic() {
        return medic;
    }
}
