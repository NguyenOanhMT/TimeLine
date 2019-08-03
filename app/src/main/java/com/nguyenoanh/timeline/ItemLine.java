package com.nguyenoanh.timeline;

public class ItemLine {
    private int colorTop;
    private int colorRound;
    private int colorBottom;

    public ItemLine(int colorTop, int colorRound, int colorBottom) {
        this.colorTop = colorTop;
        this.colorRound = colorRound;
        this.colorBottom = colorBottom;
    }

    public int getColorTop() {
        return colorTop;
    }

    public void setColorTop(int colorTop) {
        this.colorTop = colorTop;
    }

    public int getColorRound() {
        return colorRound;
    }

    public void setColorRound(int colorRound) {
        this.colorRound = colorRound;
    }

    public int getColorBottom() {
        return colorBottom;
    }

    public void setColorBottom(int colorBottom) {
        this.colorBottom = colorBottom;
    }
}
