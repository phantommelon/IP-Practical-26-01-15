
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
 * Describes an Employee who is a Salesperson.
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version 1.0
 */

public class Salesperson extends Employee {

    private int sales;
    private double salary;     //Monthly
    
    
    public Salesperson(String name, String address, int employeeNumber, double salary,
            int sales) {
        
        super(name, address, employeeNumber);
        this.salary = salary;
        this.sales = sales;
    }

    public Salesperson(String name, String address, int employeeNumber,
            int numberOfShares, double salary, int sales) {
        
        super(name, address, employeeNumber, numberOfShares);
        this.salary = salary;
        this.sales = sales;
    }
    
    public double getSalary() {
        return salary;
    }
    
    //Add boundary checks.
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int getSales() {
        return sales;
    }
    
    public void setSales(int sales) {
        this.sales = sales;
    }
    
}
