package Command;

import soccer.club.employee.Player;

public class CreatePlayer implements Command{
    Player player;

    public CreatePlayer(Player player)
    {
        this.player = player;
    }

    @Override
    public void execute() {
        this.player = Player.newEmployee();
    }

    public Player getPlayer() {
        return player;
    }
}
