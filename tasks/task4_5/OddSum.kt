// Task 4.5: summing odd integers with a for loop
fun main() {
	print("Enter an upper bound: ")
	val upperBound = readln().toLong()
	var count: Long = 0
	for (n in 1..upperBound step 2) {
		count += n
	}
	println("Count is $count")
}
