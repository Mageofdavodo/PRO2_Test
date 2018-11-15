package opgave_p12_1;

public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        if (width < 0) {
            return 0;
        } else if (width == 1) {
            return height;
        } else {
            Rectangle r = new Rectangle(this.width - 1, this.height);
            int smallerArea = r.getArea();
            return smallerArea + this.height;
        }

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
