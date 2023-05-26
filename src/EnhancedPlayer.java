public class EnhancedPlayer {
    private String fullname;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullname, int healthPercentage, String weapon) {
        this.fullname = fullname;
        if(healthPercentage <= 0){
            this.healthPercentage = 1;
        }else if(healthPercentage > 100){
            this.healthPercentage = 100;
        }else this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public EnhancedPlayer(String fullname) {
        this(fullname, 100, "Sword");
    }

    public  void loseHealth(int damage){
        healthPercentage -=damage;
        if(healthPercentage <= 0){
            System.out.println("Player knocked out of game");
        }
    }
    public  void restoreHealth(int extraHealth){
        healthPercentage += extraHealth;
        if(healthPercentage >100){
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
    public int healthRemaining(){
        return healthPercentage;
    }

}
