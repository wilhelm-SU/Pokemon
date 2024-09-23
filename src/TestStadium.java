
public class TestStadium
{
    public static void main(String[] args){
        
        Pikachu bob = new Pikachu();
        Charizard jimmy = new Charizard();
        //Bulbasaur harold = new Bulbasaur();
        //Piplup lily = new Piplup();
        
        int deathPool = 0;
        int fighter1 = 0;
        int fighter2 = 0;
        // int fighter3 = 0;
        // int fighter4 = 0;

        System.out.println("The fight has begun, initializing battle music!");        
        
        while(deathPool < 1){
            if(jimmy.getHp() > 0){
                if(bob.getHp() > 0){jimmy.attack(bob);}
               // if(harold.getHp() > 0){jimmy.attack(harold);}
               // if(lily.getHp() > 0){jimmy.attack(lily);}
            }
            if((jimmy.getHp() <= 0) && (fighter1 == 0)){deathPool++; fighter1++;}
            
            if(bob.getHp() > 0){
                if(jimmy.getHp() > 0){bob.attack(jimmy);}
               // if(harold.getHp() > 0){bob.attack(harold);}
                //if(lily.getHp() > 0){bob.attack(lily);}
            }
            if((bob.getHp() <= 0) && (fighter2 == 0)){deathPool++; fighter2++;}
            
          /*  if(harold.getHp() > 0){
                if(jimmy.getHp() > 0){harold.attack(jimmy);}
                if(bob.getHp() > 0){harold.attack(bob);}
                if(lily.getHp() > 0){harold.attack(lily);}
            }
            if((harold.getHp() <= 0) && (fighter3 == 0)){deathPool++; fighter3++;}
            
            if(lily.getHp() > 0){
                if(jimmy.getHp() > 0){lily.attack(jimmy);}
                if(bob.getHp() > 0){lily.attack(bob);}
                if(harold.getHp() > 0){lily.attack(harold);}
            }
            if((lily.getHp() <= 0) && (fighter4 == 0)){deathPool++; fighter4++;} */
        } 
       // if(fighter4 == 0){System.out.println(lily.getName() + " is the winner!");}
       // if(fighter3 == 0){System.out.println(harold.getName() + " is the winner!");}
        if(fighter2 == 0){System.out.println(bob.getName() + " is the winner!");}
        if(fighter1 == 0){System.out.println(jimmy.getName() + " is the winner!");}
        
        /*System.out.println(bob.compareTo(jimmy));
        System.out.println(jimmy.compareTo(bob));
        System.out.println(bob.compareTo(pete));*/
        
        //System.out.println(bob.equals(jimmy));
        //System.out.println(bob.equals(pete));

        
       /* System.out.println("Battle Music Initialized");
        System.out.println("Jimmy Df:" + jimmy.getDefense());
        System.out.println("Jimmy Hp:" + jimmy.getHp());

        bob.thunderBolt(jimmy);*/
        
            
    }
}   
    


