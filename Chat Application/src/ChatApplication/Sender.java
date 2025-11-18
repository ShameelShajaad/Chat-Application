package ChatApplication;

/**
 *
 * @author Shameel Shajaad
 */
public class Sender {
    private String name;
    
    public Sender(String name){
        this.name=name;
    }
    
    public String getSenderName(){
        return name;
    }
    
    public String message(String msg){
        return name+": "+msg;
    }
}
