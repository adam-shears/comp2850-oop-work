import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
	if (args.size != 3) {
		println("Expected 3 arguments")
		exitProcess(1)
	}

	val ints = args.map {it.toInt()}.toTypedArray()
	val average = ((ints[0] +  ints[1] +  ints[2]) / 3).toDouble().roundToInt()

	when(average) {
		in 0..39 -> println("Fail $average")
		in 40..69 -> println("Pass $average")
		in 70..100 -> println("Distinction $average")
	}
}
