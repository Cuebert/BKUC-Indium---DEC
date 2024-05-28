.class Lf7/y$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/y$a;->f(Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

.field final synthetic o:Lf7/y$a;


# direct methods
.method constructor <init>(Lf7/y$a;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    iput-object p1, p0, Lf7/y$a$a;->o:Lf7/y$a;

    iput-object p2, p0, Lf7/y$a$a;->n:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lf7/y$a$a;->o:Lf7/y$a;

    iget-object v0, v0, Lf7/y$a;->r:Lf7/y;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf7/y$a$a;->n:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget v2, v2, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->x:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lf7/y$a$a;->n:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget v3, v3, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->y:F

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ") align: ("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lf7/y$a$a;->n:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget v3, v3, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->xAlignment:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf7/y$a$a;->n:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    iget v2, v2, Lcom/roblox/engine/jni/model/NativeTextBoxInfo;->yAlignment:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lf7/y;->k(Lf7/y;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lf7/y$a$a;->o:Lf7/y$a;

    iget-object v0, v0, Lf7/y$a;->r:Lf7/y;

    invoke-static {v0}, Lf7/y;->l(Lf7/y;)Lg9/b;

    move-result-object v1

    iget-object v2, p0, Lf7/y$a$a;->o:Lf7/y$a;

    iget-object v2, v2, Lf7/y$a;->r:Lf7/y;

    invoke-static {v2}, Lf7/y;->m(Lf7/y;)F

    move-result v2

    invoke-static {v0, v1, v2}, Lf7/y;->n(Lf7/y;Lg9/b;F)V

    .line 3
    iget-object v0, p0, Lf7/y$a$a;->o:Lf7/y$a;

    iget-object v0, v0, Lf7/y$a;->r:Lf7/y;

    iget-object v1, p0, Lf7/y$a$a;->n:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static {v0, v1}, Lf7/y;->o(Lf7/y;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    .line 4
    iget-object v0, p0, Lf7/y$a$a;->o:Lf7/y$a;

    iget-object v0, v0, Lf7/y$a;->r:Lf7/y;

    iget-object v1, p0, Lf7/y$a$a;->n:Lcom/roblox/engine/jni/model/NativeTextBoxInfo;

    invoke-static {v0, v1}, Lf7/y;->p(Lf7/y;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    .line 5
    iget-object v0, p0, Lf7/y$a$a;->o:Lf7/y$a;

    iget-object v0, v0, Lf7/y$a;->r:Lf7/y;

    invoke-static {v0}, Lf7/y;->q(Lf7/y;)Lcom/roblox/client/RbxKeyboard;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method
