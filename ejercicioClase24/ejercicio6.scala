abstract class Animal(
  val nombre: String
)

class Perro(
  nombre: String
) extends Animal(nombre)

trait Procesador[-A] {
  def procesar(
    valor: A
  ): String
}


class ProcesadorAnimal
  extends Procesador[Animal] {
  
  def procesar(valor: Animal): String = {
    s"Procesando al animal: ${valor.nombre}"
  }
}

object Ejercicio6 {
  def main(args: Array[String]): Unit = {
    val miPerro = new Perro("Jaku")


    val procesadorDePerros: Procesador[Perro] = new ProcesadorAnimal()

    val resultado = procesadorDePerros.procesar(miPerro)
    println(resultado) 
  }
}