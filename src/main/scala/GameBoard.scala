class GameBoard(var players:List[Player]){
  def RunSimulation(): Unit ={
    while(GameStillInProgress(players) == true){

    }
  }
  private def GameStillInProgress(players:List[Player]) : bool ={
    return players.count(p => p.balance >= 0) > 1
  }
}
