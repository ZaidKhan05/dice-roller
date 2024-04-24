public class dice implements diceInterface{
    int sides;
    int[] value;
    dice(){
        this.sides = 6;
        this.value = new int[6];
        reset();
    }
    dice(int sides){
        this.sides = sides;
        this.value = new int[sides];
        reset();
    }
    void reset(){
        for(int i = 0; i < sides; i++){
            value[i] = i+1;
        }
    }
    public int roll(){
        return value[(int)(Math.random()*sides)];
    }
    public void changeFaces(int[] faces){
        if(faces.length == sides){
            value = faces;
        }
    }
    public void changeSides(int sides){
        dice temp = new dice(sides);
        
        this.sides = sides;
        value = new int[sides];
        reset();
    }
    
    
}
