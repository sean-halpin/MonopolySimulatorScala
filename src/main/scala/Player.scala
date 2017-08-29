class Player(var id: Int, var balance: Int){
  private var position = 0
  def adjustBalance(amount: Int): Unit = {
    balance += amount
  }
  def adjustPosition(amount: Int): Unit = {
    position = (position + amount) % 40
  }
  override def toString: String = s"Balance : $balance Position : $position"
}
