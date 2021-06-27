package Funcionario;

//Importações
import Interfaces.Apresentacao;
import Interfaces.PostarMensagem;


public class Funcionario implements PostarMensagem, Apresentacao{
    public Funcionario(String nome, String email, String funcao) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }

    private String nome;
    private String email;
    private String funcao;

    /**
     * Receber nome público
     * @param   getNome()   a string recebe o nome
     * @return  retorna o nome público
     */    

    public String getNome() {
        return nome;
    }

    /**
     * Retornar email público
     * @param   getEmail()  a string recebe o email
     * @return retorna o email público 
     */

    public String getEmail() {
        return email;
    }

    @Override
    public void show() {
        System.out.println("Nome: "+nome+ "\tEmail: "+email+"\tFunção: "+funcao);
    }

    @Override
    public void mensagemExtra() {}
    @Override
    public void mensagemNormal() {}
}
