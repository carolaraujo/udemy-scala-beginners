package lectures.parte1basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)

  val aString: String = "Olá"
  val anotherString = "Tchau!"

  val aBoolean: Boolean = true //ou false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 46134613
  val aFloat: Float = 2.0f //Tem que ter esse f no final do número para o compilador entender que é um número flutuante, caso contrário ele entenderá que é um double
  val aDouble: Double = 3.14

  // variables
  var aVarianble: Int = 4
  aVarianble = 5 //side effects
  //side effects são usados em var  para nos mostrrar o comportamento do nosso programa por elas permitem mudanças no valor da variável

  //Prefira vals do que vars
  //Todas as var e vals possuem tipos
  //Compilador infere tipos automaticamente quando omitido
  //Aprenda a usar tipos básicos como Bollean, INT, Long e Double

}
