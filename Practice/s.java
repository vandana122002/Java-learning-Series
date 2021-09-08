package Practice;

public class s {
    private int marks;
    private String name;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public s(int marks, String name) {
        this.marks = marks;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }


//    @Override
//    public int compareTo(Object o) {
//           s a=(s)o;
//        if(this.name.equals(a.name))
//        {
//            return this.marks-a.marks;
//        }
//        return this.name.compareTo(a.name);
//    }
}
