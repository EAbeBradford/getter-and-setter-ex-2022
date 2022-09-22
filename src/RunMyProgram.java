public class RunMyProgram {
    private int a = -2;
    public static void main(String[] args){
        Car fastCar = new Car();
        System.out.println(fastCar.getSpeed());
        fastCar.setSpeed(150);
        System.out.println(fastCar.getSpeed());
        int a = -2;
        int b = -1;
        String session = "Winter";
        switch(session)
        {
            case "Fall":
                System.out.print("it is fall");
                break;
            case "Summer":
                System.out.print("it is summer");
                break;
            case "winter":
                System.out.print("it is winter");
                break;
            case "Spring":
                System.out.print("it is spring");
                break;
            default:
                System.out.print("idk");
                break;

        }
//        if(!(b>0))
//        {
//            System.out.print("yay");
//        } else
//        {
//            System.out.print("sad");
//
//        }
    }
}
