// Compound assignment demo in a complete Java class
public class CompoundAssignmentDemo {
    public static void main(String[] args) {
        int playerScore = 1000;
        int playerHealth = 100;
        int enemiesDefeated = 0;

        System.out.println("Initial: score=" + playerScore + ", health=" + playerHealth + ", enemies=" + enemiesDefeated);

        // Player defeats an enemy worth 250 points
        playerScore += 250;  // compound assignment for addition
        System.out.println("After defeating enemy: score=" + playerScore);

        // Player takes 15 damage
        playerHealth -= 15;  // compound assignment for subtraction
        System.out.println("After taking damage: health=" + playerHealth);

        // Enemy count goes up
        enemiesDefeated += 1;  // compound assignment for addition
        System.out.println("Enemies defeated: " + enemiesDefeated);

        // Boss battle: double the current score!
        playerScore *= 2;  // compound assignment for multiplication
        System.out.println("After boss: score=" + playerScore);

        // Healing potion restores health to 80% of current (multiply by 4/5)
        playerHealth *= 4;  // multiply by 4
        playerHealth /= 5;  // divide by 5 to get 4/5 (80%) of previous
        System.out.println("After healing potion: health=" + playerHealth);
    }
}
