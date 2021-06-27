package Models;

import Funcionario.Funcionario;
import Interfaces.PostarMensagem;

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
