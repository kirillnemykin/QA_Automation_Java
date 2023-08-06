package homework.homework_9;

public enum Size {

    EXTRA_SMALL("XS", 48, 59),
    SMALL("S", 51, 65),
    MEDIUM("M", 54, 67),
    LARGE("L", 57, 70),
    EXTRA_LARGE("XL", 60, 72),
    EXTRA_EXTRA_LARGE("XXL", 62, 74),
    EXTRA_EXTRA_EXTRA_LARGE("XXXL", 64, 76);

    private final String shortName;
    private final int width;
    private final int length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }


}
