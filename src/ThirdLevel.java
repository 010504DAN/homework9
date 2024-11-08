public final class ThirdLevel extends SecondLevel {

    public ThirdLevel(int id, Status status, ComplexType complexType) {
        super(id, status, complexType);
    }

    @Override
    public void showInfo() {
        System.out.println("Third Level: ID = " + getId() + ", Status = " + getStatus() + ", Complex Type Description = " + getComplexType().getDescription());
    }
}