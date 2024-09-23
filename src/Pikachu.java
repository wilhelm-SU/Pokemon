
public class Pikachu extends Pokemon
{  
   public Pikachu(){
       super(35, 55, 30, 90, "bob");
   } //Health, Attack, Defense, Speed
   
   //Attack Types
   public void thunderBolt(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses thunderBolt on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
   
   public void thunderJolt(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses thunderJolt on " + anyPoorPokemon.getName() + "!");
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
       System.out.println(getName() + " uses bite on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
   
   public void electricMissile(Pokemon anyPoorPokemon){
       System.out.println(getName() + " uses electricMissile on " + anyPoorPokemon.getName() + "!");
       int resultingDefense = (anyPoorPokemon.getDefense()) - (this.getAttack());
       if(resultingDefense > 0){anyPoorPokemon.setDefense(resultingDefense);}
       if(resultingDefense <= 0){anyPoorPokemon.setDefense(0);
           int resultingHp = (anyPoorPokemon.getHp()) - (this.getAttack());
           if(resultingHp > 0){anyPoorPokemon.setHp(resultingHp);}
           if(resultingHp <= 0){anyPoorPokemon.setHp(0);}
       }
       System.out.println(anyPoorPokemon.getName() + "'s HP: " + anyPoorPokemon.getHp());
   }
    
   
   @Override
   public String toString(){
       return "Pikachu:" + this.getHp() + " " + this.getAttack();
   }
}
