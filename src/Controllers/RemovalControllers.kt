package Controllers

import Dato.Customer
import Dato.Delivery
import Dato.Removal
import Printer.Printer

class RemovalControllers {

    private val printer = Printer()
    private val removalList = mutableListOf<Removal>()


    fun requestRemoval(customer: Customer, delivery: Delivery) {
        printer.msg("Ingresar numero de vehiculo")
        val numberVehicle = readln()
        printer.msg("Ingresa tipo de vehiculo")
        val vehicle = readln()
        printer.msg("Ingresa el fecha de entrega")
        val dateRemoval = readln()
        printer.msg("Ingresa la direccion de origen y destino")
        val addressOriginDestiny = readln()
        val removal = Removal(customer, delivery, numberVehicle, vehicle, dateRemoval, addressOriginDestiny)
        removalList.add(removal)
    }

    val client = mutableListOf<Customer>()
    val delivery = mutableListOf<Delivery>()
    val requests = mutableListOf<Removal>()

   // fun modificarSolicitud(dateRemoval: String, newAddressOriginDestiny: String): Unit {
        //val solicit = requests.find { it.dateRemoval == dateRemoval }
       // if (solicit != null) {
         //   solicit.addressOriginDestiny = newAddressOriginDestiny
         //   println("Solicitud de mudanza modificada exitosamente.")

      //  } else {
         //   println("No se encontró ninguna solicitud de mudanza con el ID proporcionado.")
       // }
    }