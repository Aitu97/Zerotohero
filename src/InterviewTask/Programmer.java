package InterviewTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Programmer {

    List<String> languages=new ArrayList<>();
    public Collection<String > getAllLanguages(){
        return languages;
    }
    public void addAllLanguages(String language){
        languages.add(language);
    }


}
