package FilterPattern;

import java.util.List;

/**
 * Created by Xiaojun YU on 2017-02-24.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
