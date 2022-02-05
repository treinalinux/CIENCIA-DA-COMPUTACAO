// MeuPrimeiroProgramaJava.java

// nome da classe
class MeuPrimeiroProgramaJava
{
  // modulo principal com a entrada pela linha de comando
  public static void main (String entrada[])
  {
    // declaracao de variaveis:
    // tipo nome recebe valor ponto e virgula
    int inteiro = 27;
    char caracter = 'M';
    double real = 1.90;
    // String é direfente de char
    String nome = "Alan Alves";
    boolean VF = true;

    if (VF == true)
    {
      System.out.println("Eu sou o " + nome + " tenho " + inteiro + " anos e tenho " + real + "m de altura.");
    }
    System.exit(0);
  }
}
