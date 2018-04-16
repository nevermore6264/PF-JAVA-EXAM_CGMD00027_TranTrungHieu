import java.util.Comparator;

public class RatImps implements Comparator<Rat> {

    public int compare(Rat o1, Rat o2) {
        String a = o1.getName();
        String b = o2.getName();
        if(a.charAt(0)>b.charAt(0)){
            return 1;
        }else if(a==b){
            return 0;
        }else{
            return -1;
        }
    }
}
