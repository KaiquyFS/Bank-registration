package projeto.tuturial;

import Cadastro.Pessoa;


public class ProjetoTuturial {

 
    public static void main(String[] args) {
            Pessoa novaPessoa = new Pessoa("Joao", 25, 2000, 1929302112);
            System.out.println(novaPessoa.getNome());
            novaPessoa.setNome("Marcos");
            System.out.println(novaPessoa.getNome());
            }
    
}
