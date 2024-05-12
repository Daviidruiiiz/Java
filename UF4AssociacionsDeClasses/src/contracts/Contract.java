/*
 * 
 * Contract.java
 * 
 * null
 * 
 * Copyright 2024 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
package contracts;

import java.time.LocalDateTime;

public class Contract {
    // Create the default private attributes 
    private int code;
    private String initialDate;
    private String endDate;
    private Company company;


public Contract() {
    this.code = 0;
    this.initialDate = JodaDT.formatDDMMYYYY(LocalDateTime.now());
    this.endDate = JodaDT.formatDDMMYYYY(LocalDateTime.now().plusYears(1));
    this.company = new Company();
}

public Contract(int code) {
    this.code = code;
    }

public Contract(int code, String initialDate, String endDate) {
    this.code = code;
    this.initialDate = initialDate;
    this.endDate = endDate;
}


public Company getCompany() {
    return company;
}

public int duration() {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime end = JodaDT.parseDDMMYYYY(this.endDate);

    long duration = JodaDT.durationInSeconds(now, end);

    int h = (int) duration / 3600;
    int d = h / 24;

    return d;
}

public String getInitialDate() {
    return initialDate;
}

public String getEndDate() {
    return endDate;
}

public void setCompany(Company company) {
    this.company = company;
}

public int hashCode() {
    return 0;
}

public boolean equals(Object obj) {
    // Checking if the other object is null or not of the same class
    if (this == obj)
        return true;
    if (obj == null || this.getClass() != obj.getClass())
        return false;
    Contract otherCode = (Contract) obj;

    return code == (otherCode.code);
}




}