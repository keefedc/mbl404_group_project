package edu.phoenix.mbl404.mbl404_group_project;

public class RolodexLoader {
    private String contactName;
    private String address;
    private String status;
    private String website;
    private long phone;

    public RolodexLoader() {
    }

    public RolodexLoader(String contactName, String address, String status, String website, long phone) {
        this.contactName = contactName;
        this.address = address;
        this.status = status;
        this.website = website;
        this.phone = phone;
    }

    public String getContact() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) { this.website = website; }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "RolodexLoader{" +
                "contactName='" + contactName + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", website='" + website + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
