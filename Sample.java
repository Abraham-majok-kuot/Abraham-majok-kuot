public class Sample {

    String name ;
    String program;
    int age;


    public Sample(String name, String program, int age) {
         this.name = name;
        this.program = program;
        this.age = age;
    }

    public void display(){

        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
    }

    public static void main(String[] args) {
        Sample objectrefence = new Sample("Abraham","software Engineering",27);
        objectrefence.display();
    }


}
