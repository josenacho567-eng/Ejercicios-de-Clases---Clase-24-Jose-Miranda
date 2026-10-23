object ejercicio3 {
    def transformar[A, B](valor: A,funcion: A => B): B = funcion(valor)


    def main(args: Array[String]): Unit = {
        println(transformar(4,num=>num.toString()))
        println(transformar("Miranda", pal=>pal.length()))
        println(transformar(6.7,num => num > 5))
    }
}