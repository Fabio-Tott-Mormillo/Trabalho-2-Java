package Menu;
import java.util.Scanner;

/** 
 * Registrar membros, gerenciá-los e indentificar a hora de serviço (normal ou extra)  
 * @param   getInitialInp()     recebe a primeira entrada de dados do usuário
 * @return  retorna o próximo valor inteiro
 */

public class Menu{
    private Scanner scanner = new Scanner(System.in);
    public int getInitialInp(){
        System.out.println(
            "\n" +
            "1 - Cadastrar novo membro\n" + 
            "2 - Apresentar membros cadastrados\n" + 
            "3 - Remover colaborador\n" + 
            "4 - Trocar jornada de trabalho\n" + 
            "5 - Postar mensagens\n" + 
            "9 - Sair"
        );
        return scanner.nextInt();
    }

    /** Cadastra os dados de um novo membro
     * @param   cadastrarMembro()   string que vai receber os dados do membro novo
     * @param   cadastro[]          cria vetor que armazena em ordem os dados (nome → email → função)
     * @return  retorna sucesso no cadastro
     */

    public String[] cadastrarMembro(){
        String cadastro[] = new String[3];
        scanner.nextLine();

        System.out.println("Nome: ");
        cadastro[0] = scanner.nextLine();
        System.out.println("Email: ");
        cadastro[1] = scanner.nextLine();

        System.out.println(
            "Funcao:\n" +
            "1 - BigBrother\n" + 
            "2 - HeavyLifter\n" + 
            "3 - MobileMember\n" +
            "4 - ScriptGuys"
        );
        cadastro[2] = scanner.nextLine();
        return cadastro; 
    }

    /**
     * Altera a hora de serviço de um membro
     * @param mudarJornada()    recebe um valor inteiro que determina a hora de serviço (Normal ou Extra)
     * @return  retorna o próximo valor inteiro
     */
    public int mudarJornada(){
        System.out.println(
            "1 - Normal\n" + 
            "2 - Extra"
        );
        return scanner.nextInt();
    }
}
