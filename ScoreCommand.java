
/**
 * A class that keeps the users current score throughout the game.
 * 
 * @author Dylon Garrett, Sean Bermingham, Cris Guzman
 * @version ZorkV1
 */
public class ScoreCommand extends Command
{

   /**
    * A constructor that takes int value of the users point total.
    * @param - points
    *
    */
   public ScoreCommand(){
    
    }
   
   /**
    * A method that is extended from the abstract Command class and returns a string with a 
    * score and a message.
    * @return - String
    */
   public String execute(){
       return Integer.toString(GameState.instance().getCurrentScore())+"\n";
   }
}
