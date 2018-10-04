package Command;

import soccer.club.employee.*;

import java.util.ArrayList;

import static utilities.Utilities.*;

public class EmployeeTest {
    public static void newEmployee(ArrayList<Employee> listOfEmployee)
    {
        System.out.println("***** Cadastro de empregado *****");
        System.out.println("Tipos:%n1 - Presidente%2 - Medico%n3 - Tecnico%n4 - Preparador Fisico%n5 - Motorista%n" +
                "6 - Cozinheiro%n7 - Advogado%n8 - Jogador");
        int choice = scanInt();
        AddNewEmployee add = new AddNewEmployee();
        Employee employee = null;

        switch(choice) {
            case 1:
                CreatePresident createPresident = new CreatePresident((President) employee);
                add.setCommand(createPresident);
                add.runRequest();
                employee = createPresident.president;
                break;
            case 2:
                CreateCoach createCoach = new CreateCoach((Coach) employee);
                add.setCommand(createCoach);
                add.runRequest();
                employee = createCoach.coach;
                break;
            case 3:
                CreateCooker createCooker = new CreateCooker((Cooker) employee);
                add.setCommand(createCooker);
                add.runRequest();
                employee = createCooker.cooker;
                break;
            case 4:
                CreateDriver createDriver = new CreateDriver((Driver) employee);
                add.setCommand(createDriver);
                add.runRequest();
                employee = createDriver.driver;
                break;
            case 5:
                CreateLawyer createLawyer = new CreateLawyer((Lawyer) employee);
                add.setCommand(createLawyer);
                add.runRequest();
                employee = createLawyer.lawyer;
                break;
            case 6:
                CreateMedic createMedic = new CreateMedic((Medic) employee);
                add.setCommand(createMedic);
                add.runRequest();
                employee = createMedic.medic;
                break;
            case 7:
                CreateTrainer createTrainer = new CreateTrainer((PersonalTrainer) employee);
                add.setCommand(createTrainer);
                add.runRequest();
                employee = createTrainer.personalTrainer;
                break;
            case 8:
                CreatePlayer createPlayer = new CreatePlayer((Player) employee);
                add.setCommand(createPlayer);
                add.runRequest();
                employee = createPlayer.player;
                break;
            default:
                System.out.println("Opcao invalida, operacao cancelada!");
        }
            if(employee != null){
                listOfEmployee.add(employee);
                System.out.println(employee.getName() + "adicionado");
            }
    }

    public static void main(String[] args)
    {
        ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
        newEmployee(listOfEmployee);
        newEmployee(listOfEmployee);
        newEmployee(listOfEmployee);

        for (Employee employee: listOfEmployee) {
            System.out.println(employee.getName());
        }
    }
}
