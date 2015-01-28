
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
 * Describes a worker with a contract of any kind.
 * 
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version (a version number or a date)
 */

public class ContractedWorker extends Employee {
    
    private Salary salary;
    
    //Refactor for new structure.
    public ContractedWorker(String name, String address, int employeeNumber,
            double salaryAmount, String salaryPaymentSchedule) {
        
        super(name, address, employeeNumber);
        this.salary = new Salary(salaryAmount, salaryPaymentSchedule);
    }
    
    public ContractedWorker(String name, String address, int employeeNumber,
            int numberOfShares, double salaryAmount, String salaryPaymentSchedule) {
        
        super(name, address, employeeNumber);
        this.salary = new Salary(salaryAmount, salaryPaymentSchedule);
        
    }
    
    public Salary getSalary() {
        return salary;
    }
    
    public void setSalary(double salaryAmount, String salaryPaymentSchedule) {
        salary = new Salary(salaryAmount, salaryPaymentSchedule);
    }
    
}
