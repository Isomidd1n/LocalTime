public class Time {
    private int H;
    private int M;
    private int S;

    public Time() {
    }

    public Time(int h, int m, int s) {
        H = h;
        M = m;
        S = s;
    }

    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }
}
