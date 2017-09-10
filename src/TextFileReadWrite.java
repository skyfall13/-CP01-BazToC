import java.io.*;

public class TextFileReadWrite {

    File inputFile = new File(".","input.baz");
    File outputFile = new File(".","test.c");


    public void FileReader(){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(inputFile));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(FileNotFoundException fne){
            fne.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally {
            if( br!= null){
                try{
                    br.close();
                }catch (IOException ioe)
                {
                    System.out.println("파일 존재하나 IO에러");
                }
            }
        }

    }
    public void FileWriter(){
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(outputFile));
            bw.write("#include<stdio.h>");
            bw.newLine();
            bw.newLine();
            bw.write("enum baz_val { TRUE, FALSE, BAZ };");
            bw.newLine();
            bw.newLine();
            bw.write("void baz_print(enum baz_val v) {");
            bw.newLine();
            bw.newLine();
            bw.write("  if(v == TRUE)");
            bw.newLine();
            bw.write("  {");
            bw.newLine();
            bw.write("      printf("+"\""+"v\\n"+"\""+");");
            bw.newLine();
            bw.write("  }");
            bw.newLine();
            bw.write("  else printf("+"\""+"YOU ARE WRONG!\\n"+"\""+");");
            bw.newLine();
            bw.write("}");
            bw.newLine();
            bw.write("int main(void)");
            bw.newLine();
            bw.write("{");
            bw.newLine();
            bw.write("}");
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
            if(bw != null){
                try{
                    bw.close();
                }catch(IOException ioe){

                }
            }
        }

    }
}
