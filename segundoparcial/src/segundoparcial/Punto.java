package segundoparcial;
public class Punto {
    private int x,y;
    
    
    public int setx(int n){
        return x=n;
    }
    public int sety(int n){
        return y=n;
    }    
    public float setpoint(int n, int m){
        m=y;
        n=x;
        return n & m;
    }
    public int getX(){
        return x;        
    }
    public int getY(){
        return y;       
    }
    
}
