
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
 * Describes an Employee who is an Engineer.
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version 1.0
 */

public class Engineer extends Employee {
    
    private double salary;     //Monthly.
    private double hourlyRate;
    
    public Engineer(String name, String address, int employeeNumber, 
                    double salary, double hourlyRate) {
        
        super(name, address, employeeNumber);
        this.salary = salary;
        this.hourlyRate = hourlyRate;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    //Add boundary checks.
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
