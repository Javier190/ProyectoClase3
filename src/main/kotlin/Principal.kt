
    fun main(parametro: Array<String>) {

        var nombre:String
        var edad:Int
        var temperatura:Double
        var sexo: Char

        nombre = "Javier"
        edad = 30
        edad = edad*3
        temperatura = 37.2
        sexo = 'M'

        println("Hola " + nombre + ", tienes " + edad + " años !" + ", de sexo: " + sexo + ", hoy tenemos " + temperatura + " grados")
        println("nombre edad $edad $temperatura")


        //Ejercicio1 Act 3
        val lado = 50
        val perimetro = lado * 4
        val superficie = lado * lado
        print("El perímetro de un cuadrado de lado $lado es $perimetro y su superficie es $superficie")

        //Ejercicio2 Act 3
        val peso1 = 89.4f
        val peso2 = 67f
        val peso3 = 87.45f
        val promedio = (peso1 + peso2 + peso3) / 3
        println("El promedio de los tres pesos de personas es $promedio")

    }




