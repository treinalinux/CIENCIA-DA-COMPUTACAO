import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscreveArquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Inoforme o numero de linhas do arquivo: ");
        int numeroLinhas = scanner.nextInt();

        FileWriter arquivo = new FileWriter("teste.txt");
        PrintWriter writer = new PrintWriter(arquivo);

        for (int i=1; i <= numeroLinhas; i++) {
            writer.printf("Esta é a linha de número " + i + "%n");
        }

        arquivo.close();
        System.out.printf("Arquivo escrito com sucesso!\n");
    }
}
