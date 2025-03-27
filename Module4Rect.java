public class Module4Rect extends Module4 {
    private double width;
    private double height;

    public Module4Rect(double width, double height){
        super(4);
        this.width = width;
        this.height = height;
    }

     public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
