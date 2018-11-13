package de.goatfryed.studyright;

public class Student {
    private Room in;
    private String name;
    private int motivation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public Room getIn() {
        return in;
    }

    /**
     * owning side of relationship
     *
     * @param in
     */
    public void setIn(Room in) {
        if (this.in == in) {
            return;
        }

        if ( this.in != null) {
            this.in.getStudents().remove(this);
        }

        this.in = in;
        in.getStudents().add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.name;
    }
}
