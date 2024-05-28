package com.Indium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class Logcat {
    public static String log_tag = "Indium_Java";

    public static void save_logs() {
        File file = new File("/storage/emulated/0/Documents/Indium/");
        File file2 = new File(file + "/debug_logs");
        File file3 = new File(file2, "logcat_" + System.currentTimeMillis() + ".logcat");
        if (!file.exists()) {
            file.mkdir();
        }
        if (!file2.exists()) {
            file2.mkdir();
        }
        try {
            Runtime.getRuntime().exec("logcat -d");
            Runtime.getRuntime().exec("logcat -f " + file3);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public static void dump_logs() {
        File file = new File("/storage/emulated/0/Documents/Indium/");
        File file2 = new File(file + "/debug_logs");
        File file3 = new File(file2, "dump_logcat_" + System.currentTimeMillis() + ".logcat");
        if (!file.exists()) {
            file.mkdir();
        }
        if (!file2.exists()) {
            file2.mkdir();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file3, true));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                bufferedWriter.write(readLine);
                bufferedWriter.newLine();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
