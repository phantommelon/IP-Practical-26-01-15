
/*
 * Copyright 2015 Alistair Madden <phantommelon@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Describes the people within the company, and methods to analyse them.
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version 1.0
 */

import java.util.ArrayList;

public class Company {
    
    private ArrayList<Person> associatedPersons;
    
    public Company() {
        associatedPersons = new ArrayList();
    }
    
    public void addPerson(Person person) {
        associatedPersons.add(person);
    }
    
    public void getInformation(String name) {
        
        for(Person person : associatedPersons) {
            
            if(person.getName().equals(name)) {
                
                System.out.println(person.getDescription());
            }
        }
    }
    
    public void listAllPeople() {
        for(Person person : associatedPersons) {
            System.out.println(person.getDescription());
        }
    }
}

class test {
    public static void main(String args[]) {
        Person person = new Employee("A", "B", "C", 20);
        System.out.println(person);
    }
}