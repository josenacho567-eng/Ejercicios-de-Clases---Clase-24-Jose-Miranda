class Caja[A](
  val contenido: A
){
    def obtener: A = contenido

    def combinar[B](otro: B): (A, B) = (contenido,otro)
}


object ejercicio1{
    def main(args: Array[String]): Unit = {
        val cajaNumero = new Caja(67)
        val cajaTexto = new Caja("lapiz")
        val cajaBoolena = new Caja(true)
        println(cajaNumero.contenido)
        println(cajaTexto.combinar("goma"))
        println(cajaBoolena.combinar(45))
    }
}