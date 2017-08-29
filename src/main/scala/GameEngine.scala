object GameEngine {
  def main(args: Array[String]) {
    println("Begin")

    val player1 = new Player(1,200)
    println(player1.id)
    println(player1.balance)
    println(player1)
    player1.adjustBalance(25)
    println(player1)
    player1.adjustPosition(12)
    println(player1)
  }
}

