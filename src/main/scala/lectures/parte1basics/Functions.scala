package lectures.parte1basics

object Functions extends App {

    def aFunction(a: String, b: Int): String = {
      a + " " + b
    }
    println(aFunction("hello", 3))

    def aParameterlessFunction(): Int = 42
    println(aParameterlessFunction())

  //QUANDO PRECISAR USAR LOOPS EM SCALA => USE FUNÇÕES RECURSIVAS
    def aRepeatedFunction(aString: String, n: Int): String = {
      if (n == 1) aString
      else aString + aRepeatedFunction(aString, n-1)
    }
    println(aRepeatedFunction("hello", 3))

    def aBigFunction(n: Int): Int ={
      def aSmallerFunction(a: Int, b: Int): Int = a + b
      aSmallerFunction(n, n-1)
    }
}
