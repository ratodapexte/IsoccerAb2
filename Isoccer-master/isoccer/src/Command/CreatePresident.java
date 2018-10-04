package Command;

import soccer.club.employee.President;

public class CreatePresident implements Command {
    President president;

    public CreatePresident(President president){
        this.president = president;
    }
    public void execute() {
        this.president = President.newEmployee();
    }

    public President getPresident() {
        return president;
    }
}
