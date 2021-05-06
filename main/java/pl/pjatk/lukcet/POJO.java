package pl.pjatk.lukcet;

public class POJO {

    private String firstName;

    public POJO(String firstName) {
        this.firstName = firstName;
        System.out.println("hello from construcor POJO");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void soutString() {
        System.out.println(firstName);
    }
}
