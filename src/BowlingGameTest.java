import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BowlingGameTest {

    BowlingGame game = new BowlingGame();

    @Test
    public void queDesGoutieres() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

   
    @Test
    public void uneQuilleTombe(){
        game.comptageDesPoints(1);
        rollMany(19, 0);
        assertEquals(1, game.score());
    }

    @Test
    public void bonusDuSpare(){
        game.comptageDesPoints(8);
        game.comptageDesPoints(2);
        game.comptageDesPoints(1);
        rollMany(17, 0);
        assertEquals(12, game.score());
    }
    
    @Test
    public void bonusDuStrike(){
        game.comptageDesPoints(10);
        game.comptageDesPoints(0);
        game.comptageDesPoints(2);
        game.comptageDesPoints(1);
        rollMany(17, 0);
        assertEquals(16, game.score());
    }
    
    @Test
    public void testPartieStrikeEtSpears() {
    	game.comptageDesPoints(10); //10 pts et strike
    	game.comptageDesPoints(0);
    	
        game.comptageDesPoints(8); // 16 strikeBonus
        game.comptageDesPoints(1); // 2 strikeBonus
        
        game.comptageDesPoints(2); // 2 pts
        game.comptageDesPoints(8); // 8 pts et spear
        
        game.comptageDesPoints(5); // 10 pts spearBonus
        game.comptageDesPoints(2); // 2 pts
        
        game.comptageDesPoints(8); // 8 pts
        rollMany(12, 0);
        assertEquals(10+16+2+2+8+10+2+8, game.score());
    }
    /**
     * Cette méthode fait tomber une série de plusieures quilles
     * 
     * @param number
     * 			Le nombre de lancés
     * @param nombrePoints
     * 			Le nombre de points à chaque lancé
     */
    private void rollMany(int number, int nombrePoints) {
        for (int i = 0; i < number; i++) {
            game.comptageDesPoints(nombrePoints);
        }
    }
}
