public class MyBox {
    // Fields
    private String color;
    private double width;
    private double height;
    private double length;

    public MyBox() {
        color = "brown";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String _color) {
        color = _color;
    }

    private void setWidth(double _width) {
        width = _width;
    }

    private void setHeight(double _height) {
        height = _height;
    }

    private void setLength(double _length) {
        length = _length;
    }

    public void setDimensions(double w, double h, double l) {
        setWidth(w);
        setHeight(h);
        setLength(l);
    }
}
