import java.io.*;

public class Main {
    public static void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum =0;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();

            System.out.println("tong"+sum);

        }catch (Exception e){
            System.err.println("file khong ton tai hoac noi dung co loi");
        }
    }

    public static void main(String[] args) {
        readFileText("sum.txt");
    }
}
