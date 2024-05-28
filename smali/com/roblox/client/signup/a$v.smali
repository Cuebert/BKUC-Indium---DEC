.class Lcom/roblox/client/signup/a$v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/RbxGenderPicker$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/signup/a;->D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/signup/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/signup/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/signup/a$v;->a:Lcom/roblox/client/signup/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/components/RbxButton;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/signup/a$v;->a:Lcom/roblox/client/signup/a;

    const-string v0, "gender"

    invoke-virtual {p1, v0}, Lcom/roblox/client/signup/a;->E3(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/signup/a$v;->a:Lcom/roblox/client/signup/a;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/signup/a$v;->a:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->A2(Lcom/roblox/client/signup/a;)Landroid/view/View;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roblox/client/d1;->j(Landroid/content/Context;Landroid/view/View;)V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/signup/a$v;->a:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->X2(Lcom/roblox/client/signup/a;)V

    return-void
.end method
