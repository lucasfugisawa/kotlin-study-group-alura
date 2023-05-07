import kotlin.math.PI

fun main() {
//    `numbers, bools and chars`()
//    strings()
//    arrays()
//    `functions and lambdas`()
//    conditions()
//    loops()
}

private fun `numbers, bools and chars`() {

    // Números inteiros (exceto unsigned):
    val byteValue: Byte = 1 // 8 bits
    val shortValue: Short = 1 // 16 bits
    val integerValue: Int = 1 // 32 bits
    val longValue: Long = 1L // 64 bits

    val valor: Int? = null
    // nullable

    // Ponto flutuante:
    val floatValue: Float = 1.0f // 32 bits
    val doubleValue: Double = 1.0 // 64 bits

    // Booleano:
    val booleanValue: Boolean = true // 1 bit

    // Caractere
    val charValue: Char = '#' // 16 bits

    val anotherChar: Char = 35.toChar()
    println(anotherChar)

    val anotherUnicodeChar: Char = '\u0023'
    println(anotherUnicodeChar)
}


private fun strings() {

    val stringLiteral: String = "abcd 123"
    val rawString = """
    |   for (c in "foo")
    |       print(c)
    |       
    """.trimMargin()
    println(rawString)

    val stringTemplate = "'$stringLiteral' tem ${stringLiteral.length} caracteres"
    println(stringTemplate)

    for (c in stringLiteral) {
        println("$c é um caractere de '$stringLiteral'")
    }
}


private fun arrays() {

    // Arrays:
    val arrayOfInts = intArrayOf(1, 2, 3)
    val asc = Array(5) { i -> (i * i).toString() }

    // Arrays de tipos primitivos:
    val arr1: IntArray = intArrayOf(1, 2, 3)
    arr1[0] = arr1[1] + arr1[2]
    println(arr1.toList())

    val arr2 = IntArray(5) { 42 }
    println(arr2.toList())

    var arr3 = IntArray(5) { it * 2 }
    println(arr3.toList())
}


private fun `functions and lambdas`() {

    // Declarando funções:

    fun circumference1(radius: Double): Double {
        return 2 * PI * radius
    }

    fun circumference2(radius: Double): Double = 2 * PI * radius

    fun circumference3(radius: Double) = 2 * PI * radius

    val circumference4 = { radius: Double -> 2 * PI * radius }

    // Chamando funções:
    val perimeter1 = circumference1(1.0)
    println(perimeter1)

    val perimeter2 = circumference1(radius = 2.0)
    println(perimeter2)

    val perimeter3 = circumference4(3.0)
    println(perimeter3)

    fun fazAlgoComString(str: String, algo: (String)->Unit): Unit {
        algo(str)
    }

    var minhaString = "Lucas"
    fazAlgoComString(minhaString) { nome -> println(nome) }

}

private fun conditions() {

    // when:
    val temperature = -5
    val reaction = when {
        temperature > 55 -> "It's too hot!"
        temperature < 40 -> "It's too cold!"
        temperature < 0 -> "It's frigid!"
        else -> "It's just right!"
    }
    println(reaction)

    // if:
    val a = 1
    val b = 2

    var max = a

    if (a > b) {
        max = a
    } else {
        max = b
    }

    max = if (a > b) a else b

    max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
}

fun loops() {

    // while:
    var counter1 = 0
    while (counter1 < 10) {
        println(counter1)
        counter1++
    }

    // do-while:
    do {
        println(counter1)
        counter1--
    } while (counter1 > 0)

    // for:
    for (i in 0..9) {
        println(i)
    }

    for (i in 0 until 10 step 2) {
        println(i)
    }

    for (i in 9 downTo 0 step 3) {
        println(i)
    }

    for (c in 'a'..'z') {
        println(c)
    }

    val list1 = listOf("a", "b", "c")
    for (s in list1) {
        println(s)
    }

    for ((index, value) in list1.withIndex()) {
        println("$index: $value")
    }

    val map1 = mapOf(
        1 to "one",
        2 to "two",
        3 to "three",
    )

    for ((key, value) in map1) {
        println("$key -> $value")
    }

    for (ch in "abc") {
        println(ch)
    }

}