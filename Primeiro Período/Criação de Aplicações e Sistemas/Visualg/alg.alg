Algoritmo "ProcedimentoExemploParametro"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Procedimento com parametro
// Autor(a)    : Alan da Silva Alves
// Data atual  : 15/11/2021
procedimento soma(x,y:inteiro)
var
   aux: inteiro
inicio
   aux <- x + y
   res <- aux
fimprocedimento
Var
// Seção de Declarações das variáveis
res, n, m: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   n <- 4
   m <- -5
   soma(n,m)
   escreva(res)
Fimalgoritmo
