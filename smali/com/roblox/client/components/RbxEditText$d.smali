.class Lcom/roblox/client/components/RbxEditText$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/components/RbxEditText;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/components/RbxEditText;


# direct methods
.method constructor <init>(Lcom/roblox/client/components/RbxEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText$d;->n:Lcom/roblox/client/components/RbxEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText$d;->n:Lcom/roblox/client/components/RbxEditText;

    invoke-static {p1}, Lcom/roblox/client/components/RbxEditText;->b(Lcom/roblox/client/components/RbxEditText;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText$d;->n:Lcom/roblox/client/components/RbxEditText;

    iget-object v0, p1, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-static {p1}, Lcom/roblox/client/components/RbxEditText;->e(Lcom/roblox/client/components/RbxEditText;)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextSize(F)V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText$d;->n:Lcom/roblox/client/components/RbxEditText;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/roblox/client/components/RbxEditText;->D:Z

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText$d;->n:Lcom/roblox/client/components/RbxEditText;

    invoke-static {p1}, Lcom/roblox/client/components/RbxEditText;->b(Lcom/roblox/client/components/RbxEditText;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText$d;->n:Lcom/roblox/client/components/RbxEditText;

    iget-boolean p2, p1, Lcom/roblox/client/components/RbxEditText;->D:Z

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p1, Lcom/roblox/client/components/RbxEditText;->D:Z

    .line 3
    iget-object p2, p1, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p1, p3}, Lcom/roblox/client/components/RbxEditText;->d(Lcom/roblox/client/components/RbxEditText;Landroid/content/Context;)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setTextSize(F)V

    :cond_0
    return-void
.end method
