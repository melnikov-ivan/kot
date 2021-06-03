package ch2

enum class Color(title: String) {
    CPA("FF"), CPC("ADV"), DSBS("DBS");

    fun value(value: String): Color {
        return when (value) {
            "FF" -> CPA
            "ADV" -> CPC
            "DBS" -> DSBS
            else -> throw IllegalArgumentException("")
        }
    }
}

fun main() {
    println(Color.CPA.value("FF"));
}