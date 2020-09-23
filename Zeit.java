package aufgaben;

/**
 * @author pd04381
 */
public class Zeit {
    private int stunde;

    private int minute;

    /**
     * @return the stunde
     */
    public int getStunde() {
        return stunde;
    }

    /**
     * @param stunde the stunde to set
     */
    public void setStunde(int stunde) {
        if (stunde >= 0 && stunde < 24) {
            this.stunde = stunde;
        } else {
            this.stunde = 0;
        }
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @param minute the minute to set
     */
    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    /**
     * @param stunde
     * @param minute
     */
    public Zeit(int stunde, int minute) {
        setStunde(stunde);
        setMinute(minute);
    }

    @SuppressWarnings("javadoc")
    public static void main(String[] args) {
        Zeit24 z1 = new Zeit24(14, 48);
        Zeit12 z2 = new Zeit12(14, 48);
        z1.print();
        z2.print();
    }

}

class Zeit24 extends Zeit {
    public Zeit24(int st, int m) {
        super(st, m);
    }

    public void print() {
        System.out.printf("%02d:%02d%n", getStunde(), getMinute());
    }
}

class Zeit12 extends Zeit {
    /**
     * @param stunde
     * @param minute
     */
    public Zeit12(int stunde, int minute) {
        super(stunde, minute);
        // TODO Auto-generated constructor stub
    }

    String ampm;

    public void print() {
        ampm = getStunde() > 12 ? "pm" : "am";
        if (ampm == "am") {
            System.out.printf("%02d:%02d%s%n", getStunde(), getMinute(), ampm);
        } else {
            System.out.printf("%02d:%02d%s%n", getStunde() - 12, getMinute(), ampm);
        }
    }
}