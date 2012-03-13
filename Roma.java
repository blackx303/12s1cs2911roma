public class Roma {
    public static void main(String[] argv){
        System.out.println("Welcome to Roma!");
        System.out.println("Simple Rules, from Roma Instruction Guide");
        System.out.println("It is a two players game. Each player receives 10 victory points and 4 cards at the very beginning. The money, remaining 16 victory points are laid ready. The remaining cards are face-down; cards which are discarded during the game are face-up and form a joint discard pile.");
        System.out.println("The play area is set up by 6 dice discs which are in ascending order in a row between two players. The 'money' and 'cards' discs are laid at either end.");
        System.out.println("For the first round, the younger player begins. This player lays his cards face-down on his side of play area. All players can place any card next to any dice disc on the player's side. However, it is not allowed to have more than 1 card next to any dice disc on either player's side. The other player repeats the same procedures.");
        System.out.println("For later rounds, players can take 4 different types of action for any times in any order in every round. Players can lay cards, take money, take cards and(or) activate a card.");
        System.out.println("To end the game, either one of the player has no victory points or there are no victory points left in the stockpile.");
        System.out.println("The player with the most victory points is the winner!");
        System.out.println("For details, please read through the Roma Instruction Guide");
        
        Die d = new Die();
        System.out.println("The die was rolled and a " + d.roll() + " was obtained");
    }
}