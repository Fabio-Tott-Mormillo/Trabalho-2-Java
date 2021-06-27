package Models;

import Funcionario.Funcionario;
import Interfaces.PostarMensagem;

/**
 * Determina a assinatura a ser enviada (normal ou extra) para determinado membro
 * @return  retorna a assinatura correspondente à característica de cada membro (citadas no material disponibilizado pelo professor)
 */


public class HeavyLifter extends Funcionario{

    public HeavyLifter(String nome, String email, String funcao) {
        super(nome, email, funcao);
    }

    @Override
    public void mensagemNormal() {
        System.out.println("Nome: "+this.getNome()+"Podem contar conosco");
    }
    
    @Override
    public void mensagemExtra(){
        System.out.println("Nome: "+this.getNome()+"N00b_qu3_n_Se_r3pita.bat");
    }
}
