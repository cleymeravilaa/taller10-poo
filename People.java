public class People {
    
    public void introduce() {
        System.out.println("Hola, soy una persona");
    }
}

class Student extends People {
    @Override
    public void introduce(){
        System.out.println("Hola, soy un estudiante");
    }
}

class Teacher extends People {
    @Override
    public void introduce(){
        System.out.println("Hola, soy un profesor");
    }
}

class Test {
    public static void main(String[] args) {
        People p = new Student();
        p.introduce();
        
        People p2 = new Teacher();
        p2.introduce();
    }
}
