.class public Lf7/y;
.super Lg7/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/content/ComponentCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/y$a;
    }
.end annotation


# instance fields
.field private final q:Z

.field private final r:I

.field private final s:I

.field private t:Lg9/b;

.field private u:Lf7/w;

.field private v:Lf7/n$f;

.field protected w:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

.field private x:Lf7/y$a;

.field private y:Landroid/os/Handler;

.field private z:J


# direct methods
.method public constructor <init>(Lcom/roblox/client/RbxKeyboard;Lf7/w;Lf7/n$f;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lg7/a;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lf7/y;->q:Z

    const/16 p1, 0xc

    .line 3
    iput p1, p0, Lf7/y;->r:I

    const/16 p1, 0xa

    .line 4
    iput p1, p0, Lf7/y;->s:I

    .line 5
    new-instance p1, Lf7/y$a;

    const-string v0, "rbx.glview.text"

    invoke-direct {p1, p0, v0}, Lf7/y$a;-><init>(Lf7/y;Ljava/lang/String;)V

    iput-object p1, p0, Lf7/y;->x:Lf7/y$a;

    .line 6
    iput-object p2, p0, Lf7/y;->u:Lf7/w;

    .line 7
    iput-object p3, p0, Lf7/y;->v:Lf7/n$f;

    .line 8
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lf7/y;->y:Landroid/os/Handler;

    return-void
.end method

.method private B(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lf7/y;->x:Lf7/y$a;

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->L0()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/roblox/client/components/b;->e(Ljava/lang/Object;J)V

    :cond_0
    return-void
.end method

.method private D(FFFF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    invoke-virtual {p0}, Lg7/a;->g()F

    move-result v1

    .line 3
    invoke-direct {p0, p1, v1}, Lf7/y;->u(FF)F

    move-result p1

    .line 4
    invoke-direct {p0, p2, v1}, Lf7/y;->u(FF)F

    move-result p2

    .line 5
    invoke-direct {p0, p3, v1}, Lf7/y;->u(FF)F

    move-result p3

    .line 6
    invoke-direct {p0, p4, v1}, Lf7/y;->u(FF)F

    move-result p4

    float-to-int p2, p2

    .line 7
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    float-to-int p2, p3

    .line 8
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    float-to-int p2, p4

    .line 9
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    float-to-int p1, p1

    .line 10
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 11
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private E(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 3

    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    iget v2, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    invoke-direct {p0, v0, v1, v2, p1}, Lf7/y;->D(FFFF)V

    return-void
.end method

.method private F(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0, p1}, Lcom/roblox/client/RbxKeyboard;->l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    .line 2
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    iget v1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    invoke-virtual {p0}, Lg7/a;->g()F

    move-result v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/roblox/client/RbxKeyboard;->m(IFF)V

    :cond_0
    return-void
.end method

.method static synthetic k(Lf7/y;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lf7/y;->t(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic l(Lf7/y;)Lg9/b;
    .locals 0

    iget-object p0, p0, Lf7/y;->t:Lg9/b;

    return-object p0
.end method

.method static synthetic m(Lf7/y;)F
    .locals 0

    invoke-virtual {p0}, Lg7/a;->g()F

    move-result p0

    return p0
.end method

.method static synthetic n(Lf7/y;Lg9/b;F)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf7/y;->x(Lg9/b;F)V

    return-void
.end method

.method static synthetic o(Lf7/y;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lf7/y;->F(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method static synthetic p(Lf7/y;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lf7/y;->E(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method static synthetic q(Lf7/y;)Lcom/roblox/client/RbxKeyboard;
    .locals 0

    iget-object p0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    return-object p0
.end method

.method static synthetic r(Lf7/y;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lf7/y;->y:Landroid/os/Handler;

    return-object p0
.end method

.method private t(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private u(FF)F
    .locals 0

    mul-float p1, p1, p2

    return p1
.end method

.method private w(Landroid/view/View;II)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 2
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v2, 0x1

    if-eq v1, p2, :cond_0

    .line 3
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 4
    :goto_0
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v1, p3, :cond_1

    .line 5
    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method

.method private x(Lg9/b;F)V
    .locals 7

    .line 1
    iget v0, p1, Lg9/b;->e:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_6

    .line 2
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeGetTextBoxInfo()Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 4
    iget v3, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v0, :cond_2

    .line 5
    iget v4, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    if-eqz v0, :cond_3

    .line 6
    iget v5, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    if-eqz v0, :cond_4

    .line 7
    iget v1, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    .line 8
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "("

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lf7/y;->t(Ljava/lang/String;)V

    add-float/2addr v5, v3

    .line 9
    invoke-direct {p0, v5, p2}, Lf7/y;->u(FF)F

    move-result v0

    .line 10
    iget v2, p1, Lg9/b;->b:I

    int-to-float v2, v2

    cmpl-float v2, v0, v2

    if-ltz v2, :cond_5

    add-float/2addr v3, v1

    .line 11
    iget p1, p1, Lg9/b;->f:I

    int-to-float p1, p1

    invoke-direct {p0, v3, p2}, Lf7/y;->u(FF)F

    move-result v0

    goto :goto_4

    .line 12
    :cond_5
    iget p1, p1, Lg9/b;->f:I

    int-to-float p1, p1

    :goto_4
    sub-float/2addr p1, v0

    const/high16 v0, 0x41400000    # 12.0f

    .line 13
    invoke-direct {p0, v0, p2}, Lf7/y;->u(FF)F

    move-result p2

    sub-float v0, p1, p2

    float-to-int v0, v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "margin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " delta:"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, " adjustment:"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lf7/y;->t(Ljava/lang/String;)V

    if-gez v0, :cond_6

    .line 15
    invoke-virtual {p0, v0}, Lf7/y;->s(I)V

    :cond_6
    return-void
.end method

.method private z(IF)F
    .locals 0

    int-to-float p1, p1

    div-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    return p1
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf7/y;->u:Lf7/w;

    invoke-virtual {v0}, Lf7/w;->l()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, -0x1

    .line 2
    invoke-direct {p0, v0, v1, v1}, Lf7/y;->w(Landroid/view/View;II)V

    return-void
.end method

.method public C(J)V
    .locals 0

    iput-wide p1, p0, Lf7/y;->z:J

    return-void
.end method

.method public a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg7/a;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReleaseFocus(J)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lf7/y;->s(I)V

    .line 3
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->d()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lf7/y;->w:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    return-void
.end method

.method public b(JZLjava/lang/String;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 1

    .line 1
    iput-object p5, p0, Lf7/y;->w:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    .line 2
    invoke-virtual {p0}, Lf7/y;->v()V

    .line 3
    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "showKeyboard() "

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    const-string v0, "rbx.glview.text"

    invoke-static {v0, p5}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p5, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p5, p1, p2}, Lcom/roblox/client/RbxKeyboard;->setCurrentTextBox(J)V

    .line 5
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1, p4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_1

    .line 6
    iget-object p1, p0, Lf7/y;->w:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    const/high16 p2, -0x3cea0000    # -150.0f

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    .line 7
    iget p5, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    invoke-direct {p0, p3, p2, p5, p1}, Lf7/y;->D(FFFF)V

    goto :goto_0

    :cond_0
    const/high16 p1, -0x40800000    # -1.0f

    const/high16 p5, 0x41200000    # 10.0f

    .line 8
    invoke-direct {p0, p3, p2, p1, p5}, Lf7/y;->D(FFFF)V

    .line 9
    :goto_0
    iget-object p1, p0, Lf7/y;->w:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-direct {p0, p1}, Lf7/y;->B(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    .line 10
    :cond_1
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 12
    invoke-virtual {p0}, Lg7/a;->f()Landroid/content/Context;

    move-result-object p1

    const-string p2, "input_method"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz p1, :cond_2

    .line 13
    iget-object p2, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    const/4 p3, 0x2

    invoke-virtual {p1, p2, p3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 14
    :cond_2
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setSelection(I)V

    .line 15
    invoke-virtual {p0}, Lg7/a;->j()V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg7/a;->i(Ljava/lang/String;)V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->i()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeGetTextBoxInfo()Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onLuaTextBoxPropertyChanged() x:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " y:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " width:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " height:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " fontSize:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.glview.text"

    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-direct {p0, v0}, Lf7/y;->B(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    .line 4
    :cond_0
    iput-object v0, p0, Lf7/y;->w:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    const-string p1, "rbx.glview.text"

    const-string v0, "Configuration change detected"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lf7/y;->A()V

    .line 3
    invoke-virtual {p0}, Lf7/y;->a()V

    return-void
.end method

.method public onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf7/y;->v:Lf7/n$f;

    invoke-virtual {v0}, Lf7/n$f;->a()Lg9/b;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lf7/y;->t:Lg9/b;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lg9/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 3
    :cond_1
    iput-object v0, p0, Lf7/y;->t:Lg9/b;

    .line 4
    invoke-virtual {p0}, Lg7/a;->g()F

    move-result v1

    .line 5
    invoke-direct {p0, v0, v1}, Lf7/y;->x(Lg9/b;F)V

    .line 6
    invoke-virtual {p0, v0, v1}, Lf7/y;->y(Lg9/b;F)V

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method

.method public s(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf7/y;->u:Lf7/w;

    invoke-virtual {v0}, Lf7/w;->l()Landroid/widget/FrameLayout;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 3
    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    if-eq v2, p1, :cond_0

    .line 4
    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public v()V
    .locals 5

    .line 1
    iget-object v0, p0, Lf7/y;->u:Lf7/w;

    invoke-virtual {v0}, Lf7/w;->l()Landroid/widget/FrameLayout;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    .line 3
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    .line 4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Lock screen: ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lf7/y;->t(Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, v0, v1, v2}, Lf7/y;->w(Landroid/view/View;II)V

    return-void
.end method

.method protected y(Lg9/b;F)V
    .locals 8

    .line 1
    iget v0, p1, Lg9/b;->e:I

    const/4 v1, 0x1

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v4, p1, Lg9/b;->f:I

    invoke-direct {p0, v4, p2}, Lf7/y;->z(IF)F

    move-result v4

    float-to-int v4, v4

    .line 3
    iget-object v5, p1, Lg9/b;->a:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    invoke-direct {p0, v5, p2}, Lf7/y;->z(IF)F

    move-result v5

    float-to-int v5, v5

    .line 4
    iget v6, p1, Lg9/b;->e:I

    invoke-direct {p0, v6, p2}, Lf7/y;->z(IF)F

    move-result p2

    float-to-int p2, p2

    .line 5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "onUpdateKeyboardSize() v:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " x:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " y:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " w:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " h:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v6, "rbx.glview.text"

    invoke-static {v6, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget p1, p1, Lg9/b;->e:I

    if-le p1, v2, :cond_1

    .line 7
    invoke-static {v1, v3, v4, v5, p2}, Lcom/roblox/engine/jni/NativeGLInterface;->updateKeyboardSize(ZIIII)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-static {v3, v3, v4, v5, v3}, Lcom/roblox/engine/jni/NativeGLInterface;->updateKeyboardSize(ZIIII)V

    :goto_1
    return-void
.end method
