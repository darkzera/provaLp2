public class Item {
    private String nome;
    private int value;
    private int id;

    public Item(String nome, int value, int id) {
        this.nome = nome;
        this.value = value;
        this.id = id;
    }

    public Item(String nome, int value) {
        this.nome = nome;
        this.value = value;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item[" +
                "nome='" + nome + '\'' +
                ", value=" + value +
                ']';
    }



}
