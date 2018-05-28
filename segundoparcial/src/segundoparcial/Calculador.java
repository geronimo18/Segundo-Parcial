package segundoparcial;
public class Calculador implements ICalculador {    
    Punto punto1=new Punto();
    Punto punto2=new Punto();   

    @Override
    public double calculardistancia() {
       
        return punto1.getX();
    }

    @Override
    public double calculararea() {
        return punto2.getY();
    }

    @Override
    public double calcularpendiente() {
        return punto1.getX()-punto1.getY();
    }
}
