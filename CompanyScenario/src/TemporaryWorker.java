
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
 * Describes a ContractedWorker having an end date to their employment.
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version 1.0
 */

public class TemporaryWorker extends ContractedWorker {
    
    
    //TODO add another constructor, make contract end date field.
    public TemporaryWorker(String name, String address, String role, int employeeNumber,
            Salary salary) {
        
        super(name, address, role, employeeNumber, checkSalary(salary));
    }
    
    private static Salary checkSalary(Salary salary) {
        
        try {
            
           salary = (CommissionSalary) salary;
           throw new IllegalArgumentException("Temporary workers cannot have"
                   + "a CommissionSalary");
        }
        
        catch(ClassCastException ex) {
            return salary;
        }
    }

}
