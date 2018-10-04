package Command;

public class AddNewEmployee {
    Command slot;

    public AddNewEmployee(){System.out.println("Novo command criado");}

    public void setCommand(Command command) {
        System.out.println("Comando setado");
        slot = command;
    }

    public void runRequest() {
        System.out.println("Rodando solicitacao");
        slot.execute();
    }
}
