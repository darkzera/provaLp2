import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciadorDeArquivos {
    public static void salvar(String fileName,
                              String texto) throws IOException {
        // Neste método, sobreescreve o arquivo
        // anterior, se houver
        FileWriter arquivo = new FileWriter(fileName);
        BufferedWriter gravador = new BufferedWriter (arquivo);
        gravador.write(texto);
        gravador.close();
        arquivo.close();
    }

    public static void salvarComAppend(String fileName, String texto) throws IOException  {
        // Neste método, concatena-se o novo texto
        // ao final do arquivo
        // Atenção para segundo parametro "true" (append)
        FileWriter arquivo = new FileWriter(fileName, true);
        BufferedWriter gravador = new BufferedWriter(arquivo);
        gravador.append(texto);
        gravador.newLine();
        gravador.close();
        arquivo.close();
    }


    public static String ler(String fileName) throws IOException {
        String linha = "", result = "";
        FileReader arquivo = new FileReader(fileName);
        BufferedReader leitor = new BufferedReader(arquivo);

        while (linha != null ) {
            linha = leitor.readLine();
            if (linha != null) {
                result += linha + "\n";
            }
        }
        leitor.close();
        arquivo.close();
        return result;
    }


    public static Pessoa[] lePreenchendoVetorPessoas(String path) throws IOException {
        final int tam = 5;
        FileReader arquivo = new FileReader(path);
        BufferedReader leitor = new BufferedReader(arquivo);

        String linha = "";
        int qtdPessoas = 0;

        Pessoa[] pessoasCadastradas = new Pessoa[tam];

        while (linha != null) {
            linha = leitor.readLine();
            if (linha != null) {
                String[] vetor = linha.split(";");

                Pessoa novaPessoa = new Pessoa(
                        vetor[0],
                        vetor[1] // id
                );
                pessoasCadastradas[qtdPessoas] = novaPessoa;
                qtdPessoas++;
            }
        }

        leitor.close();
        arquivo.close();

        return pessoasCadastradas;
    }


    public static Item[] lePreenchendoVetorItem(String path) throws IOException {
        final int tam = 12;
        FileReader arquivo = new FileReader(path);
        BufferedReader leitor = new BufferedReader(arquivo);

        String linha = "";
        int qtdItem= 0;

        Item[] itemCadastrado = new Item[tam];

        while (linha != null) {
            linha = leitor.readLine();
            if (linha != null) {
                String[] vetor = linha.split(";");
                Item novoItem = new Item(
                        vetor[0],
                        Integer.parseInt(vetor[1]));
                itemCadastrado[qtdItem] = novoItem;
                qtdItem++;
            }
        }

        leitor.close();
        arquivo.close();

        return itemCadastrado;
    }


    // Aqui nois faz uma gambiarra recebendo o arr de pessoas p
    // pra fazer a montagem de mochila com itens usando o mesmo arquivo
    public static Bag[] lePreenchendoVetorBag(String path, Pessoa[] pessoasArr) throws IOException {
        final int tam = 20;
        FileReader arquivo = new FileReader(path);
        BufferedReader leitor = new BufferedReader(arquivo);
        String linha = "";
        int qtdBag= 0;
        Bag[] bagsCadastradas = new Bag[tam];

        while (linha != null) {
            linha = leitor.readLine();
            if (linha != null) {
                String[] vetor = linha.split(";");
                // criacao da minha bag
                Pessoa p = Helper.getByID(pessoasArr, vetor[0]);
                if (p != null) {
                    Bag novaBag = new Bag(p);
                    p.setBag(novaBag);
                        novaBag.addItem(new Item(vetor[i], Integer.parseInt(vetor[i+1]))); // fix this gambiarra
                        i++;
                    }
                    bagsCadastradas[qtdBag] = novaBag;
                    qtdBag++;
                }
            }
        }

        leitor.close();
        arquivo.close();

        return bagsCadastradas;
    }


}