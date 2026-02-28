package cesde.edu.co.models;

public class Persons {

System.out.println("Hello  world");
}

Long userId;
String code;
String documentNumber;
String firtsName;
String lastName;
Boolean status;

public Persons() {
}
}

public Long getUserId() {
    return userId;
}

public void setUserId(Long userId) {
    this.userId = userId;
}

public String getCode() {
    return code;
}

public void setCode(String code) {
    this.code = code;
}

public String getDocumentNumber() {
    return documentNumber;
}

public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
}

public String getFirtsName() {
    return firtsName;
}

public void setFirtsName(String firtsName) {
    this.firtsName = firtsName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public Boolean getStatus() {
    return status;
}

public void setStatus(Boolean status) {
    this.status = status;
}

@Override
public String toString() {
    return "Persons{" +
            "userId=" + userId +
            ", code='" + code + '\'' +
            ", documentNumber='" + documentNumber + '\'' +
            ", firtsName='" + firtsName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", status=" + status +
            '}';
}