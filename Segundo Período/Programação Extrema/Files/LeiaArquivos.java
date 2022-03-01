import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class LeiaArquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" Informe o caminho absoluto do arquivo texto: ");
        String caminhoArquivo = scanner.nextLine();

        try {
            FileReader arquivo = new FileReader(caminhoArquivo);
            BufferedReader reader = new BufferedReader(arquivo);

            String linha = reader.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = reader.readLine();
            }
            arquivo.close();
        } catch (IOException e) {
           System.out.printf("Erro na abertura do arquivo %s.\n", e.getMessage());
        } 
     System.out.println(); 
    }
}
