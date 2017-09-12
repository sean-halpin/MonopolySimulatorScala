class Player(var id: Int,var position: Int, var balance: Int, var dice: Dice)
{
  def RollAndUpdatePosition(): Unit = {
    position += dice.Roll()
  }

  def adjustBalance(amount: Int): Unit = {
    balance += amount
  }
  def adjustPosition(amount: Int): Unit = {
    position = (position + amount) % 40
  }
  override def toString: String = s"Id : $id Balance : $balance Position : $position"
}
