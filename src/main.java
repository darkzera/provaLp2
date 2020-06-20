import java.io.IOException;

public class main {
    public static void main(String[] args)throws IOException  {

        Interface n = new Interface();

        Pessoa[] pessoas = n.mount();


        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].getNome() + " - " + pessoas[i].getItens());
        }



    }
}
