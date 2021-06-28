package Models;

// Importações
import Funcionario.Funcionario;
import Interfaces.PostarMensagem;

/**
 * Determina a assinatura a ser enviada (normal ou extra) para determinado membro
 * @return  retorna a assinatura correspondente à característica de cada membro (citadas no material disponibilizado pelo professor)
 */


public class ScriptGuy extends Funcionario{

    public ScriptGuy(String nome, String email, String funcao) {
        super(nome, email, funcao);
    }

    @Override
    public void mensagemNormal() {
        System.out.println("Nome: "+this.getNome()+"Prazer em ajudar novos amigos de código!");
    }
    
    @Override
    public void mensagemExtra(){
        System.out.println("Nome: "+this.getNome()+"QU3Ro_S3us_r3curs0s.py");
    }
}
