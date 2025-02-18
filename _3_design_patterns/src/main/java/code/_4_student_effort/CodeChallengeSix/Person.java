package code._4_student_effort.CodeChallengeSix;

public class Person {
    private String name,job,university,drivingLicense;
    private boolean isMarried;

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }
static class Builder{
    private String name,job,university,drivingLicense;
    private boolean isMarried;

    public Builder(String name) {
        this.name = name;
    }

    public Builder job(String job)
    {
        this.job=job;
        return this;
    }
    public Builder university(String university)
    {
        this.university=university;
        return this;
    }
    public Builder drivingLicense(String drivingLicense)
    {
        this.drivingLicense=drivingLicense;
        return this;
    }
    public Builder isMarried(boolean isMarried)
    {
        this.isMarried=isMarried;
        return this;
    }
   public Person build(){
        return  new Person(this);
   }
}
}
