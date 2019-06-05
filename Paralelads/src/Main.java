import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    //Arrays
    static ArrayList<Casa>array_casa = new ArrayList<Casa>();
    static ArrayList<Ap>array_ap = new ArrayList<Ap>();
    static ArrayList<Comercial>array_comercial = new ArrayList<Comercial>();
    static ArrayList<Casa_condo>array_condo = new ArrayList<Casa_condo>();

    public static void main(String [] args){

        /*---------------------------------------------------------------------*/
        int escolha;
        int i = 1;


        /*---------------------------------------------------------------------*/

        while(i == 1) {
            System.out.println("Meunu - (Digite):");
            System.out.println("1- Cadastrar");
            System.out.println("2- IPTU");
            System.out.println("3- Listar");
            System.out.println("4- Remover");

            escolha = input.nextInt();


            switch (escolha) {
                case 1:
                    cadastro();
                    break;
                case 2:
                    mostrarIptu();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    remover();
                    break;

            }

            System.out.println("Deseja fazer outra operacao? - se sim(1)  nao(2)");
            i = input.nextInt();
        }
    }

    public static void cadastro() {

        Scanner input = new Scanner(System.in);

        int escolha;
        String prop;
        String endereco;
        float tamanho;
        int ano;
        int andar;

        System.out.println("Escolha o tipo de imovel:");
        System.out.println("1 - Casa \n2 - Apart. \n3 - Comercial\n4 - Casa em cond.");
        escolha = input.nextInt();

        System.out.println("Proprietario :");
        input.nextLine();
        prop = input.nextLine();
        System.out.println("Endereco: ");
        endereco = input.nextLine();
        System.out.println("Tamanho :");
        tamanho = input.nextFloat();
        System.out.println("Ano de construcao :");
        ano = input.nextInt();


        switch (escolha){
            case 1:
                array_casa.add(new Casa(prop, endereco, tamanho, ano));
                break;
            case 2:
                System.out.println("Andar: ");
                andar = input.nextInt();
                array_ap.add(new Ap(prop, endereco, tamanho, ano, andar));
                break;
            case 3:
                array_comercial.add(new Comercial(prop, endereco, tamanho, ano));
                break;
            case 4:
                array_condo.add(new Casa_condo(prop, endereco, tamanho, ano));
                break;

        }
    }
//----------------------------------------------------------------------------------------------
    public static void mostrarIptu(){
       float iptu_casas = 0f;
        float iptu_ap = 0f;
        float iptu_comercial = 0f;
        float iptu_casas_condo = 0f;

        /* for para a CASA */
        for(int i=0; i<array_casa.size(); i++){
            if(array_casa.get(i) != null){
                iptu_casas+=array_casa.get(i).getIptu();
            }
        }
        System.out.println("Aqui esta o iptu das casa talkei:" + iptu_casas);

        for(int i=0; i<array_ap.size(); i++){
            if(array_ap.get(i) != null){
                iptu_ap+=array_ap.get(i).getIptu();
            }
        }
        System.out.println("Aqui esta o iptu dos ap talkei:" + iptu_ap);

        for(int i=0; i<array_comercial.size(); i++){
            if(array_comercial.get(i) != null){
                iptu_comercial+=array_comercial.get(i).getIptu();
            }
        }
        System.out.println("Aqui esta o iptu dos comercio talkei:" + iptu_comercial);

        for(int i=0; i<array_condo.size(); i++){
            if(array_condo.get(i) != null){
                iptu_casas_condo+=array_condo.get(i).getIptu();
            }
        }
        System.out.println("Aqui esta o iptu das casa condo talkei:" + iptu_casas_condo);
    }

    /*  Sistema de organização pelo collectios sort*/
    public static void listar(){
        Collections.sort(array_casa);
        Collections.sort(array_ap);
        Collections.sort(array_comercial);
        Collections.sort(array_condo);

        System.out.println("Casas aki:");
        for(int i=0; i<array_casa.size(); i++){
            if(array_casa.get(i) != null){
                System.out.println(array_casa.get(i).getEndereco());
                System.out.println(array_casa.get(i).getArea());
            }
        }
        System.out.println("Aps aki:");
        for(int i=0; i<array_ap.size(); i++){
            if(array_ap.get(i) != null){
                System.out.println(array_ap.get(i).getEndereco());
                System.out.println(array_ap.get(i).getArea());
            }
        }
        System.out.println("Comercios aki:");
        for(int i=0; i<array_comercial.size(); i++){
            if(array_comercial.get(i) != null){
                System.out.println(array_comercial.get(i).getEndereco());
                System.out.println(array_comercial.get(i).getArea());
            }
        }
        System.out.println("Casas condo aki:");
        for(int i=0; i<array_condo.size(); i++){
            if(array_condo.get(i) != null){
                System.out.println(array_condo.get(i).getEndereco());
                System.out.println(array_condo.get(i).getArea());
            }
        }

    }

    public static void remover(){
       int escolha;
       int op;
        System.out.println("Escolha o tipo de imovel que voce deseja remover:");
        System.out.println("1 - Casa \n2 - Apart. \n3 - Comercial\n4 - Casa em cond.");
        escolha = input.nextInt();

        switch (escolha){
            case 1:
                for(int i=0; i<array_casa.size(); i++){
                    if(array_casa.get(i) != null){
                        System.out.println(i+ " - " + array_casa.get(i).getProprietario());
                    }
                }
                System.out.println("Digite a opcao:");
                op = input.nextInt();

                array_casa.remove(op);
                break;
            case 2:
                for(int i=0; i<array_ap.size(); i++){
                    if(array_ap.get(i) != null){
                        System.out.println(i+ " - " + array_ap.get(i).getProprietario());
                    }
                }
                System.out.println("Digite a opcao:");
                op = input.nextInt();

                array_ap.remove(op);

                break;
            case 3:
                for(int i=0; i<array_comercial.size(); i++){
                    if(array_comercial.get(i) != null){
                        System.out.println(i+ " - " + array_comercial.get(i).getProprietario());
                    }
                }
                System.out.println("Digite a opcao:");
                op = input.nextInt();

                array_comercial.remove(op);

                break;
            case 4:
                for(int i=0; i<array_condo.size(); i++){
                    if(array_condo.get(i) != null){
                        System.out.println(i+ " - " + array_condo.get(i).getProprietario());
                    }
                }
                System.out.println("Digite a opcao:");
                op = input.nextInt();

                array_condo.remove(op);

                break;

        }


    }


}
