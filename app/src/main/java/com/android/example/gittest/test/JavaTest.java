package com.android.example.gittest.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JavaTest {
    public   void  name(){
        InputStream inputStream=null;
        try {
            File file=new File("");
            inputStream=new FileInputStream(file) ;
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            LogUtils
        }catch (Exception ex){
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
