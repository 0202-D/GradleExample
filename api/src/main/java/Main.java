/**
 * @author Dm.Petrov
 * DATE: 09.07.2022
 */
public class Main {

        public static void main(String[] args) {
            MyService myService = new MyService();
            System.out.println(myService.getMyEntity());
            System.out.println(myService.setMyEntity(new MyEntity("second")));
            System.out.println(myService.getMyEntity());
        }
    }

