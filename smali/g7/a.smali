.class public abstract Lg7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/h0;


# instance fields
.field protected final n:Ljava/lang/String;

.field protected o:Lf9/e;

.field protected p:Lcom/roblox/client/RbxKeyboard;


# direct methods
.method public constructor <init>(Lcom/roblox/client/RbxKeyboard;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.glview.text"

    .line 2
    iput-object v0, p0, Lg7/a;->n:Ljava/lang/String;

    .line 3
    new-instance v0, Lf9/e;

    invoke-direct {v0}, Lf9/e;-><init>()V

    iput-object v0, p0, Lg7/a;->o:Lf9/e;

    .line 4
    iput-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    const/16 v0, 0x8

    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    const v0, 0x10000004

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 7
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 8
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object p1, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Lcom/roblox/client/RbxKeyboard;->e()V

    return-void
.end method


# virtual methods
.method protected f()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method protected g()F
    .locals 2

    iget-object v0, p0, Lg7/a;->o:Lf9/e;

    invoke-virtual {p0}, Lg7/a;->f()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf9/e;->b(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method protected h()J
    .locals 2

    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->getCurrentTextBox()J

    move-result-wide v0

    return-wide v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method

.method protected j()V
    .locals 1

    iget-object v0, p0, Lg7/a;->p:Lcom/roblox/client/RbxKeyboard;

    invoke-virtual {v0}, Lcom/roblox/client/RbxKeyboard;->k()V

    return-void
.end method
