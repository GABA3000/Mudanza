package Controllers

import Dato.Customer
import Dato.Delivery
import Printer.Printer

class DeliveryControllers {

    private val printer = Printer()
    private val deliveryList = mutableListOf<Delivery>()

    fun registerDelivery(){
        printer.msg("Ingresa tus nombres")
        val names = readln()
        printer.msg("Ingresa tu primer apellido")
        val firstLastName = readln()
        printer.msg("Ingresa tu segundo apellido")
        val secondLastName = readln()
        printer.msg("Ingresa tu RFC")
        val RFC = readln()
        printer.msg("Ingresa tu numero telefonico")
        val phoneNumber = readln()
        printer.msg("Ingresa tu EMAIL")
        val email = readln()
        printer.msg("Ingresa tu direccion")
        val address = readln().toInt()
        printer.msg("Ingresa tu numero de identificaion")
        val numberDelivery = readln()
        val delivery = Delivery(names,firstLastName,secondLastName,RFC,phoneNumber,email,address,numberDelivery)
        deliveryList.add(delivery)


    }

    fun showDelivery(){
            if (deliveryList.isEmpty()) {
                println("No hay lista de empleados:")
                return
            }
            println("Lista de empleados")
            for (delivery in deliveryList)
                println(delivery.toString())
    }

    fun deliveryNoRegister() = deliveryList.isEmpty()

    fun showIndex(index: Int): Delivery = deliveryList [index]
}