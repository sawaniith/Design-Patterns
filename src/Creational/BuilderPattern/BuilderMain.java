package Creational.BuilderPattern;

public class BuilderMain {
    //why builder needed? => too many parameters of an object, but we need only then, but will have to pass whole
    //params which was not needed.(Difficult to handle optional vs required parameters cleanly.)
    //Hard to understand long constructors with many parameters.

    //why not added the setters in the class itself instead of separate builders? => Immutability is lost (You need
    // to provide public setters, which means anyone can change the state of the object at any time.)

    //how builder differ from decorator?
    //builder
    //To construct complex objects step-by-step, usually with many optional fields or configurations.
    //focus on Object creation

    //decorator
    //To add behavior or responsibilities to an object dynamically at runtime, without changing the base class.
    //focus on Object modification / extension

    public static void main(String[] args) {
        Director directorObj1 = new Director(new EnggStudentBuilder());
        Director directorObj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = directorObj1.createStudent();
        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }

}
