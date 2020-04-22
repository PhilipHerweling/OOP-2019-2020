package ie.tudublin;

import processing.data.TableRow;


public class StarLabTest {

    private String displayName;
    private boolean hab;
    private float distance;
    private float xg;
    private float yg;
    private float zg;
    private float absMag;

    

    public void setHab(final boolean hab) {
        this.hab = hab;
    }

    public boolean getHab() {
        return hab;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(final float distance) {
        this.distance = distance;
    }

    public float getXg() {
        return xg;
    }

    public void setXg(final float xg) {
        this.xg = xg;
    }

    public float getYg() {
        return yg;
    }

    public void setYg(final float yg) {
        this.yg = yg;
    }

    public float getZg() {
        return zg;
    }

    public void setZg(final float zg) {
        this.zg = zg;
    }

    public float getAbsMag() {
        return absMag;
    }

    public void setAbsMag(final float absMag) {
        this.absMag = absMag;
    }

    // Converts the object to a string for logging etc
    public String toString() {
        return displayName + "\t" + hab + "\t" + xg + "\t" + yg + "\t" + zg + "\t" + absMag;
    }

    public StarLabTest(final String displayName, final boolean hab, final float distance, final float xg,
            final float yg, final float zg, final float absMag) {
        this.displayName = displayName;
        this.hab = hab;
        this.distance = distance;
        this.xg = xg;
        this.yg = yg;
        this.zg = zg;
        this.absMag = absMag;
    }

    public StarLabTest() {
        this("", false, 0, 0, 0, 0, 0);
    }

    public StarLabTest(final TableRow tr) {

        this(
            tr.getString("Display Name")
            , tr.getInt("Hab?") == 1
            , tr.getFloat("Xg")
            , tr.getFloat("Yg")
            , tr.getFloat("Zg")
            , tr.getFloat("Distance")
            , tr.getFloat("AbsMag")
        );
    }

    

}