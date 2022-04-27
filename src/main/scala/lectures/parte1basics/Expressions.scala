package lectures.parte1basics

object Expressions extends App {

  val x = 1 + 2 //Expression
  println(x)

  println(2 + 3 *4)
  // = - * / & | ^ << >> >>> (deslocamento para direita com extensão zero)

  println(1 == x)
  // == != > >= < >=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 //Também funciona com -= *= /= .....side effects
  println(aVariable)

  //Instruções vs Expressões
  //Instruções são algo que você manda o computador fazer, Expressões é algo que tem valor ou tipo

  //O if em  Scala é uma EXPRESSÃO
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  //Nunca escreva isso de novo!
  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  //TUDO EM SCALA É EXPRESSÃO

  val aWeirdValue = (aVariable = 3) //Unit == void
  println(aWeirdValue)
  //Side effects: println(), whiles, reassigning

  //Code blocks
  val aCodeblock = {
    val y = 2
    val z = y +1

    if (z > 2) "olá" else "tchau"
  }

  //1 - Qual a diferença entre a string "olá mundo" e o println("olá mundo") ?
  //A string "olá mundo" é uma expressão e o println("olá mundo")
  //2 - Qual o valor abaixo? Resposta => True
    val someValue = {
    2 < 3
  }
  //3 - Qual o valor abaixo? Resposta =>
    val someOtherValue = {
      if(someValue) 239 else 986
      42
    }

}
