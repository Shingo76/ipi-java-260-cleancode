public class BowlingGame {

    private int score;

    public int score() {
        return score;
    }
    
    int coupsParTour = 1;
    //Si le calcul du taux de cotisation est sur salaire  (exemple commentaire pas à jour)
    boolean spareBonus = false;
    int strikeBonus = 0;
    int scoreParTour = 0;
    int spearCompteur = 0;
    
    //Exemple nom méthode non approprié et non prononçable (sauf si on parle japonais)
    public void 美味しいパンティー(int numberPins) {
    	
    	//Si le premier coup n'est pas un strike
    	if(numberPins != 10) {
    	
	    	if(coupsParTour == 1) {
	    		scoreParTour = numberPins;
	    		coupsParTour++;
	    	}
	    	else if (coupsParTour == 2) 
	    		{
	    		scoreParTour += numberPins;
	    		coupsParTour--;
		    		if(scoreParTour == 10 && numberPins != 0) {
		    			spearCompteur = 2;
		    		}
		    		scoreParTour = 0;
	    		}
	    	} 
    	else
    	{
    		strikeBonus = 4;
    		coupsParTour++;
    	}
    	
    	if(spearCompteur == 2) 
    	{
    		spearCompteur--;    	
    	} 
    	else if(spearCompteur == 1 ) 
    	{
    		numberPins = numberPins * 2;
    		spearCompteur--;
    	}
    	
    	if(strikeBonus == 4) {
    		strikeBonus--;
    		
    	}
    	else if(strikeBonus == 3 || strikeBonus == 2 || strikeBonus == 1) 
    	{
    		numberPins = numberPins * 2;
    		strikeBonus--;
    	}
    	
    	score += numberPins;
        
    }
}
