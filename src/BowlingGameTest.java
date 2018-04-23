import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BowlingGameTest {

    BowlingGame game = new BowlingGame();

    //Exemple nom méthode qui ne décrit pas son fonctionnement
    @Test
    public void test1QFZP() {
        美味しいパンティーMany(20, 0);
        assertEquals(0, game.score());
    }

   
    /**
     * Méthode qui déploie un avion dans le ciel
     * @param latAPPTUX
     * 			La latitude qui défin
     */
    // Exemple javadoc pas à jour et paramètres non défininis et non utilisés
    // Exemple de nom de méthode similaire à la précedente
    @Test
    public void test1OFZP(){
        game.美味しいパンティー(1);
        美味しいパンティーMany(19, 0);
        assertEquals(1, game.score());
    }

    @Test
    public void bonusDuSpare(){
        game.美味しいパンティー(8);
        game.美味しいパンティー(2);
        game.美味しいパンティー(1);
        美味しいパンティーMany(17, 0);
        assertEquals(12, game.score());
    }
    
    @Test
    public void bonusDuStrike(){
        game.美味しいパンティー(10);
        game.美味しいパンティー(0);
        game.美味しいパンティー(2);
        game.美味しいパンティー(1);
        美味しいパンティーMany(17, 0);
        assertEquals(16, game.score());
    }
    
    @Test
    public void testPartieStrikeEtSpears() {
    	game.美味しいパンティー(10); //10 pts et strike
    	game.美味しいパンティー(0);
    	
        game.美味しいパンティー(8); // 16 strikeBonus
        game.美味しいパンティー(1); // 2 strikeBonus
        
        game.美味しいパンティー(2); // 2 pts
        game.美味しいパンティー(8); // 8 pts et spear
        
        game.美味しいパンティー(5); // 10 pts spearBonus
        game.美味しいパンティー(2); // 2 pts
        
        game.美味しいパンティー(8); // 8 pts
        美味しいパンティーMany(12, 0);
        assertEquals(10+16+2+2+8+10+2+8, game.score());
    }
    
    private void 美味しいパンティーMany(int number美味しいパンティーs, int numberPins) {
        for (int i = 0; i < number美味しいパンティーs; i++) {
            game.美味しいパンティー(numberPins);
        }
    }
}
