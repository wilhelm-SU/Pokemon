
public class Piplup extends Pokemon
{
   public Piplup(){
       super(53, 51, 53, 40, "lily");
   } //Health, Attack, Defense, Speed
    
   //Attack Types
   public void freezeRay(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses freezeRay on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
   
   public void iceShard(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses iceShard on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
   
   public void bite(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses bit on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
   
   public void snowMissile(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses snowMissile on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
}
