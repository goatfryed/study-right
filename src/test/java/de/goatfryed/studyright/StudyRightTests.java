package de.goatfryed.studyright;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class StudyRightTests {

    @Test
    public void testStudentRoomRelationShip()
    {
        UniversityBuilder ub = new UniversityBuilder();

        Student karli = ub.createStudent("Karli", 247);
        Room entrance = ub.createRoom("entrance hall", 0);
        Room mathRoom = ub.createRoom("math room", 19);

        karli.setIn(entrance);

        Assert.assertEquals(karli.getIn(), entrance);
        Assert.assertTrue( entrance + "without karli", entrance.getStudents().contains(karli));

        karli.setIn(mathRoom);
        Assert.assertEquals(karli.getIn(), mathRoom);
        Assert.assertTrue(mathRoom + "without karli", mathRoom.getStudents().contains(karli));
        Assert.assertFalse(entrance + "with karli", entrance.getStudents().contains(karli));
    }

    @Test
    public void testRoomStudentRelationShip()
    {
        UniversityBuilder ub = new UniversityBuilder();

        Student karli = ub.createStudent("Karli", 247);
        Room entrance = ub.createRoom("entrance hall", 0);
        Room mathRoom = ub.createRoom("math room", 19);

        entrance.addStudent(karli);

        Assert.assertEquals(karli.getIn(), entrance);
        Assert.assertTrue( entrance + "without karli", entrance.getStudents().contains(karli));

        mathRoom.addStudent(karli);
        Assert.assertEquals(karli.getIn(), mathRoom);
        Assert.assertTrue(mathRoom + "without karli", mathRoom.getStudents().contains(karli));
        Assert.assertFalse(entrance + "with karli", entrance.getStudents().contains(karli));
    }
}
