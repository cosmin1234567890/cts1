public class Human implements  Runner {
    int age;
    @Override
    public int getSpeed() {
        if(age <50)
            return 10;
        else
            return 7;
    }

    Human(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }
}
