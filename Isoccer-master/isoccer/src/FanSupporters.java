import static utilities.Utilities.*;
import java.util.ArrayList;

abstract public class FanSupporters
{
    private String addres;
    private String cpf;
    private String name;
    private String phone;
    private String status;

    public FanSupporters(String addres, String cpf, String name, String phone, String status)
    {
        this.addres = addres;
        this.cpf = cpf;
        this.name = name;
        this.phone = phone;
        this.status = status;
    }
    public static void changeContribuition(ArrayList<FanSupporters> listOfFan, double junior, double senior,
                                           double elite)
    {
        for (FanSupporters fan: listOfFan) {
            if(fan instanceof Junior)
                ((Junior) fan).setContribuition(junior);
            else if(fan instanceof Senior)
                ((Senior) fan).setContribuition(senior);
            else
                ((Elite) fan).setContribuition(elite);
        }
    }

    public static void newFanSupporter(ArrayList<FanSupporters> listOfFan, double junior, double senior, double elite) {
        System.out.println("***** Cadastro do socio *****");
        String name = askName();
        String cpf = askCpf();
        String phone = askPhone();
        String addres = askAddres();
        int choice;
        String status = "ADIPLENTE";

        System.out.println("Escolha o tipo do socio:\n1 - Junior\n2 - Senior\n3 - Elite\nOpcao: ");

        while(true)
        {
            choice = scanInt();
            if(choice > 0 || choice < 4)
                break;
            System.out.printf("Entre com a opcao correta!!!%nOpcao: ");
        }

        System.out.println("Entre o dia de pagamento: ");
        int paymentDay = scanInt();

        if(choice == 1)
        {
            Junior juniorC = new Junior(junior, paymentDay, addres, cpf, name, phone, status);
            listOfFan.add(juniorC);
        }
        else if(choice == 2)
        {
            Senior seniorC = new Senior(senior, paymentDay, addres, cpf, name, phone, status);
            listOfFan.add(seniorC);
        }
        else
        {
            Elite eliteC = new Elite(elite, paymentDay, addres, cpf, name, phone, status);
            listOfFan.add(eliteC);
        }

    }

    public static void changeFanType(ArrayList<FanSupporters> listOfFan, double junior, double senior, double elite)
    {
        int index = getFanByCpf(listOfFan);
        if(index != -1)
        {
            System.out.printf("Status do fan sera alterado!" +
                    "%n Deseja continuar? (s/N)");
            String choice = scanString();
            FanSupporters fan = listOfFan.get(index);
            if(choice.toUpperCase().equals("S"))
            {
                System.out.print("Digite uma das opcoes: junior, senior ou elite");
                choice = scanString();

                if(choice.toUpperCase().equals("JUNIOR")){
                    ((Junior) fan).setContribuition(junior);
                    listOfFan.set(index, ((Junior) fan));
                }
                else if(choice.toUpperCase().equals("SENIOR")){
                    ((Senior) fan).setContribuition(junior);
                    listOfFan.set(index, ((Senior) fan));
                }
                else if(choice.toUpperCase().equals("ELITE")){
                    ((Elite) fan).setContribuition(junior);
                    listOfFan.set(index, ((Elite) fan));
                }
                else
                    System.out.println("Escolha inválida! Dados mantidos.");
            }
            else
                System.out.println("Escolha inválida! Dados mantidos.");
        }
        else
            System.out.println("Socio nao encontrado.");
    }


    public static  void verifyPayment(ArrayList<FanSupporters> listOfFan)
    {
        int index = getFanByCpf(listOfFan);
        if(index != -1) {
            System.out.printf("Socio faz o pagamento no dia " + listOfFan.get(index).getPaymentDay() +
                    ". Verificar se foi pago.");
            System.out.print("Foi feito o pagamento? (s/N)");
            String choice = scanString();

            if (choice.toUpperCase().equals("S")) {
                listOfFan.get(index).status = "ADIPLENTE";
            } else if (choice.toUpperCase().equals("N")) {
                listOfFan.get(index).status = "INADIPLENTE";
            } else
                System.out.println("Escolha inválida! Dados mantidos.");
        }
        else
            System.out.println("Socio nao encontrado.");
    }

    public static void showFans(ArrayList<FanSupporters> listOfFan)
    {
        System.out.println("***** Socios *****");

        System.out.printf("Clube tem um total de " + listOfFan.size() + " socios.%n%n");

        System.out.printf("Socios Inadiplentes: %n%n");

        for (FanSupporters fan: listOfFan){
            if (fan.status.equals("INADIPLENTE"))
                System.out.printf("Nome: " + fan.name + ", cpf: " + fan.cpf + ", contribuicao: " +
                        fan.getContribuition() + "%n%n");
        }

        System.out.printf("Socios Adiplentes: %n%n");

        for (FanSupporters fan: listOfFan){
            if (fan.status.equals("ADIPLENTE"))
                System.out.printf("Nome: " + fan.name + ", cpf: " + fan.cpf + ", contribuicao: " +
                        fan.getContribuition() + "%n%n");
        }
    }

    public  static int getFanByCpf(ArrayList<FanSupporters> listOfFan)
    {
        System.out.println("***** Busca socio por cpf *****");
        String cpf = askCpf();
        for (FanSupporters fan: listOfFan) {
            if (fan.cpf.equals(cpf))
                return listOfFan.indexOf(fan);
        }
        return -1;
    }

    public abstract double getContribuition();
    public abstract int getPaymentDay();
}
