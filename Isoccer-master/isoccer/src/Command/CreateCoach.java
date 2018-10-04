package Command;

import soccer.club.employee.Coach;

public class CreateCoach implements Command {
    Coach coach;

    public CreateCoach(Coach coach) {
        this.coach = coach;
    }

    public void execute() {
        this.coach = Coach.newEmployee();
    }

    public Coach getCoach() {
        return coach;
    }
}
