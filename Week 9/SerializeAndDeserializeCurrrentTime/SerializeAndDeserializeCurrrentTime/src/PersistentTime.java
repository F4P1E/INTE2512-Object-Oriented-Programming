import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;

public class PersistentTime implements Serializable{

    // For version control
    //final static long serialVersionUID = 1234567L;
    private Date time;
    /*int i1;
    double d1;*/
    public PersistentTime() {
        time = Calendar.getInstance().getTime();
    }

    public Date getTime() {
        return time;
    }
}
