import scala.util.Random
object GameEngine {
  def main(args: Array[String]) {
    println("Begin")
    val _players = (1 to 4).map( id => new Player( id, 0, 200, new Dice(new Random))).toList
    val _gameBoard = new GameBoard(_players)
    _gameBoard.RunSimulation()
  }
}
