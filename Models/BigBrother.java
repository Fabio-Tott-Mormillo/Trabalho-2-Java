package Models;

import Funcionario.Funcionario;
import Interfaces.PostarMensagem;

/**
 * Determina a assinatura a ser enviada (normal ou extra) para determinado membro
 * @return  retorna a assinatura correspondente à característica de cada membro (citadas no material disponibilizado pelo professor)
 */

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
