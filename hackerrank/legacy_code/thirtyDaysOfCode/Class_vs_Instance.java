// Day 4
package thirtyDaysOfCode;

class Class_vs_Instance {
    private int age;

    public Class_vs_Instance(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        System.out.println(age < 13 ? "You are young." : (age >= 13 && age < 18 ? "You are ArrayRotation1 teenager." : "You are old."));
    }

    public void yearPasses() {
        ++age;
    }
}