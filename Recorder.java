import java.util.HashMap;
import java.util.Map;

public class Recorder {
  private Map map = new HashMap();
  public void execute(String key, String value){
    String Delete;
    if(key == null && value == null){
      this.map.clear();
      System.out.println("Empty");
    } else if(key != null && value == null){
      System.out.println(this.map.get(value));
    }else if(key != null && value == "Delete"){
      Object delete = this.map.remove(key);
      if(delete != null){
        System.out.println(key + " deleted");
      }else {
        throw new IllegalArgumentException();
      }
    }else if(key != null && value != null){
      this.map.put(key, value);
      System.out.println(key + "=" + value);
  }
  }
}
