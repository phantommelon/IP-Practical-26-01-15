
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
 * Describes the methods and fields of an Employee's Salary.
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version (a version number or a date)
 */

public class Salary {
    
    private double amount;
    private String paymentSchedule;
    
    public Salary(double amount, String paymentSchedule) {
        this.amount = amount;
        this.paymentSchedule = paymentSchedule;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getPaymentSchedule() {
        return paymentSchedule;
    }
    
    //Boundary conditions definitely a good idea.
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setPaymentSchedule(String paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }
    
}
