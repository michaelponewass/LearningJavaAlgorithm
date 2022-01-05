package recursi.Recursi;

public class Recursi {

    public Recursi() {
    }
    public int a=0;
    public int b=0;
    public void theRun() {
        while (this.a < 10) {
            this.a++;
            System.out.println("in recursion phase: "+a);
            this.b=this.a;
            this.theRun();
            System.out.println("out the recursion phase: " + b);
            this.b--;
        }
    }
}
