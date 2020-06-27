package com.willredington.learning.classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Person will = new Person("wil", 27);
    Person ethan = new Person("ethan", 31);
    Person michael = new Person("michael", 30);
    Person jon = new Person("jon", 28);
    Person stephano = new Person("stephano", 27);

    List<Person> people = new ArrayList<Person>();
    people.add(will);
    people.add(ethan);

    PersonPrinter printer = new PersonPrinter();

    for (int i = 0; i < people.size(); i++) {
      Person person = people.get(i);
      printer.print(person);
    }
  }
}
