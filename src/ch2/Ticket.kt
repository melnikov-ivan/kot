package ch2

class Ticket(id: Long, name: String) {
}

fun mock(): Ticket {
    return Ticket(1L, "Vanek")
}