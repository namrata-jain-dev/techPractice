package assignment;

public class Assignment3 {
    /// Create a class called "Building" with private attributes for address,
    /// number of floors, and total area. Add a static variable to track the total
    /// number of buildings created. Then, create two subclasses: "ResidentialBuilding",
    /// which adds a private number of apartments, and "CommercialBuilding", which adds a
    /// private office space area. Implement static methods to display the total number of
    /// buildings and public methods to calculate total rent, along with getters and setters
    /// for the attributes.///
    public static void main(String[] args) {
        Building[] buildings = new Building[3];
        buildings[0] = new ResidentialBuilding("Jaipur",3,1000,30);
        buildings[1] = new CommercialBuilding("Jaipur",9,500.55f,200);
        buildings[2] = new ResidentialBuilding("Jaipur",7,444.44f,40);

        int count = Building.getCountBuildingCreation();
        System.out.println("Total number of buildings created: "+count);
        for (Building building : buildings) {
            building.calculateRent();
            System.out.println("Total rent for this building is "+building.calculateRent());
        }
    }

}

class Building{
    private String address;
    private int floors;
    private float totalArea;
    static int countBuildingCreation = 0;

    public Building(String address, int floors, float totalArea){
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
        countBuildingCreation++;
    }


    public static int getCountBuildingCreation() {
        return countBuildingCreation;
    }

    public float calculateRent() {
        float rentPerSquareFeet = 1982.3f;
        return rentPerSquareFeet * totalArea * floors;
    }
}

class ResidentialBuilding extends Building{
    private int apartments;

    public ResidentialBuilding(String address, int floors, float totalArea,int apartments) {
        super(address, floors, totalArea);
        this.apartments = apartments;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }
}
class CommercialBuilding extends Building{
    private float officeSpaceArea;

    public CommercialBuilding(String address, int floors, float totalArea,float officeSpaceArea) {
        super(address, floors, totalArea);
        this.officeSpaceArea = officeSpaceArea;
    }
    public float getOfficeSpaceArea() {
        return officeSpaceArea;
    }
    public void setOfficeSpaceArea(float officeSpaceArea) {}
}