// SomarDoisNumeros.java

// nome da classe
class SomarDoisNumeros
{
  // modulo principal com a entrada pela linha de comando
  public static void main (String entrada[])
  {
    // declaracao de variaveis:
    int n1, n2, soma;

    // entrada de dados
    n1 = Integer.parseInt(entrada[0]);
    n2 = Integer.parseInt(entrada[1]);
    // processamento
    soma = n1 + n2;
    // saida de resultados
    // exemplo de uso:
    // java SomarDoisNumeros 47 153
    System.out.println(n1 + " + " + n2 + " = " + soma);
    System.exit(0);
  }
}
