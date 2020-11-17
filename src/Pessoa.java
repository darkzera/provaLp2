import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private Bag bag;
    private String id;

    public Pessoa(String nome) {
        this.nome = nome;
        this.id = randomAlpha(12);
    }
    public Pessoa(String nome, String id){
        this.nome = nome;
        this.id = id;
    }
    public Pessoa(String nome, Bag b) {
        this.nome = nome;
        this.bag = b;
        this.id = randomAlpha(12);
    }

    // Função utilizada para fazer o get dos itens.
    public String getItens(){
        String result = "";
        ArrayList<Item> items = this.bag.getItems();
        for (int i = 0; i < this.bag.getItems().size() ; i++) {
            result += this.bag.getItems().get(i).getNome() + "\n $" + this.bag.getItems().get(i).getValue();
        }

        return result;
    }



    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                "ID ='" + id + '\'' +
                '}';
    }

    public void addBag(Bag b){
        this.bag = b;
    }

    private String randomAlpha(int byteLength){
        SecureRandom secureRandom = new SecureRandom();
        byte[] token = new byte[byteLength];
        secureRandom.nextBytes(token);
        return new BigInteger(1, token).toString(16);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
