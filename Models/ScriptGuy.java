package Models

// Importações
import Funcionario.Funcionario;
import Interfaces.PostarMensagem;

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
