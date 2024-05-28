package com.Indium;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.appsflyer.oaid.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class JniUtils {
    public static String FILESYS_AUTOEXEC = "autoexec";
    public static String FILESYS_DATA = "app_assets/content/Indium";
    public static String FILESYS_SCRIPTS = "scripts";
    public static String FILESYS_WORKSPACE = "workspace";

    /* loaded from: classes.dex */
    static class ClipRunner implements Runnable {
        final String text;

        @Override // java.lang.Runnable
        public void run() {
            Activity activity = IndiumMain.rbx_ctxt;
            Activity activity2 = IndiumMain.rbx_ctxt;
            ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("IndiumClip", this.text));
        }

        ClipRunner(String str) {
            this.text = str;
        }
    }

    /* loaded from: classes.dex */
    static class ClipGetter implements Callable<String> {
        ClipGetter() {
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            Activity activity = IndiumMain.rbx_ctxt;
            Activity activity2 = IndiumMain.rbx_ctxt;
            ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
            return (clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClipDescription().hasMimeType("text/plain")) ? clipboardManager.getPrimaryClip().getItemAt(0).getText().toString() : BuildConfig.FLAVOR;
        }
    }

    public static void set_clipboard_data(String str) {
        try {
            IndiumMain.rbx_ctxt.runOnUiThread(new ClipRunner(str));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Toast.makeText(IndiumMain.rbx_ctxt, "Indium: Copied data to clipboard!", 1);
    }

    public static String get_clipboard_data() {
        FutureTask futureTask = new FutureTask(new ClipGetter());
        IndiumMain.rbx_ctxt.runOnUiThread(futureTask);
        try {
            return (String) futureTask.get();
        } catch (InterruptedException e10) {
            Log.e(Logcat.log_tag, "Exception thrown during get clipboard data ( Ex Interrupted )", e10.getCause());
            return BuildConfig.FLAVOR;
        } catch (ExecutionException e11) {
            Log.e(Logcat.log_tag, "Exception thrown during get clipboard data", e11.getCause());
            return BuildConfig.FLAVOR;
        }
    }

    public static String get_hwid() {
        return Settings.Secure.getString(IndiumMain.rbx_ctxt.getContentResolver(), "android_id");
    }

    public static void enable_debug_mode() {
        IndiumMain.debug_mode = true;
    }

    public static void dump_logs() {
        Logcat.dump_logs();
    }

    public static void ask_permissions() {
        IndiumMain.rbx_ctxt.requestPermissions(new String[]{"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.ACCESS_MEDIA_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES"}, 1);
    }

    public static boolean permissions_granted() {
        boolean isExternalStorageManager;
        if (ContextCompat.checkSelfPermission(IndiumMain.rbx_ctxt, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                return false;
            }
        }
        return true;
    }

    public static float get_display_density() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) IndiumMain.rbx_ctxt.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public static String get_storage_path() {
        if (Build.VERSION.SDK_INT >= 28) {
            File externalFilesDir = IndiumMain.rbx_ctxt.getExternalFilesDir(null);
            if (externalFilesDir == null && (externalFilesDir = IndiumMain.rbx_ctxt.getExternalFilesDir(null)) == null) {
                return IndiumMain.rbx_ctxt.getFilesDir().toString();
            }
            return externalFilesDir.toString();
        }
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String get_data_dir() {
        return IndiumMain.rbx_ctxt.getApplicationInfo().dataDir;
    }

    public static File get_Indium_dir() {
        File file = new File(get_storage_path(), "Indium");
        file.mkdirs();
        return file;
    }

    private static void dir_delete_help(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        dir_delete_help(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static void delete_path(String str, String str2) {
        File file;
        File[] listFiles;
        if (str2 == null) {
            return;
        }
        if (str.contains(FILESYS_DATA)) {
            file = new File(get_data_dir(), FILESYS_DATA);
        } else {
            file = new File(get_Indium_dir(), str);
        }
        file.mkdirs();
        File file2 = new File(file, str2);
        if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
            for (File file3 : listFiles) {
                if (file3.isDirectory()) {
                    dir_delete_help(file3);
                } else {
                    file3.delete();
                }
            }
        }
        file2.delete();
    }

    public static String[] list_files(String str, String str2) {
        File file;
        if (str.contains(FILESYS_DATA)) {
            file = new File(get_data_dir(), FILESYS_DATA);
        } else {
            file = new File(get_Indium_dir(), str);
        }
        file.mkdirs();
        String[] list = new File(file, str2).list();
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            arrayList.add(str2.concat("/" + str3));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean is_file(String str, String str2) {
        File file;
        if (str.contains(FILESYS_DATA)) {
            file = new File(get_data_dir(), FILESYS_DATA);
        } else {
            file = new File(get_Indium_dir(), str);
        }
        file.mkdirs();
        return new File(file, str2).isFile();
    }

    public static boolean is_dir(String str, String str2) {
        File file;
        if (str.contains(FILESYS_DATA)) {
            file = new File(get_data_dir(), FILESYS_DATA);
        } else {
            file = new File(get_Indium_dir(), str);
        }
        file.mkdirs();
        return new File(file, str2).isDirectory();
    }

    public static boolean path_exists(String str, String str2) {
        File file;
        if (str.contains(FILESYS_DATA)) {
            file = new File(get_data_dir(), FILESYS_DATA);
        } else {
            file = new File(get_Indium_dir(), str);
        }
        file.mkdirs();
        return new File(file, str2).exists();
    }

    public static void make_folder(String str, String str2) {
        File file;
        if (str.contains(FILESYS_DATA)) {
            file = new File(get_data_dir(), FILESYS_DATA);
        } else {
            file = new File(get_Indium_dir(), str);
        }
        file.mkdirs();
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf != -1) {
            new File(file, str2.substring(0, lastIndexOf)).mkdirs();
        }
    }

    public static void append_file(String str, String str2, String str3) {
        write_file(str, str2, read_file(str, str2).concat(str3));
    }

    public static void write_file(String str, String str2, String str3) {
        File file;
        if (str.contains(FILESYS_DATA)) {
            file = new File(get_data_dir(), FILESYS_DATA);
        } else {
            file = new File(get_Indium_dir(), str);
        }
        file.mkdirs();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str2).getAbsolutePath());
            fileOutputStream.write(str3.getBytes());
            fileOutputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public static String read_file(String str, String str2) {
        File file;
        if (str.contains(FILESYS_DATA)) {
            file = new File(get_data_dir(), FILESYS_DATA);
        } else {
            file = new File(get_Indium_dir(), str);
        }
        file.mkdirs();
        File file2 = new File(file, str2);
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
            boolean z10 = false;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (z10) {
                    sb2.append("\n");
                }
                sb2.append(readLine);
                z10 = true;
            }
            bufferedReader.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }
}
