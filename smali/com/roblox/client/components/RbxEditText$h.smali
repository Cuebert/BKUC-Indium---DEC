.class Lcom/roblox/client/components/RbxEditText$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/RbxEditText$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/RbxEditText;
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

    iput-object p1, p0, Lcom/roblox/client/components/RbxEditText$h;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$h;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-static {v0}, Lcom/roblox/client/components/RbxEditText;->i(Lcom/roblox/client/components/RbxEditText;)Lcom/roblox/client/components/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$h;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-static {v0}, Lcom/roblox/client/components/RbxEditText;->i(Lcom/roblox/client/components/RbxEditText;)Lcom/roblox/client/components/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/client/components/d;->a()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$h;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-static {v0}, Lcom/roblox/client/components/RbxEditText;->j(Lcom/roblox/client/components/RbxEditText;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/roblox/client/components/RbxEditText$h;->a:Lcom/roblox/client/components/RbxEditText;

    invoke-static {v0}, Lcom/roblox/client/components/RbxEditText;->j(Lcom/roblox/client/components/RbxEditText;)Landroid/view/View$OnClickListener;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/components/RbxEditText$h;->a:Lcom/roblox/client/components/RbxEditText;

    iget-object v1, v1, Lcom/roblox/client/components/RbxEditText;->n:Landroid/widget/EditText;

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_1
    return-void
.end method
