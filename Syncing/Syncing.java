import java.util.HashMap;
import java.io.File;

class Syncing{

    String folder = "data";
    Syncing(){
        getFileList();
    }



    void getFileList(){
        
        File[] files = new File(folder).listFiles();

        for(File file:files ){
            System.out.println(file.getName());
        }
    }

    public static void main(String[] args){
       Syncing syncing = new Syncing();
    }

}
