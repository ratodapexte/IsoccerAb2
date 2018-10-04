package Command;

import soccer.club.employee.Driver;

public class CreateDriver implements Command {
    Driver driver;
    public CreateDriver(Driver driver){
        this.driver = driver;
    }

    @Override
    public void execute() {
        this.driver = Driver.newEmployee();
    }

    public Driver getDriver() {
        return driver;
    }
}
