public class Employee {
    private  String first_name;
    private  String last_name;
    private  String address;
    private  String email;
    private  String job_Position;
    private  int contact;
    private  double rate;
    



    public Employee( String first_name,  String last_name, String address,
      String email,  String job_Position,  int contact, double rate) {
        this.first_name = ucfirst(first_name);
        this.last_name = ucfirst(last_name);
        this.address = address;
        this.email = email;
        this.job_Position = job_Position;
        this.contact = contact;
        this.rate = rate;

        

    }

    public String getFullName() {
        return this.last_name + ", " + this.first_name;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public String getEmail() {
        return this.email;
    }

    public String getJobPosition() {
        return this.job_Position;
    }
    public int getContact() {
        return this.contact;
    }
    public double getRate() {
        return this.rate;
    }

    private String ucfirst(final String str) {
        return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1, str.length());
    }
}
