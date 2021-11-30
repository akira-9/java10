public class RecorderRunner extends Recorder {
    public static void main(String[] args){
        Recorder recorder = new Recorder();
        recorder.execute("key1", "value1");
        recorder.execute("key1", "Delete");
        try{
            recorder.execute("key3", "Delete");
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        recorder.execute("key2", "value2");
        recorder.execute(null, null);
    }
    
}