class GameBoard(var players:List[Player]){
  private var _activePlayerIndex = 0
  private var _activePlayer: Player = players(_activePlayerIndex)
  def RunSimulation(): Unit ={
    while(GameStillInProgress(players) == true){
      _activePlayer = players(_activePlayerIndex)
      _activePlayer.RollAndUpdatePosition()
      println(_activePlayer)
      _activePlayerIndex = (_activePlayerIndex + 1) % players.length
    }
  }
  private def GameStillInProgress(players:List[Player]) : Boolean ={
    return players.count(p => p.balance >= 0) > 1
  }
}
