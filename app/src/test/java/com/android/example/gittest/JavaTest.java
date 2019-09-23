package com.android.example.gittest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class JavaTest {
    private final static String CHANGED_COM = "git status %1s -s --no-renames";
    public static   void  main(String agrs[]){
        String format = String.format(CHANGED_COM, "E:\\git\\github\\GitTest");

        System.out.println(format);

        try {
            exec(format);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exec(String cmdStr) throws InterruptedException, IOException {
        Process process = Runtime.getRuntime().exec(cmdStr);
        process.waitFor();
        int exitValue = process.exitValue();
        InputStream inputStream = process.getInputStream();
        readStream(inputStream);
//        return process.getInputStream();
    }
    public static void readStream(InputStream inputStream) {
        InputStreamReader isr = null;
        BufferedReader reader = null;
        String str;
        try {
            isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            reader = new BufferedReader(isr);
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


