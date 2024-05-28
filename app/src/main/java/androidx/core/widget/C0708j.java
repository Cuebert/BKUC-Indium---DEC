package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0666c;
import androidx.core.view.InterfaceC0685q;

/* renamed from: androidx.core.widget.j */
/* loaded from: classes.dex */
public final class C0708j implements InterfaceC0685q {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.j$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        static CharSequence m4219a(Context context, ClipData.Item item, int i10) {
            if ((i10 & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* renamed from: b */
    private static CharSequence m4217b(Context context, ClipData.Item item, int i10) {
        return a.m4219a(context, item, i10);
    }

    /* renamed from: c */
    private static void m4218c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.InterfaceC0685q
    /* renamed from: a */
    public C0666c mo3775a(View view, C0666c c0666c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0666c);
        }
        if (c0666c.m3616d() == 2) {
            return c0666c;
        }
        ClipData m3614b = c0666c.m3614b();
        int m3615c = c0666c.m3615c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < m3614b.getItemCount(); i10++) {
            CharSequence m4217b = m4217b(context, m3614b.getItemAt(i10), m3615c);
            if (m4217b != null) {
                if (!z10) {
                    m4218c(editable, m4217b);
                    z10 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m4217b);
                }
            }
        }
        return null;
    }
}
