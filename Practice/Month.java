package Practice;

public class Month {
 private int name;
 private int days;

         public Month(int name){
         setMonth(name);
        }

         public int getName(){
         return (name);
        }

         public int getDays(){
         return (days);
         }

         public void setMonth(int name){
        this.name = name;
        if (name == 9 || name == 4 || name == 6 || name == 11)
             days = 30;
        else if(name == 2)
             days = 28;
         else
         days = 31;
         }

        public String toString(){
        return(this.convertToString() + " has " + days + " days in it.");
        }

         private String convertToString(){
        switch (name) {
             case 1: return "January";
            case 2: return "February";
           case 3: return "March";
            case 4: return "April";
            case 5: return "May";
          case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
           case 10: return "October";
           case 11: return "November";
           case 12: return "December";

            default: return "Invalid month";
            }
         }
}
 class SchoolMonth extends Month {
private boolean holidays; //are there any holidays in this month?
private char semester; //'F'all, 'S'pring, s'U'mmer

        public SchoolMonth(int name){
         super(name);
       setSemester();
        setHolidays();
    }

public boolean containsHolidays(){
return holidays;
 }

 public void setSemester(){
if (getName() > 7) // Aug - Dec
semester = 'F';
 else if(getName() > 4) // May - July
 semester = 'U';
else
semester = 'S'; // Jan - April
 }

public void setHolidays(){
if (super.getName() != 3 && getName() !=4 && getName() != 6 && getName() !=8)
 holidays = true;
}

public String toString(){
 return (super.toString() + " It is in the " + semester + " semester.");
 }

}
