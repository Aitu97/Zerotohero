package InterfaceOOP2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneUser {

    public static void main(String[] args) {

        iphone iphone=new iphone();
        iphone.call();
        iphone.text();
        iphone.takePicture();

        Samsung samsung=new Samsung();

        List<String > list=new ArrayList<String>();
        Map<String , Object> map=new HashMap<String, Object>();
    }
}
