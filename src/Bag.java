import java.util.ArrayList;

public class Bag {
   private ArrayList<Item> items = new ArrayList<>();
   private Item[] itens;
   private String id;
   private Pessoa owner;


   public Bag(Pessoa p){
       this.owner = p;
   }

    public Bag(ArrayList<Item> items) {
        this.items = items;
    }

    public Bag(String i) {
        this.id = i;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pessoa getOwner() {
        return owner;
    }

    public void setOwner(Pessoa owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String result = " ----";
        for (int j = 0; j < items.size() ; j++) {
            result += items.get(j).toString();
        }
        return result;


    }



}
