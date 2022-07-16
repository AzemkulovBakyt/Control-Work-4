public class Cats {
    private String name;
    private Integer age;
    private Integer satiety;
    private Integer mood;
    private Integer health;
    private Integer averageLevel;

    public Cats(String name, Integer age, Integer satiety, Integer mood, Integer health) {
        this.name = name;
        this.age = age;
        this.satiety = satiety;
        this.mood = mood;
        this.health = health;
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public Integer getSatiety() {
        return satiety;
    }

    public void setSatiety(final Integer satiety) {
        this.satiety = satiety;
    }

    public Integer getMood() {
        return mood;
    }

    public void setMood(final Integer mood) {
        this.mood = mood;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(final Integer health) {
        this.health = health;
    }

    public Integer getAverageLevel() {
        averageLevel = (health + mood + satiety) / 3;
        return averageLevel;
    }

    public void setAverageLevel(final Integer averageLevel) {
        this.averageLevel = averageLevel;
    }

    @Override
    public String toString() {
        return String.format(" | %8s | %4d | %6d | %4d | %7d | %12d |",
                name, age, health, mood, satiety, getAverageLevel());
    }
}
