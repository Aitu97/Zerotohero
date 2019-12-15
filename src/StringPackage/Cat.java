package StringPackage;

public class Cat {

        String name;
        int age;
        String color;
        String kind;
        int speed;
        boolean isRunning;
        String direction;

        public void info(){
                System.out.println("cat's name is "+name);
                System.out.println("cat's age is "+age);
                System.out.println("Cat's color is "+color);
                System.out.println("Cat's kind is "+kind);
                System.out.println("cat's speed is "+speed);
                System.out.println("is running "+ isRunning);

        }

        public boolean nameStart (){
            isRunning=true;
            return isRunning;
        }
        public boolean nameStop(){
                isRunning=false;
                return isRunning;
        }
        public void run(String direction){
                System.out.println("the cat direction is "+direction);
        }
        public void  accelerate(int targetSpeed){
                while(speed<targetSpeed){
                        System.out.println(speed);
                        speed++;
                }
        }
        public void slowDown(int targetSpeed){
                for (int i=speed; speed>targetSpeed;i--){
                        System.out.println(i);
                        speed=i;
                }
        }

        public static void main(String[] args) {
                Cat cat=new Cat();

                cat.name="tottti";
                cat.age=2;
                cat.color="Gray";
                cat.kind="puffy";

                cat.info();
                cat.nameStart();
                cat.info();
                cat.nameStop();
                cat.info();
                cat.accelerate(10);
                System.out.println();
                cat.slowDown(5);

        }



}
