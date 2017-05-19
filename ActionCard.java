public class ActionCard extends Card {
    String _action ;
    String _color ;

    public ActionCard() {
	_action="";
	_color="";
    }
    
    public ActionCard(String a,String c){
	_action=a;
	_color=c;
    }

    public String getAction() {
	return _action;
    }

    public String getColor() {
	return _color ;
    }
    
    public String addTwo(){
    }
    
    public void reverse(){
		/* i think swapping while moving towards middle would be faster bc that is n/2 times like:
			[1] 2 3 4 [5]  : swap nums in boxes
			5 [2] 3 [4] 1  and so on until you reach middle
		*/
		for( n = 0 ; n < _players.size() - 1 ; n ++ ) {
			_players.add( 0, _players.remove( n + 1 )) ;
		}
		
    }
    
    public void skip(){
    }
}
