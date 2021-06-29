package Dominio;

public class Punto {

    private int x = 0;
    private int y = 0;
    private int d;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    public String posicion(){
        
        return "El punto esta en "+this.x+";"+this.y+"\nEL punto se movio "+this.d+" espacios";
    }

}
