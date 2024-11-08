public class SecondLevel extends FirstLevel {
    private ComplexType complexType;

    public SecondLevel(int id, Status status, ComplexType complexType) {
        super(id, status);
        this.complexType = complexType;
    }

    public ComplexType getComplexType() {
        return complexType;
    }

    // Перегруженные методы
    public void display() {
        System.out.println("Display method with no parameters.");
    }

    public void display(String message) {
        System.out.println("Display method with message: " + message);
    }

    public final void display(int number) {
        System.out.println("Display method with number: " + number);
    }

    @Override
    public void showInfo() {
        System.out.println("Second Level: ID = " + getId() + ", Status = " + getStatus() + ", Complex Type Description = " + complexType.getDescription());
    }
}