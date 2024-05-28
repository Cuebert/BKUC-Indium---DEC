.class public Lcom/roblox/client/RbxKeyboard;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"


# instance fields
.field private final n:Ljava/lang/String;

.field private o:J

.field private p:Z

.field private q:J

.field private r:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, "rbx.glview.text"

    .line 2
    iput-object p1, p0, Lcom/roblox/client/RbxKeyboard;->n:Ljava/lang/String;

    const-wide/16 p1, 0x0

    .line 3
    iput-wide p1, p0, Lcom/roblox/client/RbxKeyboard;->q:J

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/roblox/client/RbxKeyboard;->r:Z

    return-void
.end method

.method public static synthetic a(Lcom/roblox/client/RbxKeyboard;Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/RbxKeyboard;->g(Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic b(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/client/RbxKeyboard;->h(Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lcom/roblox/client/RbxKeyboard;)J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->q:J

    return-wide v0
.end method

.method private synthetic g(Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/roblox/client/RbxKeyboard;->q:J

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/roblox/client/RbxKeyboard;->r:Z

    :cond_0
    return-void
.end method

.method private static synthetic h(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/16 p0, 0x43

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public d()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/RbxKeyboard;->setCurrentTextBox(J)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/roblox/client/d1;->j(Landroid/content/Context;Landroid/view/View;)V

    const/16 v0, 0x8

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setVisibility(I)V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->k1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/roblox/client/g0;

    invoke-direct {v0, p0}, Lcom/roblox/client/g0;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 3
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->J()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    sget-object v0, Lcom/roblox/client/h0;->n:Lcom/roblox/client/h0;

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 5
    :cond_1
    new-instance v0, Lcom/roblox/client/RbxKeyboard$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/RbxKeyboard$a;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 6
    new-instance v0, Lcom/roblox/client/RbxKeyboard$b;

    invoke-direct {v0, p0}, Lcom/roblox/client/RbxKeyboard$b;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/RbxKeyboard;->p:Z

    return v0
.end method

.method public getCurrentTextBox()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->o:J

    return-wide v0
.end method

.method public i()V
    .locals 6

    const-string v0, "rbx.glview.text"

    const-string v1, "onVrSessionForeground"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v1, p0, Lcom/roblox/client/RbxKeyboard;->r:Z

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/roblox/client/RbxKeyboard;->q:J

    sub-long/2addr v1, v3

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v3

    invoke-interface {v3}, Lc7/e;->I0()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    const-string v1, "Maquettes keyboard quick hide issue encountered."

    .line 5
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-static {p0}, Lcom/roblox/client/d1;->o(Landroid/view/View;)V

    return-void

    .line 7
    :cond_0
    iget-boolean v1, p0, Lcom/roblox/client/RbxKeyboard;->r:Z

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Maquettes keyboard release focus only hide triggered."

    .line 8
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->o:J

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReleaseFocus(J)V

    const-wide/16 v0, 0x0

    .line 10
    iput-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->o:J

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/roblox/client/RbxKeyboard;->r:Z

    :cond_1
    return-void
.end method

.method public j(J)V
    .locals 0

    invoke-static {p1, p2}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReleaseFocus(J)V

    return-void
.end method

.method public k()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v1

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncTextboxTextAndCursorPosition() text:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " pos:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rbx.glview.text"

    invoke-static {v3, v2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->syncTextboxTextAndCursorPosition2(Ljava/lang/String;I)V

    return-void
.end method

.method public l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 7

    if-eqz p1, :cond_c

    .line 1
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textColor:I

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setTextColor(I)V

    .line 2
    iget-boolean v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->manualFocusRelease:Z

    invoke-virtual {p0, v0}, Lcom/roblox/client/RbxKeyboard;->setManualFocusRelease(Z)V

    .line 3
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->textInputType:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const v0, 0x80001

    goto :goto_1

    :pswitch_1
    const v0, 0x80090

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x81

    goto :goto_1

    :pswitch_3
    const/4 v0, 0x3

    goto :goto_1

    :pswitch_4
    const/16 v0, 0x21

    goto :goto_1

    :pswitch_5
    const/4 v0, 0x2

    goto :goto_1

    :goto_0
    const/4 v0, 0x1

    .line 4
    :goto_1
    iget v4, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->returnKeyType:I

    const/4 v5, 0x5

    const/4 v6, 0x4

    if-eq v4, v3, :cond_3

    if-eq v4, v2, :cond_2

    if-eq v4, v1, :cond_1

    if-eq v4, v6, :cond_0

    goto :goto_2

    :cond_0
    const/4 v6, 0x3

    goto :goto_2

    :cond_1
    const/4 v6, 0x5

    goto :goto_2

    :cond_2
    const/4 v6, 0x2

    goto :goto_2

    :cond_3
    const/4 v6, 0x6

    .line 5
    :goto_2
    iget-boolean v4, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->multiline:Z

    if-eqz v4, :cond_4

    const/high16 v4, 0x20000

    or-int/2addr v0, v4

    :cond_4
    const/high16 v4, 0x10000000

    or-int/2addr v4, v6

    .line 6
    invoke-virtual {p0, v4}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 7
    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result v4

    if-eq v4, v0, :cond_5

    .line 8
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 10
    :cond_5
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    const/4 v4, 0x0

    if-eqz v0, :cond_8

    if-eq v0, v3, :cond_7

    if-eq v0, v2, :cond_6

    const/4 v1, 0x0

    goto :goto_3

    :cond_6
    const/4 v1, 0x1

    goto :goto_3

    :cond_7
    const/4 v1, 0x5

    .line 11
    :cond_8
    :goto_3
    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    if-eqz p1, :cond_b

    if-eq p1, v3, :cond_a

    if-eq p1, v2, :cond_9

    goto :goto_4

    :cond_9
    const/16 v4, 0x50

    goto :goto_4

    :cond_a
    const/16 v4, 0x10

    goto :goto_4

    :cond_b
    const/16 v4, 0x30

    :goto_4
    or-int p1, v1, v4

    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setGravity(I)V

    :cond_c
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method public m(IFF)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/roblox/client/components/i;->e(Landroid/widget/TextView;Landroid/content/Context;I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roblox/client/components/i;->b(ILandroid/content/Context;)F

    move-result p1

    goto :goto_1

    :cond_0
    const v0, 0x3f4b851f    # 0.795f

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "SourceSansPro-Regular.ttf"

    invoke-static {p0, p1, v2}, Lcom/roblox/client/components/i;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "SourceSansPro-Light.ttf"

    invoke-static {p0, p1, v2}, Lcom/roblox/client/components/i;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    const p1, 0x3f4b851f    # 0.795f

    goto :goto_1

    .line 5
    :cond_2
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "SourceSansPro-Bold.ttf"

    invoke-static {p0, p1, v1}, Lcom/roblox/client/components/i;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    const v1, 0x3d23d70a    # 0.04f

    goto :goto_0

    :goto_1
    mul-float p2, p2, p3

    mul-float p2, p2, p1

    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1, p2}, Landroid/widget/EditText;->setTextSize(IF)V

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "using letter spacing = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.glview.text"

    invoke-static {p2, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setLetterSpacing(F)V

    return-void
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/roblox/client/RbxKeyboard;->k()V

    .line 2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 3
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 4
    iget-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->o:J

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/RbxKeyboard;->j(J)V

    const-wide/16 v0, 0x0

    .line 5
    iput-wide v0, p0, Lcom/roblox/client/RbxKeyboard;->o:J

    const/16 p1, 0x8

    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setVisibility(I)V

    const-string p1, ""

    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/roblox/client/d1;->j(Landroid/content/Context;Landroid/view/View;)V

    .line 9
    :cond_0
    invoke-super {p0, p2}, Landroid/widget/EditText;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onSelectionChanged(II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/RbxKeyboard;->k()V

    return-void
.end method

.method public setCurrentTextBox(J)V
    .locals 0

    iput-wide p1, p0, Lcom/roblox/client/RbxKeyboard;->o:J

    return-void
.end method

.method public setManualFocusRelease(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/client/RbxKeyboard;->p:Z

    return-void
.end method
