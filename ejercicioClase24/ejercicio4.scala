abstract class Vehiculo(
  val marca: String
)

class Automovil (
    marca: String
) extends Vehiculo(marca)
class Motocicleta (
    marca: String
) extends Vehiculo(marca)

class RegistroVehiculo[A <: Vehiculo](
  val vehiculo: A
)

object Ejercicio4 {
  def main(args: Array[String]): Unit = {
    // Pruebas válidas:
    val auto = new Automovil("Toyota")
    val moto = new Motocicleta("Yamaha")

    val registroAuto = new RegistroVehiculo(auto)
    val registroMoto = new RegistroVehiculo(moto)
    }
}