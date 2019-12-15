package InterviewTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProgrammerTeacher extends Programmer {

    List <String> teacherLanguages=new ArrayList<String>();
    @Override
    public Collection<String> getAllLanguages(){
       return teacherLanguages;
    }
    @Override
    public void addAllLanguages(String language){
        teacherLanguages.add(language);
    }
    public boolean teach(Programmer programmer, String language){
        for (String teacherL: teacherLanguages){
            if (teacherL.equalsIgnoreCase(language)){
                programmer.addAllLanguages(language);
                return true;
            }
        }
        return false;
    }


}
