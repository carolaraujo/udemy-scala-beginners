package exercises

object FunctionsExercises extends App {

//  1 - Escreva uma função de saudação (nome, idade) => "Oi, meu nome é ${nome} e eu tenho ${idade} anos"
//  2 - Escreva uma função fatorial, que é uma função matemática que calcula o produto de todos os números
//  até um determinado número que você passa como parâmetro. Uma função que calcule os produtos de todos os
//  números inteiros até o fim => Função fatorial 1 * 2 * 3 * .. * n  (Será uma função recursiva)
//  3- Escreva uma função com a sequência de Finonacci => f(1) = 1
//                                                        f(2) = 1
//                                                        f(n) = f(n -1) + f(n - 2)
//  4 - Escreva uma função que testa que o número é primo

//Resposta da 1
def saudacaoFunction(name: String, age: Int): String =
  "Oi, meu nome é " + name + " e eu tenho " + age + " anos"
  println(saudacaoFunction("Carol", 28))

//Resposta da 2
def factorial(n: Int): Int =
  if(n <= 0) 1
  else n * factorial(n - 1)
  println(factorial(5))

//Resposta da 3
def fibonacci(n: Int): Int =
  if(n <= 2) 1
  else fibonacci(n - 1) + fibonacci(n - 2)
  //Sequência de Fibonacci => 1 1 2 3 5 8 13 21
  println(fibonacci(8))

//Resposta da 4
def ehPrimo(n: Int): Boolean ={
  def ehPrimoAte(t: Int): Boolean =
    if (t <= 1) true
    else n % t != 0 && ehPrimoAte(t - 1)
    ehPrimoAte(n / 2)

    println(ehPrimo(37))
    println(ehPrimo(2003))
    println(ehPrimo(37 * 17))
}
}
