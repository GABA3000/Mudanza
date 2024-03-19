package Controllers

import Dato.Customer
import Printer.Printer

class ClientsControllers {

    private val clientsList = mutableListOf<Customer>()
    private val printer = Printer()


    fun registerClient() {
        printer.msg("Ingresa tus nombres")
        val names = readln()
        printer.msg("Ingresa tu primer apellido")
        val firtsLastName = readln()
        printer.msg("Ingresa tu segundo apellido")
        val secondLastName = readln()
        printer.msg("Ingresa tu direccion")
        val address = readln()
        printer.msg("Ingresa tu RFC")
        val RFC = readln()
        printer.msg("Ingresa tu numero telefonico")
        val phoneNumber = readln().toLong()

        printer.msg("Ingresa tu EMAIL")
        val email = readln()
        val client = Customer(names,firtsLastName,secondLastName,address,RFC,phoneNumber,email)
        clientsList.add(client)

    }

    fun showClients() {
        if (clientsList.isEmpty()) {
            println("No hay lista de clientes:")
            return
        }
        println("Lista de clientes")
        for (clientes in clientsList)
            println(clientes.toString())


    }
    fun clientNoRegister(): Boolean = clientsList.isEmpty()

    fun showIndex(index: Int): Customer = clientsList [index]


}