
class Persona(
    val nombre: String
    )


class Resultado[A](
  val valor: A,
  val exitoso: Boolean,
  val mensaje: String
)

object Ejercicio8 {
  def main(args: Array[String]): Unit = {
   
    val resultadoInt: Resultado[Int] = new Resultado(42, true, "Operación exitosa")
    
    
    val resultadoString: Resultado[String] = new Resultado("Hola Scala", true, "Mensaje encontrado")
    
   
    val persona = new Persona("Ana")
    val resultadoPersona: Resultado[Persona] = new Resultado(persona, true, "Persona registrada")

    
    println(s"Resultado Int -> Valor: ${resultadoInt.valor}, Exitoso: ${resultadoInt.exitoso}, Mensaje: ${resultadoInt.mensaje}")
    println(s"Resultado String -> Valor: ${resultadoString.valor}, Exitoso: ${resultadoString.exitoso}, Mensaje: ${resultadoString.mensaje}")
    println(s"Resultado Persona -> Valor: ${resultadoPersona.valor.nombre}, Exitoso: ${resultadoPersona.exitoso}, Mensaje: ${resultadoPersona.mensaje}")
  }
}