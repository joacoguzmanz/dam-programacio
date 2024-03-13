package UF4.ProjectFigures;

public class Rhombus extends Shape {
    private int dM;
    private int dm;

    public Rhombus(int dM, int dm) {
        this.dM = dM;
        this.dm = dm;
    }

    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }
}
