public class Q3 extends Q1 {
    private double weight;
    
    public PhysicalBook(String title, String author, double price, int quantity, double weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }
    
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    public double calculateShippingCost() {
        double shippingCost = 4.50;
        double additionalWeight = weight - 500;
        if (additionalWeight > 0) {
            int extraCharges = (int) (additionalWeight / 250);
            shippingCost += extraCharges;
        }
        return shippingCost;
    }
    
    public double getWeightInPounds() {
        return weight / 453.59237; 
    }
}
