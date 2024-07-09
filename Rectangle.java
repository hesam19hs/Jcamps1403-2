public class Rectangle {
    private int tol;
    private int arz;

    public Rectangle(int tol, int arz) {
        this.tol = tol;
        this.arz = arz;
    }
    public int mohit(){//in method mitone void ham bashe vali int bashe baraye mohasebe behtare va negahdari in halat ham behtare
        return (tol + arz) * 2;
    }
    public int masahat(){
        return tol * arz;
    }
}
