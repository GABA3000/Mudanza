package Controllers

dimport Dato.Customer
import Printer.Printer

class Menu {

    private val printer = Printer()
    private val clientsControllers = ClientsControllers()
    private val deliveryControllers = DeliveryControllers()
    private val removalControllers = RemovalControllers()

    fun showMenu() {

        printer.apply {
            msg("Bienvenido a la empresa de mundanza mexicana")
            msg("Ingresa una opcion")
            msg("1.-Registrar cliente")
            msg("2.-Registrar empleado")
            msg("3.-Realizar solicitud de mundaza")
            msg("4.-Mostrar clientes")
            msg("5.-Mostrar empleados")
            msg("6.-Modificar Mudanza")
        }
        val selectOption = readln().toInt()
        options(selectOption)

    }

    private fun options(selectOption: Int) {

        when (selectOption) {

            1 -> {
                clientsControllers.registerClient()
                showMenu()
            }

            2 -> {
                deliveryControllers.registerDelivery()
                showMenu()
            }

            3 -> {
                selectCostumerAndDelivery()
            }

            4 -> {
                clientsControllers.showClients()
                showMenu()
            }

            5 -> {
                deliveryControllers.showDelivery()
                showMenu()
            }

          //  6-> {
                //removalControllers.modificarSolicitud()
        }
    }


    fun selectCostumerAndDelivery() {
        if (clientsControllers.clientNoRegister()) {
            printer.msg("Clientes no registrados")
            showMenu()
            return
        }

        if (deliveryControllers.deliveryNoRegister()) {
            printer.msg("Empleados no registrados")
            showMenu()
            return
        }

        printer.msg("Seleccionar cliente")
        clientsControllers.showClients()
        val clientIndex = readln().toInt()
        val client = clientsControllers.showIndex(clientIndex - 1)

        printer.msg("Seleccionar empleado")
        deliveryControllers.showDelivery()
        val deliveryIndex = readln().toInt()
        val delivery = deliveryControllers.showIndex(deliveryIndex - 1)


        removalControllers.requestRemoval(client, delivery)

    }
}