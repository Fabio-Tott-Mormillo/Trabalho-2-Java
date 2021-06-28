package Models;

import Funcionario.Funcionario;
import Interfaces.PostarMensagem;

/**
 * Determina a assinatura a ser enviada (normal ou extra) para determinado membro
 * @return  retorna a assinatura correspondente à característica de cada membro (citadas no material disponibilizado pelo professor)
 */


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
