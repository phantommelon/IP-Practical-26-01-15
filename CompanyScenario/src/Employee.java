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
 * Describes an Employee of the company.
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version 1.0
 */

public class Employee extends Person {
    
    int employeeNumber;
    
    public Employee(String name, String address, int employeeNumber) {
        super(name, address);
        this.employeeNumber = employeeNumber;
    }
    
    public Employee(String name, String address, int numberOfShares, int employeeNumber) {
        super(name, address, numberOfShares);
        this.employeeNumber = employeeNumber;
    }
    
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
}
