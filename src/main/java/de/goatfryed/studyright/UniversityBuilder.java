package de.goatfryed.studyright;

public class UniversityBuilder {
    public Student createStudent(String name, int motivation) {
        Student student = new Student();
        student.setName(name);
        student.setMotivation(motivation);

        return student;
    }

    public Room createRoom(String name, int credits) {
        Room room = new Room();
        room.setName(name);
        room.setCredits(credits);

        return room;
    }
}
