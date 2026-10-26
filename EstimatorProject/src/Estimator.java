/**
 * The Estimator class models a real estate property (house or condo)
 * and calculates its estimated market price based on attributes such as
 * bedrooms, square footage, bathrooms, and property name.
 */
public class Estimator {
    // Attributes
    private String propertyName;
    private int bedrooms;
    private int squareFeet;
    private int bathrooms;

    /**
     * Default constructor for Estimator.
     */
    public Estimator() {
        this.propertyName = "Standard Property";
        this.bedrooms = 1;
        this.squareFeet = 500;
        this.bathrooms = 1;
    }

    /**
     * Parameterized constructor for Estimator.
     * 
     * @param propertyName name/description of the house or condo
     * @param bedrooms     number of bedrooms
     * @param squareFeet   total size in square feet
     * @param bathrooms    number of bathrooms
     */
    public Estimator(String propertyName, int bedrooms, int squareFeet, int bathrooms) {
        this.propertyName = propertyName;
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
        this.bathrooms = bathrooms;
    }

    // Accessors (Getters) and Mutators (Setters)
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    /**
     * Calculates and returns the estimated price of the real estate object.
     * The formula uses a base price plus weighted values for square footage,
     * bedrooms, and bathrooms.
     * 
     * @return the estimated price in dollars (int)
     */
    public int estimatePrice() {
        int basePrice = 50000;
        int pricePerSqFt = 180;
        int pricePerBedroom = 15000;
        int pricePerBathroom = 10000;

        int calculatedPrice = basePrice
                + (this.squareFeet * pricePerSqFt)
                + (this.bedrooms * pricePerBedroom)
                + (this.bathrooms * pricePerBathroom);

        return calculatedPrice;
    }

    @Override
    public String toString() {
        return String.format("Property: %s | Size: %d sq ft | Bedrooms: %d | Bathrooms: %d",
                propertyName, squareFeet, bedrooms, bathrooms);
    }
}