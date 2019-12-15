package CollectionPractice;

public class FlowerTest {

    public static void main(String[] args) {

        Flower rose=new Flower("Rose", 111111);
        rose.addFlower("Red Rose", 123456);
        rose.addFlower("Tulip", 123678);
        rose.addFlower("Orchid", 979797);

       int redFlowerBarcode= rose.findFlower("Red rose");
        System.out.println(redFlowerBarcode);


        String flowerName=rose.findFlower1(979797);
        System.out.println(flowerName);

        System.out.println("this is the list of flower");
        rose.printAllFlower();

        rose.removeFlower("Tulip");
        System.out.println("this is after removing flower");
        rose.printAllFlower();

    }
}
