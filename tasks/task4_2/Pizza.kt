fun main() {
	println("PIZZA MENU\n\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\n")
	print("Choose your pizza (a-d): ")
	val userChoice = readln().lowercase()
	if(userChoice.length == 1 && userChoice.single() in 'a'..'d') {
		println("Order accepted")
	}
	else {
		println("Invalid choice!")
	}
}
