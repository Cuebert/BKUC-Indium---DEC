.class Lcom/roblox/client/signup/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/signup/a;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/signup/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/signup/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a$b;->n:Lcom/roblox/client/signup/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a$b;->n:Lcom/roblox/client/signup/a;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/roblox/client/d1;->j(Landroid/content/Context;Landroid/view/View;)V

    const-string p1, "signup"

    const-string v0, "login"

    .line 2
    invoke-static {p1, v0}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/signup/a$b;->n:Lcom/roblox/client/signup/a;

    iget-object p1, p1, Lcom/roblox/client/signup/a;->u1:Lcom/roblox/client/signup/a$x;

    invoke-interface {p1}, Lcom/roblox/client/signup/a$x;->r()V

    return-void
.end method
