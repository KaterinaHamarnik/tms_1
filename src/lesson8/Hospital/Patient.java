package lesson8.Hospital;

public class Patient {
    private String name;
    private int age;
    private String doctor;
    private String treatmentPlan;

    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();
    Therapist therapist = new Therapist();

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

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    void treatment(){
        String a = "body";
        String b = "teeth";
        if (this.treatmentPlan.equals(a)){
            setDoctor("Surgeon");
            surgeon.treatment();
        } else if (this.treatmentPlan.equals(b)) {
            setDoctor("Dentist");
            dentist.treatment();
        } else {
            setDoctor("Therapist");
            therapist.treatment();
        }
    }
}
