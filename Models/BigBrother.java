package Models;

import Funcionario.Funcionario;
import Interfaces.PostarMensagem;

public class BigBrother extends Funcionario{

    public BigBrother(String nome, String email, String funcao) {
        super(nome, email, funcao);
    }

    @Override
    public void mensagemNormal() {
        System.out.println("Nome: "+this.getNome()+"Sempre ajudando as pessoas membros ou não S2!");
    }
    
    @Override
    public void mensagemExtra(){
        System.out.println("Nome: "+this.getNome()+"...");
    }
}
