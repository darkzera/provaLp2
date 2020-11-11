import java.io.IOException;
import java.util.ArrayList;

public class Interface {
    private Pessoa[] pessoas;


    public Interface() throws IOException {
        mount();
    }

    public Pessoa[] mount()throws IOException {
        this.pessoas = GerenciadorDeArquivos.lePreenchendoVetorPessoas("pessoa.txt");
        Bag[] bags = GerenciadorDeArquivos.lePreenchendoVetorBag("bag.txt", pessoas);
        return this.pessoas;
   }



}
