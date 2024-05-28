package p062e8;

import com.appsflyer.oaid.BuildConfig;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: e8.i */
/* loaded from: classes.dex */
public class C3098i {
    /* renamed from: a */
    public static String m13621a(int i10) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol(BuildConfig.FLAVOR);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        numberInstance.setMaximumFractionDigits(0);
        return numberInstance.format(i10);
    }
}
