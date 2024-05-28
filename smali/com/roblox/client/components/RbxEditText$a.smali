.class Lcom/roblox/client/components/RbxEditText$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/components/RbxEditText;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/components/RbxEditText;


# direct methods
.method constructor <init>(Lcom/roblox/client/components/RbxEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText$a;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$a;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-static {v0}, Lcom/roblox/client/components/RbxEditText;->a(Lcom/roblox/client/components/RbxEditText;)Lcom/roblox/client/components/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$a;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-static {v0}, Lcom/roblox/client/components/RbxEditText;->a(Lcom/roblox/client/components/RbxEditText;)Lcom/roblox/client/components/g;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/roblox/client/components/g;->a(Landroid/view/View;Z)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/components/RbxEditText$a;->a:Lcom/roblox/client/components/RbxEditText;

    iget-object p1, p1, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$a;->a:Lcom/roblox/client/components/RbxEditText;

    iget-boolean v1, v0, Lcom/roblox/client/components/RbxEditText;->q:Z

    if-eqz v1, :cond_2

    if-lez p1, :cond_2

    if-eqz p2, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->t()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0}, Lcom/roblox/client/components/RbxEditText;->o()V

    :cond_2
    :goto_0
    return-void
.end method
