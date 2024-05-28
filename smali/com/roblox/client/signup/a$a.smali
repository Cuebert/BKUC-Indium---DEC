.class Lcom/roblox/client/signup/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/f;


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

    iput-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->e3(Lcom/roblox/client/signup/a;)Z

    move-result v0

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    const-string v1, "birthdayYear"

    invoke-virtual {p1, v1}, Lcom/roblox/client/signup/a;->E3(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    invoke-static {p1, p2}, Lcom/roblox/client/signup/a;->k3(Lcom/roblox/client/signup/a;I)I

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    invoke-static {p1, p2}, Lcom/roblox/client/signup/a;->i3(Lcom/roblox/client/signup/a;I)I

    .line 5
    iget-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    const-string p2, "birthdayMonth"

    invoke-virtual {p1, p2}, Lcom/roblox/client/signup/a;->E3(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    invoke-static {p1, p2}, Lcom/roblox/client/signup/a;->g3(Lcom/roblox/client/signup/a;I)I

    .line 7
    iget-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    const-string p2, "birthdayDay"

    invoke-virtual {p1, p2}, Lcom/roblox/client/signup/a;->E3(Ljava/lang/String;)V

    .line 8
    :goto_0
    iget-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    invoke-virtual {p1, v0}, Lcom/roblox/client/signup/a;->A3(Z)V

    .line 9
    iget-object p1, p0, Lcom/roblox/client/signup/a$a;->a:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->l3(Lcom/roblox/client/signup/a;)V

    return-void
.end method
