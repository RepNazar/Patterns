package ua.Nazar.Rep.filter;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria {
    Criteria firstCriteria;
    Criteria secondCriteria;

    public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = firstCriteria.meetCriteria(persons);
        List<Person> secondCriteriaItems = secondCriteria.meetCriteria(persons);

        for (Person person : secondCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }

        return firstCriteriaItems;
    }
}
