// Fabio Tott Mormillo RA: 19.00176-2
// Conrado Pupo Azzalin RA: 19.01490-2

import java.util.ArrayList;
import java.util.Scanner;

import Enumeradores.Horarios;
import Funcionario.Funcionario;
import Menu.Menu;
import Models.BigBrother;
import Models.HeavyLifter;
import Models.MobileMember;
import Models.ScriptGuy;

public class Main {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList();
        Horarios horario = Horarios.NORMAL;
        int inp;
        do {
            inp = menu.getInitialInp();
            switch (inp) {
                case 1:
                    String cadastro[] = new String[3];

                    cadastro = menu.cadastrarMembro();
                    String nome = cadastro[0], email = cadastro[1];
                    int funcao = Integer.parseInt(cadastro[2]);

                    switch (funcao) {
                        case 1:
                            funcionarios.add(new BigBrother(nome, email, "BigBrother"));
                            break;

                        case 2:
                            funcionarios.add(new HeavyLifter(nome, email, "HeavyLifter"));
                            break;
                        
                        case 3:
                            funcionarios.add(new MobileMember(nome, email, "MobileMember"));
                            break;

                        case 4:
                            funcionarios.add(new ScriptGuy(nome, email, "ScriptGuy"));
                            break;
                    
                        default:
                            break;
                    }
                    break;

                case 2:
                    for (Funcionario funcionario : funcionarios) {
                        funcionario.show();
                    }
                    break;

                case 3:
                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(i + " - " + funcionarios.get(i).getNome());
                    }
                    funcionarios.remove(scanner.nextInt());
                    break;

                case 4:
                    int inp1 = menu.mudarJornada();
                    if (inp1 == 1)
                        horario = Horarios.NORMAL;
                    else if (inp1 == 2)
                        horario = Horarios.EXTRA;
                    break;

                case 5:
                    for (Funcionario funcionario : funcionarios) {
                        if (horario == Horarios.NORMAL) {
                            funcionario.mensagemNormal();
                        }
                        else {
                            funcionario.mensagemExtra();
                        }
                    }
                case 9:
                    //Sair do sistema
                    break;

                default:
                    break;
            }
            System.out.println("Pressione ENTER para continuar");
            scanner.nextLine();
        }
    }
}

public class arquivo_super_Secreto_nao_abrir.csv {
    private String nome;
    private String email;
    private String funcao;

    public arquivo_super_Secreto_nao_abrir.csv (String nome, Integer idade, String email) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }
