package Models;

import Funcionario.Funcionario;
import Interfaces.PostarMensagem;

public class MobileMember extends Funcionario{

    public MobileMember(String nome, String email, String funcao) {
        super(nome, email, funcao);
    }

    @Override
    public void mensagemNormal() {
        System.out.println("Nome: "+this.getNome()+"Happy Coding!");
    }
    
    @Override
    public void mensagemExtra(){
        System.out.println("Nome: "+this.getNome()+"Happy_C0d1ng. Maskers");
    }
}
