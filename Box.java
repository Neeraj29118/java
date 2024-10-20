public class Box {
    private double length;
    private double width;
    private double height;

    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public double getLength() {
        return length;
    }

    
    public double getWidth() {
        return width;
    }

    
    public double getHeight() {
        return height;
    }

    
    public double calculateVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        
        Box myBox = new Box(10.0, 5.0, 3.0);

        
        System.out.println("Length: " + myBox.getLength());
        System.out.println("Width: " + myBox.getWidth());
        System.out.println("Height: " + myBox.getHeight());

        
        System.out.println("Volume: " + myBox.calculateVolume());
    }
}
