package ua.hillel.lozovii.homeworks.hw12;

public class FitnessTracker {
    private final String name;
    private String surName;
    private final int dateDay;
    private final int dateMonth;
    private final int dateYear;
    private final int age;
    private final String email;
    private final String phoneNumber;
    private int weight;
    private int bloodPreasure;
    private int stepCount;

    public FitnessTracker(String name, String surName, int dateDay, int dateMonth, int dateYear, String email, String phoneNumber, int weight, int bloodPreasure, int stepCount) {
        this.name = name;
        this.dateDay = dateDay;
        this.dateMonth = dateMonth;
        this.dateYear = dateYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surName = surName;
        this.weight = weight;
        this.bloodPreasure = bloodPreasure;
        this.stepCount = stepCount;

        this.age = 2023 - this.dateYear;
    }

    public String getName() {
        return name;
    }

    public int getDateDay() {
        return dateDay;
    }

    public int getDateMonth() {
        return dateMonth;
    }

    public int getDateYear() {
        return dateYear;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurName() {
        return surName;
    }

    public int getWeight() {
        return weight;
    }

    public int getBloodPreasure() {
        return bloodPreasure;
    }

    public int getStepCount() {
        return stepCount;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPreasure(int bloodPreasure) {
        this.bloodPreasure = bloodPreasure;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }

    public String printAccountInfo() {
        return "\nName= " + name + ", Surname= " + surName +
                "\nBirth Day= " + dateDay + ", Birth Month= " + dateMonth + ", Birth Year= " + dateYear + ", Age= " + age +
                "\nEmail= " + email + ", Phone Number= " + phoneNumber +
                "\nWeight= " + weight + ", Blood Preasure= " + bloodPreasure + ", Step Count= " + stepCount;
    }

    @Override
    public String toString() {
        return "FitnessTracker{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", dateDay=" + dateDay +
                ", dateMonth=" + dateMonth +
                ", dateYear=" + dateYear +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", weight=" + weight +
                ", bloodPreasure=" + bloodPreasure +
                ", stepCount=" + stepCount +
                '}';
    }
}
