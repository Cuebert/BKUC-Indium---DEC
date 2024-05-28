.class Lcom/roblox/client/signup/a$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/signup/a;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/roblox/client/signup/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/signup/a;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a$s;->b:Lcom/roblox/client/signup/a;

    iput-object p2, p0, Lcom/roblox/client/signup/a$s;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/roblox/client/signup/a$s;->b:Lcom/roblox/client/signup/a;

    const-string v0, "password"

    invoke-virtual {p1, v0, p2}, Lcom/roblox/client/signup/a;->D3(Ljava/lang/String;Z)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/signup/a$s;->b:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->L2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/a$a0;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/signup/a$a0;->n:Lcom/roblox/client/signup/a$a0;

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_0

    .line 3
    iget-object p1, p0, Lcom/roblox/client/signup/a$s;->b:Lcom/roblox/client/signup/a;

    iget-object p1, p1, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    iget-object p2, p0, Lcom/roblox/client/signup/a$s;->a:Landroid/content/Context;

    sget v0, Lcom/roblox/client/c0;->u0:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2, v0, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/roblox/client/components/RbxEditText;->y(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/signup/a$s;->b:Lcom/roblox/client/signup/a;

    iget-object p1, p1, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    invoke-virtual {p1}, Lcom/roblox/client/components/RbxEditText;->r()V

    :cond_1
    :goto_0
    return-void
.end method
