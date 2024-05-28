package p302x9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* renamed from: x9.b */
/* loaded from: classes.dex */
public class C5571b {
    /* renamed from: a */
    public static List<String> m20476a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File(str));
            while (scanner.hasNextLine()) {
                try {
                    arrayList.add(scanner.nextLine());
                } finally {
                    scanner.close();
                }
            }
            return arrayList;
        } catch (FileNotFoundException unused) {
            return arrayList;
        }
    }
}
