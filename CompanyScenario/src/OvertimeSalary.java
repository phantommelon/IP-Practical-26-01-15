
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
 * Salary with added overtime.
 * 
 * @author Alistair Madden <phantommelon@gmail.com> 
 * @version (a version number or a date)
 */

public class OvertimeSalary {
    
    private double hourlyRate;
    private double overtimeHours;
    
    public OvertimeSalary(double hourlyRate) {
        this.hourlyRate = hourlyRate;
        overtimeHours = 0;
    }
    
    public OvertimeSalary(double hourlyRate, double overtimeHours) {
        this.hourlyRate = hourlyRate;
        this.overtimeHours = overtimeHours;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    public double getOvertimeHours() {
        return overtimeHours;
    }
    
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    
}
