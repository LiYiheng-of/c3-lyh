import java.io.*;

public class ReadFail {

    public static void main(String[] args) {
        StringBuffer output=null;
        try {

            File fin = new File("C:\\csatest\\demo.txt");
            FileReader fr = null;
            fr = new FileReader(fin);
            BufferedReader br = new BufferedReader(fr);
            output = new StringBuffer();
            String s = null;
            while ((s=br.readLine())!=null)
                output.append(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String op= output.toString();
        try {
            BufferedWriter out=new BufferedWriter(new FileWriter("C:\\csatest\\demo2.txt"));
            out.write(op);
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
                int ans=0;
                int pos=0;
                while(pos<op.length()&&pos!=-1)
                {
                    pos=op.indexOf("2021",pos)+4;
                    ans++;
                }
                System.out.println(ans);
            }
    }

