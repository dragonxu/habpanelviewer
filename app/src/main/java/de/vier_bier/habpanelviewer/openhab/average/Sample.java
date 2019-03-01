package de.vier_bier.habpanelviewer.openhab.average;

/**
 * A value with its acquisition time.
 */
class Sample<N extends Number> {
    private final N fValue;
    private final long fTime;

    public Sample(N value) {
        fValue = value;
        fTime = System.currentTimeMillis();
    }

    public N getValue() {
        return fValue;
    }

    public long getTime() {
        return fTime;
    }
}
