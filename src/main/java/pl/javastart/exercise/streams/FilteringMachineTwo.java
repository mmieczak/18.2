package pl.javastart.exercise.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> kidsList = ppl.stream()
                .filter(age -> age.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
        return kidsList;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> userList = people.stream()
                .map(person -> new User(person.getName(), person.getAge(), person.getName().concat("_"+person.getAge())))
                .collect(Collectors.toList());
        return userList;
    }
}
