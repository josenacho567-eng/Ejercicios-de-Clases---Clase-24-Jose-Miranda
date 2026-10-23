abstract class Animal(
    val nombre: String
    )

class Perro(
    nombre: String
    ) extends Animal(nombre)
class Gato(
    nombre: String
    ) extends Animal(nombre)


trait Productor[+A] {
  def producir: A
}

trait Consumidor[-A] {
  def consumir(valor: A): String
}


class ProductorPerro extends Productor[Perro] {
  def producir: Perro = new Perro("Firulais")
}

class ConsumidorAnimal extends Consumidor[Animal] {
  def consumir(valor: Animal): String = s"Consumiendo al animal: ${valor.nombre}"
}

object Ejercicio7 {
  def main(args: Array[String]): Unit = {

    val productorPerro: Productor[Perro] = new ProductorPerro()
    val productorAnimal: Productor[Animal] = productorPerro 
    
    println(s"Productor produce: ${productorAnimal.producir.nombre}")

    val consumidorAnimal: Consumidor[Animal] = new ConsumidorAnimal()
    val consumidorGato: Consumidor[Gato] = consumidorAnimal 

    val miGato = new Gato("noc")
    println(consumidorGato.consumir(miGato))
  }
}