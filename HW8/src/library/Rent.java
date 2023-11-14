package library;

import java.util.Date;

public class Rent {
    Item item;
    Date end;

    Date begin;
    Student student;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.end = end;
        this.begin = begin;
        this.student = student;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "item=" + item +
                ", end=" + end +
                ", begin=" + begin +
                ", student=" + student +
                '}';
    }
}
