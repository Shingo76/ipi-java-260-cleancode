public class BowlingGame {

    private int score;

    public int score() {
        return score;
    }
    
    int coupsParTour = 1;
    boolean spareBonus = false;
    int strikeBonus = 0;
    int scoreParTour = 0;
    int spearCompteur = 0;
    
    public void comptageDesPoints(int numberPins) {
    	
    	//Si le premier coup n'est pas un strike
    	if(numberPins != 10) {
    		//Stockage des points si le second lancé provoque un spear
	    	if(coupsParTour == 1) {
	    		scoreParTour = numberPins;
	    		coupsParTour++;
	    	}
	    	else if (coupsParTour == 2) 
	    		{
	    		scoreParTour += numberPins;
	    		coupsParTour--;
	    			//Situation de spear
		    		if(scoreParTour == 10 && numberPins != 0) {
		    			spearCompteur = 2;
		    		}
		    		scoreParTour = 0;
	    		}
	    	} 
    	else
    	// Sinon c'est un strike
    	{
    		strikeBonus = 4;
    		coupsParTour++;
    	}
    	
    	// SpearBonus
    	// Le spear ne compte pas au moment où il est fait
    	if(spearCompteur == 2) 
    	{
    		spearCompteur--;    	
    	} 
    	// Le spear compte au second tour
    	else if(spearCompteur == 1 ) 
    	{
    		numberPins = numberPins * 2;
    		spearCompteur--;
    	}
    	
    	// StrikeBonus
    	// Le strike compte 10 pts, son bonus s'applique après
    	if(strikeBonus == 4) {
    		strikeBonus--;
    		
    	}
    	// Le premier jet suivant est zéro, les deux suivants sont aux bonus Strike
    	else if(strikeBonus == 3 || strikeBonus == 2 || strikeBonus == 1) 
    	{
    		numberPins = numberPins * 2;
    		strikeBonus--;
    	}
    	
    	score += numberPins;
        
    }
}
