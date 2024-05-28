package backtraceio.library.common;

import android.content.Context;
import android.util.Log;
import backtraceio.library.logger.BacktraceLogger;
import com.appsflyer.oaid.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/* loaded from: classes.dex */
public class FileHelper {
    private static final String LOG_TAG = "FileHelper";

    public static ArrayList<String> filterOutFiles(Context context, List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (String str : new ArrayList(new HashSet(list))) {
            if (isFilePathInvalid(str)) {
                Log.e(LOG_TAG, String.format("Path for file %s is invalid", str));
            } else {
                if (!isPathToInternalStorage(context, str)) {
                    String str2 = LOG_TAG;
                    Log.d(str2, String.format("Passed path is path to external storage %s", str));
                    if (!PermissionHelper.isPermissionForReadExternalStorageGranted(context)) {
                        Log.e(str2, "Permission READ_EXTERNAL_STORAGE is not granted.");
                    }
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String getFileExtension(File file) {
        String substring = file.getName().substring(Math.max(file.getName().lastIndexOf(47), file.getName().lastIndexOf(92)) < 0 ? 0 : Math.max(file.getName().lastIndexOf(47), file.getName().lastIndexOf(92)));
        int lastIndexOf = substring.lastIndexOf(".");
        return lastIndexOf == -1 ? BuildConfig.FLAVOR : substring.substring(lastIndexOf + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getFileNameFromPath(String str) {
        return str.substring(str.lastIndexOf("/") + 1);
    }

    public static boolean isFileExists(String str) {
        return new File(str).exists();
    }

    private static boolean isFilePathInvalid(String str) {
        return str == null || str.isEmpty() || !isFileExists(str);
    }

    private static boolean isPathToInternalStorage(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        String str2 = context.getApplicationInfo().dataDir;
        String absolutePath = context.getCacheDir().getAbsolutePath();
        String path = context.getFilesDir().getPath();
        BacktraceLogger.m6448d(LOG_TAG, String.format("Passed path %s, Internal paths %s, %s, %s", str, str2, absolutePath, path));
        return str.startsWith(str2) || str.startsWith(absolutePath) || str.startsWith(path);
    }

    public static String readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            StringBuilder sb2 = new StringBuilder();
            while (scanner.hasNext()) {
                sb2.append(scanner.nextLine());
            }
            scanner.close();
            return sb2.toString();
        } catch (Exception e10) {
            Log.e(LOG_TAG, e10.getMessage());
            return null;
        }
    }
}
