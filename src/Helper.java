public class Helper {

    public static Pessoa getByID(Pessoa[] pArr, String id) {

        for (Pessoa pessoa : pArr) {
            if (pessoa.getId().equals(id)) {
                return pessoa;
            }else{
            System.out.println("Falha ao encontrar uma pessoa!");
            }
        }

        return null;
    }

    public static Pessoa getByName(String name, Pessoa[] pArr){

        for (Pessoa pessoa : pArr) {
            if (pessoa.getNome().equalsIgnoreCase(name)) {
                return pessoa;
            }
        }

        return null;
    }



}
