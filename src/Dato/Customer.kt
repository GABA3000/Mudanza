package Dato

class Customer(
    val address: String,
    names: String,
    firstLastName: String,
    secondLastName: String,
    RFC: String,
    phoneNumber: Number,
    email: String
): Person(names, firstLastName, secondLastName, RFC, phoneNumber, email)