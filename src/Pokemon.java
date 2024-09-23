
public class Pokemon implements CompareSpeed, CanAttack
{
   private int hp;
   private int attack;
   private int speed;
   private int defense;
   private String name;
   
   public Pokemon(int userHp, int userAttack, int userDefense, int userSpeed, String userName){
       hp = userHp;
       attack = userAttack;
       defense = userDefense;
       speed = userSpeed;
       name = userName;
   }
   
   public String getName(){
       return name;
   }
   
   public int getHp(){
       return hp;
   }
   
   public int getSpeed(){
       return speed;
   }
   
   public void setHp(int inputHp){
       hp = inputHp;
   }
   
   public int getAttack(){
       return attack;
   }
   
   public int getDefense(){
       return defense;
   }
   
   public void setDefense(int inputDefense){
       defense = inputDefense;
   }
   
   @Override
   public void attack(){
    
   }
   
   @Override
   public boolean equals(Object obj){
       
       Pokemon creature2 = (Pokemon) obj;
       if(this.getHp() == creature2.getHp() && this.getAttack() == creature2.getAttack() && this.getDefense() == creature2.getDefense() && this.getSpeed() == creature2.getSpeed()){
           return true;}
           else {return false;}
   }
   
   
   @Override
   public int compareTo(Pokemon creature2){
       if(creature2 instanceof Pokemon){
       if(this.getSpeed() > creature2.getSpeed()){return 1;}
       if(this.getSpeed() == creature2.getSpeed()){return 0;}
       if(this.getSpeed() < creature2.getSpeed()){return -1;}
       else{return 3;}
    }
    else{return 2;}
   }
}
