package soccer.club.employee;

import Command.*;
import utilities.Utilities;

import java.util.ArrayList;

import static utilities.Utilities.scanInt;

public abstract class Employee
{
    private double salary;
    private String name;
    private String cpf;
    private String phone;
    private String email;

    public Employee(double salary, String name, String cpf, String phone, String email)
    {
        this.salary = salary;
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
    }

    public String getCpf()
    {
        return this.cpf;
    }

    public String getName() {
        return name;
    }

    public static void addEmployee(ArrayList<Employee> listOfEmployee)
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
                employee = createPresident.getPresident();
                break;
            case 2:
                CreateCoach createCoach = new CreateCoach((Coach) employee);
                add.setCommand(createCoach);
                add.runRequest();
                employee = createCoach.getCoach();
                break;
            case 3:
                CreateCooker createCooker = new CreateCooker((Cooker) employee);
                add.setCommand(createCooker);
                add.runRequest();
                employee = createCooker.getCooker();
                break;
            case 4:
                CreateDriver createDriver = new CreateDriver((Driver) employee);
                add.setCommand(createDriver);
                add.runRequest();
                employee = createDriver.getDriver();
                break;
            case 5:
                CreateLawyer createLawyer = new CreateLawyer((Lawyer) employee);
                add.setCommand(createLawyer);
                add.runRequest();
                employee = createLawyer.getLawyer();
                break;
            case 6:
                CreateMedic createMedic = new CreateMedic((Medic) employee);
                add.setCommand(createMedic);
                add.runRequest();
                employee = createMedic.getMedic();
                break;
            case 7:
                CreateTrainer createTrainer = new CreateTrainer((PersonalTrainer) employee);
                add.setCommand(createTrainer);
                add.runRequest();
                employee = createTrainer.getPersonalTrainer();
                break;
            case 8:
                CreatePlayer createPlayer = new CreatePlayer((Player) employee);
                add.setCommand(createPlayer);
                add.runRequest();
                employee = createPlayer.getPlayer();
                break;
            default:
                System.out.println("Opcao invalida, operacao cancelada!");
        }
        if(employee != null){
            listOfEmployee.add(employee);
            System.out.println(employee.getName() + "adicionado");
        }
    }

    @Override
    public String toString() {
        return "Empregado: \nNome: " + this.name + "\nCpf: " + this.cpf;
    }
}
