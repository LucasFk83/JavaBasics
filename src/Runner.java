public class Runner {
    public static void main(String[] args) {

        Car myCar = new Car(19189, "toyoata",2000, "turnbo");

        System.out.println(myCar.toString());
        myCar.drive(20);
        System.out.println(myCar.toString());

        Rectangle myRectangle = new Rectangle(15, 18);

        System.out.println(myRectangle.toString());





    }
}
