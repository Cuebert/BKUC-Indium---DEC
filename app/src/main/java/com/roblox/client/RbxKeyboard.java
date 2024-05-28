package com.roblox.client;

import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.components.C2808i;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import p033c7.C1134c;
import p035c9.C1151k;

/* loaded from: classes.dex */
public class RbxKeyboard extends AppCompatEditText {

    /* renamed from: n */
    private final String f10380n;

    /* renamed from: o */
    private long f10381o;

    /* renamed from: p */
    private boolean f10382p;

    /* renamed from: q */
    private long f10383q;

    /* renamed from: r */
    private boolean f10384r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.RbxKeyboard$a */
    /* loaded from: classes.dex */
    public class C2733a implements TextWatcher {
        C2733a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C1151k.m6707a("rbx.glview.text", "onTextChanged() text:" + ((Object) charSequence));
            RbxKeyboard.this.m12212k();
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), charSequence.toString(), false, i10 + i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.RbxKeyboard$b */
    /* loaded from: classes.dex */
    public class C2734b implements TextView.OnEditorActionListener {
        C2734b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (C1134c.m6537a().mo6623k1() && C2877p0.m12935m0() && SystemClock.elapsedRealtime() - RbxKeyboard.this.f10383q < C1134c.m6537a().mo6556I0()) {
                C1151k.m6716j("rbx.glview.text", "onEditorAction with actionId: " + i10 + " ignored since it's too close to focus event.");
                InputMethodManager inputMethodManager = (InputMethodManager) RbxKeyboard.this.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(textView, 2);
                }
                return true;
            }
            C1151k.m6707a("rbx.glview.text", "onEditorAction() text:" + ((Object) textView.getText()));
            RbxKeyboard.this.m12212k();
            NativeGLInterface.nativeReturnPressedFromOnScreenKeyboard(RbxKeyboard.this.getCurrentTextBox());
            if (RbxKeyboard.this.m12209f()) {
                return true;
            }
            if (C1134c.m6537a().mo6652u1()) {
                if (C2877p0.m12935m0() && i10 == 6) {
                    return false;
                }
                NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), textView.getText().toString(), true, textView.getSelectionStart());
                RbxKeyboard.this.m12207d();
                return true;
            }
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), textView.getText().toString(), true, textView.getSelectionStart());
            RbxKeyboard.this.m12207d();
            return true;
        }
    }

    public RbxKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10380n = "rbx.glview.text";
        this.f10383q = 0L;
        this.f10384r = false;
    }

    /* renamed from: g */
    public /* synthetic */ void m12205g(View view, boolean z10) {
        if (z10) {
            this.f10383q = SystemClock.elapsedRealtime();
            this.f10384r = true;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m12206h(View view, int i10, KeyEvent keyEvent) {
        return i10 == 67;
    }

    /* renamed from: d */
    public void m12207d() {
        setCurrentTextBox(0L);
        C2817d1.m12471j(getContext(), this);
        setVisibility(8);
    }

    /* renamed from: e */
    public void m12208e() {
        if (C1134c.m6537a().mo6623k1() && C2877p0.m12935m0()) {
            setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.roblox.client.g0
                public /* synthetic */ ViewOnFocusChangeListenerC2828g0() {
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    RbxKeyboard.this.m12205g(view, z10);
                }
            });
        }
        if (C1134c.m6537a().mo6557J()) {
            setOnKeyListener(ViewOnKeyListenerC2835h0.f11263n);
        }
        addTextChangedListener(new C2733a());
        setOnEditorActionListener(new C2734b());
    }

    /* renamed from: f */
    public boolean m12209f() {
        return this.f10382p;
    }

    public long getCurrentTextBox() {
        return this.f10381o;
    }

    /* renamed from: i */
    public void m12210i() {
        C1151k.m6712f("rbx.glview.text", "onVrSessionForeground");
        if (this.f10384r && C2877p0.m12935m0() && SystemClock.elapsedRealtime() - this.f10383q < C1134c.m6537a().mo6556I0()) {
            C1151k.m6707a("rbx.glview.text", "Maquettes keyboard quick hide issue encountered.");
            C2817d1.m12476o(this);
        } else if (this.f10384r && C2877p0.m12935m0()) {
            C1151k.m6707a("rbx.glview.text", "Maquettes keyboard release focus only hide triggered.");
            NativeGLInterface.nativeReleaseFocus(this.f10381o);
            this.f10381o = 0L;
            this.f10384r = false;
        }
    }

    /* renamed from: j */
    public void m12211j(long j10) {
        NativeGLInterface.nativeReleaseFocus(j10);
    }

    /* renamed from: k */
    public void m12212k() {
        String obj = getText().toString();
        int selectionStart = getSelectionStart();
        C1151k.m6707a("rbx.glview.text", "syncTextboxTextAndCursorPosition() text:" + obj + " pos:" + selectionStart);
        NativeGLInterface.syncTextboxTextAndCursorPosition2(obj, selectionStart);
    }

    /* renamed from: l */
    public void m12213l(NativeTextBoxInfo nativeTextBoxInfo) {
        int i10;
        if (nativeTextBoxInfo != null) {
            setTextColor(nativeTextBoxInfo.textColor);
            setManualFocusRelease(nativeTextBoxInfo.manualFocusRelease);
            switch (nativeTextBoxInfo.textInputType) {
                case 2:
                case 8:
                    i10 = 2;
                    break;
                case 3:
                    i10 = 33;
                    break;
                case 4:
                    i10 = 3;
                    break;
                case 5:
                    i10 = 129;
                    break;
                case 6:
                    i10 = 524432;
                    break;
                case 7:
                    i10 = 524289;
                    break;
                default:
                    i10 = 1;
                    break;
            }
            int i11 = nativeTextBoxInfo.returnKeyType;
            int i12 = 4;
            if (i11 == 1) {
                i12 = 6;
            } else if (i11 == 2) {
                i12 = 2;
            } else if (i11 == 3) {
                i12 = 5;
            } else if (i11 == 4) {
                i12 = 3;
            }
            if (nativeTextBoxInfo.multiline) {
                i10 |= 131072;
            }
            setImeOptions(268435456 | i12);
            if (getInputType() != i10) {
                setInputType(i10);
                setSelection(getText().length());
            }
            int i13 = nativeTextBoxInfo.xAlignment;
            int i14 = 0;
            int i15 = i13 != 0 ? i13 != 1 ? i13 != 2 ? 0 : 1 : 5 : 3;
            int i16 = nativeTextBoxInfo.yAlignment;
            if (i16 == 0) {
                i14 = 48;
            } else if (i16 == 1) {
                i14 = 16;
            } else if (i16 == 2) {
                i14 = 80;
            }
            setGravity(i15 | i14);
        }
    }

    /* renamed from: m */
    public void m12214m(int i10, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        if (C2808i.m12430e(this, getContext(), i10)) {
            f12 = C2808i.m12427b(i10, getContext());
        } else {
            if (i10 == 4) {
                C2808i.m12429d(this, getContext(), "SourceSansPro-Bold.ttf");
                f13 = 0.04f;
            } else if (i10 != 5) {
                C2808i.m12429d(this, getContext(), "SourceSansPro-Regular.ttf");
            } else {
                C2808i.m12429d(this, getContext(), "SourceSansPro-Light.ttf");
            }
            f12 = 0.795f;
        }
        setTextSize(0, f10 * f11 * f12);
        C1151k.m6707a("rbx.glview.text", "using letter spacing = " + f13);
        setLetterSpacing(f13);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        m12212k();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            m12211j(this.f10381o);
            this.f10381o = 0L;
            setVisibility(8);
            setText(BuildConfig.FLAVOR);
            C2817d1.m12471j(getContext(), this);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i10, int i11) {
        if (isInEditMode()) {
            return;
        }
        m12212k();
    }

    public void setCurrentTextBox(long j10) {
        this.f10381o = j10;
    }

    public void setManualFocusRelease(boolean z10) {
        this.f10382p = z10;
    }
}
