package com.example.praktikumpertama

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "isro@gmail.com")

    println(contact.email)

    contact.email = "jane@gmail.com"

    println(contact.email)
}