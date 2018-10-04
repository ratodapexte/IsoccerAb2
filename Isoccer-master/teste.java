public interface Command {
	public void execute();
}

public class AddNewEmployee{
	Command slot;

	public AddNewEmployee(){}

	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
} //invoker

public class Employee{

 public static void newEmployee(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Cadastro de empregado *****");
        System.out.printf("Tipos:%n1 - Presidente%2 - Medico%n3 - Tecnico%n4 - Preparador Fisico%n5 - Motorista%n" +
                "6 - Cozinheiro%n7 - Advogado%n8 - Jogador");
        int choice = scanInt();
        AddNewEmployee add = new AddNewEmployee();
        Employee employee = null;

        switch(choice) {
            case 1:
                NewPresident newPresident = new newPresident((President) employee);
                add.setCommand(newPresident);
                break;
            case 2:
                NewMedic newMedic = new NewMedic((Medic) employee);
                add.setCommand(newMedic);
                break;
            case 3:
				NewCoach newCoach = new NewCoach((Coach) employee);
				add.setCommand(newCoach);	
                break;
            case 4:
                NewPersonalTrainer newPersonalTrainer = new NewPersonalTrainer((PersonalTrainer) employee);
                add.setCommand(newPersonalTrainer);
                break;
            case 5:
            	NewDriver newDriver = new NewDriver((Driver) employee);
                add.setCommand(newDriver);
                break;
            case 6:
                NewCooker newCooker = new NewCooker((Cooker) employee);
				add.setCommand(newCooker);
                break;
            case 7:
            	NewLawyer newLawyer = new NewLawyer((Lawyer) employee);
            	add.setCommand(newLawyer);
                break;
            case 8:
				NewPlayer newPlayer = new NewPlayer((Player) player);
				add.setCommand(newPlayer);
                break;
            default:
                System.out.println("Opcao invalida, operacao cancelada!");
        }
        add.buttonWasPressed();
        
        if(employee != null)
	        listOfEmployee.add(employee);
    }
} //Reciever

public class NewPresident implements Command{
	President president;
	public NewPresident(President president){
		this.president = president;
	}

	public void execute()
	{
		this.president = this.newPresident();
	}

} //comando concreto

public class NewMedic implements Command{
	Medic medic;
	public NewMedic(Medic medic){
		this.medic = medic;
	}

	public void execute()
	{
		this.medic = this.newMedic();
	}

} //comando concreto

public class NewCoach implements Command{
	Coach coach;
	public newCoach(Coach coach){
		this.coach = coach;
	}

	public void execute()
	{
		this.coach = this.newCoach();
	}

} //comando concreto
public class NewPersonalTrainer implements Command{
	PersonalTrainer personalTrainer;
	public NewPersonalTrainer(PersonalTrainer personalTrainer){
		this.personalTrainer = personalTrainer;
	}

	public void execute()
	{
		this.personalTrainer = this.newPersonalTrainer();
	}

} //comando concreto
public class NewDriver implements Command{
	Driver driver;
	public NewDriver(Driver driver){
		this.driver = driver;
	}

	public void execute()
	{
		this.driver = this.newDriver();
	}

} //comando concreto
public class NewCooker implements Command{
	Cooker cooker;
	public NewCooker(Cooker cooker){
		this.cooker = cooker;
	}

	public void execute()
	{
		this.cooker = this.newCooker();
	}

} //comando concreto
public class NewLawyer implements Command{
	Lawyer lawyer;
	public NewLawyer(Lawyer lawyer){
		this.lawyer = lawyer;
	}

	public void execute()
	{
		this.lawyer = this.newLawyer();
	}

} //comando concreto
public class NewPlayer implements Command{
	Player player;
	public NewPlayer(Player player){
		this.player = player;
	}

	public void execute()
	{
		this.player = this.newPlayer();
	}
} //comando concreto


