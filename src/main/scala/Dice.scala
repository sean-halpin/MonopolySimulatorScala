import scala.util.Random
class Dice (var random: Random){
  def Roll(): Int= {
    val first = RollSingle()
    val second = RollSingle()
    return first + second
  }

  private def RollSingle(): Int ={
    return random.nextInt(6)
  }
}