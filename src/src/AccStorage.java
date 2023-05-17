import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allen Caingcoy
 */
public class AccStorage {
    private static final String fileloc = System.getProperty("java.io.tmpdir") + File.separator + "accs.txt";

    public static String getfilepath() {
        return fileloc;
    }

    public static void Accounts(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileloc, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
