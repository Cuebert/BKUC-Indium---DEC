.class public Lf7/d0;
.super Lg7/a;
.source "SourceFile"


# instance fields
.field protected q:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;


# direct methods
.method public constructor <init>(Lcom/roblox/client/RbxKeyboard;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/a;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    return-void
.end method

.method private k(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lf7/d0;->l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p2, p1}, Lcom/roblox/client/RbxKeyboard;->l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    .line 3
    iget v0, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->font:I

    iget p1, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->fontSize:F

    invoke-virtual {p0}, Lg7/a;->g()F

    move-result v1

    invoke-virtual {p2, v0, p1, v1}, Lcom/roblox/client/RbxKeyboard;->m(IFF)V

    :cond_0
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 5
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->J()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p2}, Landroid/widget/EditText;->requestFocus()Z

    :cond_1
    return-void
.end method

.method private l(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    invoke-virtual {p0}, Lg7/a;->g()F

    move-result v1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 3
    iget v3, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    mul-float v3, v3, v1

    if-eqz p1, :cond_1

    .line 4
    iget v4, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    mul-float v4, v4, v1

    if-eqz p1, :cond_2

    .line 5
    iget v5, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->width:F

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    mul-float v5, v5, v1

    if-eqz p1, :cond_3

    .line 6
    iget v2, p1, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->height:F

    :cond_3
    mul-float v1, v1, v2

    float-to-int p1, v4

    .line 7
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    float-to-int p1, v5

    .line 8
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    float-to-int p1, v1

    .line 9
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    float-to-int p1, v3

    .line 10
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 11
    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "rbx.glview.text"

    const-string v1, "hideKeyboard()"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->d()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lf7/d0;->q:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    return-void
.end method

.method public b(JZLjava/lang/String;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showKeyboard() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.glview.text"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/RbxKeyboard;->setCurrentTextBox(J)V

    .line 3
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1, p4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_0

    .line 4
    iput-object p5, p0, Lf7/d0;->q:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    .line 5
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-direct {p0, p5, p1}, Lf7/d0;->k(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V

    .line 6
    :cond_0
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 8
    invoke-virtual {p0}, Lg7/a;->f()Landroid/content/Context;

    move-result-object p1

    const-string p2, "input_method"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz p1, :cond_1

    .line 9
    iget-object p2, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    const/4 p3, 0x2

    invoke-virtual {p1, p2, p3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 10
    :cond_1
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setSelection(I)V

    .line 11
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
    :cond_0
    iget-object v1, p0, Lf7/d0;->q:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 4
    :cond_1
    iput-object v0, p0, Lf7/d0;->q:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    .line 5
    iget-object v1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-direct {p0, v0, v1}, Lf7/d0;->k(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;Lcom/roblox/client/RbxKeyboard;)V

    return-void
.end method
