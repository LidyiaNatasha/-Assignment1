
public class EducationDayCampsCompany {

    private String name, email, location;
    private int contactNo;

    public EducationDayCampsCompany(String n, String e, String l, int cN) {
        this.name = n;
        this.email = e;
        this.location = l;
        this.contactNo = cN;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

}
