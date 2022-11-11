import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Programa{
    public static void main(String[] args){
        File arquivo = new File("/home/gabriel/Desktop/teste.txt");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo,false));
            bw.write("Conteúdo do arquivo");
            bw.close();
        }
        catch(IOException e){
            System.out.println("Erro. Arquivo não encontrado.");
        }
    }
}
