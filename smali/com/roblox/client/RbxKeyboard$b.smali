.class Lcom/roblox/client/RbxKeyboard$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/RbxKeyboard;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/RbxKeyboard;


# direct methods
.method constructor <init>(Lcom/roblox/client/RbxKeyboard;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p3

    invoke-interface {p3}, Lc7/e;->k1()Z

    move-result p3

    const-string v0, "rbx.glview.text"

    const/4 v1, 0x1

    if-eqz p3, :cond_1

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object p3, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-static {p3}, Lcom/roblox/client/RbxKeyboard;->c(Lcom/roblox/client/RbxKeyboard;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p3

    invoke-interface {p3}, Lc7/e;->I0()J

    move-result-wide v4

    cmp-long p3, v2, v4

    if-gez p3, :cond_1

    .line 5
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onEditorAction with actionId: "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " ignored since it\'s too close to focus event."

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object p2, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p2}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "input_method"

    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    if-eqz p2, :cond_0

    const/4 p3, 0x2

    .line 7
    invoke-virtual {p2, p1, p3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_0
    return v1

    .line 8
    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onEditorAction() text:"

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-object p3, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p3}, Lcom/roblox/client/RbxKeyboard;->k()V

    .line 10
    iget-object p3, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p3}, Lcom/roblox/client/RbxKeyboard;->getCurrentTextBox()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeReturnPressedFromOnScreenKeyboard(J)V

    .line 11
    iget-object p3, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p3}, Lcom/roblox/client/RbxKeyboard;->f()Z

    move-result p3

    if-eqz p3, :cond_2

    return v1

    .line 12
    :cond_2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p3

    invoke-interface {p3}, Lc7/e;->u1()Z

    move-result p3

    if-eqz p3, :cond_5

    .line 13
    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result p3

    if-eqz p3, :cond_4

    const/4 p3, 0x6

    if-eq p2, p3, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    .line 14
    :cond_4
    :goto_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 15
    iget-object p3, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p3}, Lcom/roblox/client/RbxKeyboard;->getCurrentTextBox()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    move-result p1

    invoke-static {v2, v3, p2, v1, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassText(JLjava/lang/String;ZI)V

    .line 16
    iget-object p1, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Lcom/roblox/client/RbxKeyboard;->d()V

    return v1

    .line 17
    :cond_5
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 18
    iget-object p3, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p3}, Lcom/roblox/client/RbxKeyboard;->getCurrentTextBox()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    move-result p1

    invoke-static {v2, v3, p2, v1, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassText(JLjava/lang/String;ZI)V

    .line 19
    iget-object p1, p0, Lcom/roblox/client/RbxKeyboard$b;->a:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Lcom/roblox/client/RbxKeyboard;->d()V

    return v1
.end method
