public class Student {
    final private String MSV;
    private String name;
    private int age;
    private String address;
    private boolean gender;

    public Student(String msv) {
        MSV = msv;
    }

    public Student(String msv, String name, int age, String address, boolean gender) {
        MSV = msv;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getMSV() {
        return MSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String displayGender() {
        if (this.gender) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }

    @Override
    public String toString() {
        return " Student{" +
                "  MSV = " + getMSV() +
                ", name= '" + name + '\'' +
                ", age= " + age +
                ", address ='" + address + '\'' +
                ", gender =" + displayGender() +
                '}';
    }
}
