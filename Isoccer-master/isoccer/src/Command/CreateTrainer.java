package Command;

import soccer.club.employee.PersonalTrainer;

public class CreateTrainer implements Command {
    PersonalTrainer personalTrainer;

    public CreateTrainer(PersonalTrainer personalTrainer)
    {
        this.personalTrainer = personalTrainer;
    }

    @Override
    public void execute() {
        this.personalTrainer = PersonalTrainer.newEmployee();
    }

    public PersonalTrainer getPersonalTrainer() {
        return personalTrainer;
    }
}
