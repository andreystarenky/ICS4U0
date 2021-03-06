/**
 * Books have a title and course name. Students hold Books, but Books have no reference to Students
 *
 * <h2>Course Info</h2>
 * ICS4U0 with Krasteva V.
 *
 * @author Daniel Voznyy
 * @version 24.04.19
 */
public class Book {
    String title;
    String course;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return title;
    }
}
