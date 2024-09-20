
class Employee {
    private int id;         // Табельный номер
    private String phone;   // Номер телефона
    private String name;    // Имя
    private int experience; // Стаж

    public Employee(int id, String phone, String name, int experience) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "ID = " + id +
                ", Name = '" + name + '\'' +
                ", Phone = '" + phone + '\'' +
                ", Experience = " + experience + " years" +
                " }";
    }
}

