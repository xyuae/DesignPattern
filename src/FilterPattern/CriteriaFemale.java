package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xiaojun YU on 2017-02-24.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons){
            if(person.getGender().equalsIgnoreCase("Female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
