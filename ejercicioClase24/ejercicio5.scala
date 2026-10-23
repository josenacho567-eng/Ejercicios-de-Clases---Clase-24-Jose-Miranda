abstract class Animal(
  val nombre: String
)
class Perro(
  nombre: String
) extends Animal(nombre)

class Contenedor[+A](
  val valor: A
)

object Ejercicio5 {
  def main(args: Array[String]): Unit = {
   
    val contenedorPerro: Contenedor[Perro] = new Contenedor(new Perro("Rocky"))


    val contenedorAnimal: Contenedor[Animal] = contenedorPerro

    println("Asignación válida realizada con éxito.")
  }
}