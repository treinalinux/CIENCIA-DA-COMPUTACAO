Algoritmo "FuncaoMostreNaTelaParam"
// Disciplina  : [Criação de Aplicações e Sistemas]
// Professor   : Lucy Mari
// Descrição   : Procedimento com parametro na atividade prática
// Autor(a)    : Alan da Silva Alves
// Data atual  : 15/11/2021
funcao mostreNaTela(texto:caracter):caracter
var
   frase:caracter
inicio
      // n,m e res são variáveis globais
      frase <- texto
      retorne frase
fimfuncao
Var
// Seção de Declarações das variáveis
   res:caracter
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Mensagem da funcao: ")
   res <- mostreNaTela("Minha primeira funcao com parametro")
   escreva(res)
Fimalgoritmo
