object ejercicio2 {
    def seleccionarPrimero[A](
  primero: A,
  segundo: A
): A = primero

    def main(args: Array[String]): Unit = {
        println(seleccionarPrimero(4,"hola"))
        println(seleccionarPrimero("hola",true))
        println(seleccionarPrimero(false,67))
    }

}