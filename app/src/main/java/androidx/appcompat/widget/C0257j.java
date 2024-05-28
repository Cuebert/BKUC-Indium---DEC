package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C0654h;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
final class C0257j {

    /* renamed from: a */
    private TextView f1137a;

    /* renamed from: b */
    private TextClassifier f1138b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0257j(TextView textView) {
        this.f1137a = (TextView) C0654h.m3467f(textView);
    }

    /* renamed from: a */
    public TextClassifier m1213a() {
        TextClassifier textClassifier = this.f1138b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1137a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    /* renamed from: b */
    public void m1214b(TextClassifier textClassifier) {
        this.f1138b = textClassifier;
    }
}
