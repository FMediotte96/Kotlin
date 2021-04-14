package challenge9;

import com.kotlincode.Challenge;
import com.kotlincode.Employee2;
import com.kotlincode.KotlinCodeKt;
//import com.kotlincode.KotlinStuff;

public class Challenge9 {

    public static void main(String[] args) {
//        KotlinStuff.sayHelloToJava("Student");
//
//        Employee2 employee = new Employee2("John", "Smith", 2010);
//        employee.startYear = 2009;
//
//        Challenge.doMath(5, 4);
//

        KotlinCodeKt.sayHelloToJava("Student");

        Employee2 employee = new Employee2("John", "Smith", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(5, 4);

        employee.takesDefault("arg1");

//        employee.takesDefault(null);
    }
}
