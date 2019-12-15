package InheritanceOOP2;

import InheritanceOOP.Dog;
import StaticPractice.Book;

public class schoolBus extends bus {

    @Override
    public Double maxSpeed() {
        return 60.5;
    }

    @Override
    public String busName(){
        return "School Bus";
    }



}
