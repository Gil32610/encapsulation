public class Main {
    public static void main(String[] args) {
//    Player player = new Player();
//    player.name = "Tim";
//    player.health = 20;
//    player.weapon = "Sword";

    //Allowing direct access to data on a object, can potentially bypass checks, and additional
        //processing, you class has in place to manage data

        //whenever changing the non encapsulated field's name, it comes necessary to also change it
        //on the other classes that the field is being referenced.

        // When the constructor is omitted, the calling code becomes responsible
        // for setting up the data to initialize the object, so it might receive
        // problematic data

//    int damage = 10;
//    player.loseHealth(damage);
//        System.out.println("Reamaining health = " + player.healthRemaining());
//        player.health =200;
//        player.loseHealth(11);
//        System.out.println("Reamaining health = " + player.healthRemaining());
        EnhancedPlayer gil= new EnhancedPlayer("Gil");
        System.out.println("Initial health is " + gil.healthRemaining());
    }

}

