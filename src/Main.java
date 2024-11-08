public class Main {
    public static void main(String[] args) {
        // Создаем объекты классов 2-го и 3-го уровня
        SecondLevel objectA = new SecondLevel(1, Status.ACTIVE, new ComplexType("Complex Type A"));
        ThirdLevel objectB = new ThirdLevel(2, Status.INACTIVE, new ComplexType("Complex Type B"));
        ThirdLevel objectC = new ThirdLevel(3, Status.SUSPENDED, new ComplexType("Complex Type C"));

        // Распечатываем свойства объектов
        objectA.showInfo();
        objectB.showInfo();
        objectC.showInfo();

        // Вызов перегруженных методов через каждый объект
        objectA.display();
        objectA.display("Hello from objectA");
        objectA.display(100);

        objectB.display();
        objectB.display("Hello from objectB");
        objectB.display(200);

        objectC.display();
        objectC.display("Hello from objectC");
        objectC.display(300);
    }
}
