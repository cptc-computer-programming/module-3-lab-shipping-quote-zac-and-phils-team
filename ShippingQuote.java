public class ShippingQuote {
    public static void main(String[] args) {
    // Weightinpounds();
    // Lengthininches();
    // Widthininches();
    // Heightininches();

//    totalCost = baseCost + (weight *weightRate) + (sizeFactor* sizeRate)
//    sizeFactor = int max(length, width, height);
//     return length + width + height;

    final double WEIGHT = 5.0;
    final int HEIGHT = 50; 
    final int WIDTH = 4;
    final int LENGTH = 4;

    int volume = calculateVolume(LENGTH, WIDTH, HEIGHT);
    double sizeFactor = determineSizeFactor(LENGTH, WIDTH, HEIGHT);
    boolean heavyWarning = isOverweight(WEIGHT);
    double baseCost = calculateBaseCost();
    double finalCost = calculateTotalCost(baseCost, WEIGHT, sizeFactor);

    System.out.println("Package Dimensions: " + LENGTH + " x " + WIDTH + " x " + HEIGHT + " inches");
    System.out.println("Weight: " + WEIGHT + " lbs");
    System.out.println("Volume: " + volume + " cubic inches");
    System.out.println("Size Factor: " + sizeFactor);
    
    if (heavyWarning) {
        System.out.println("It's a BIG one!");

    }

    double formattedCost = Math.round(finalCost * 100.0) / 100.0;
    System.out.println("Total Cost: $" + formattedCost);
    }

    public static int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static double determineSizeFactor(int length, int width, int height) {
        return Math.max(length, Math.max(width, height));
    }

    public static boolean isOverweight(double weight) {
        return weight > 50.0;
    }

    public static double calculateBaseCost() {
        return 5.0;
    }

    public static double calculateTotalCost(double baseCost, double weight, double sizeFactor) {
        final double WEIGHT_RATE = 1.25;
        final double SIZE_RATE = 0.50;
        return baseCost + (weight * WEIGHT_RATE) + (sizeFactor * SIZE_RATE);
    }
}
    