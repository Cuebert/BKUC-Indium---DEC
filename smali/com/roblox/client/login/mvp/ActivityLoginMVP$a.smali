.class Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/login/mvp/ActivityLoginMVP;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/login/mvp/ActivityLoginMVP;


# direct methods
.method constructor <init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;->n:Lcom/roblox/client/login/mvp/ActivityLoginMVP;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    new-instance p1, Lcom/roblox/client/t0;

    invoke-direct {p1}, Lcom/roblox/client/t0;-><init>()V

    .line 2
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "USING_LOGIN_WEB_URL"

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 4
    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 5
    new-instance p2, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a$a;

    invoke-direct {p2, p0}, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a$a;-><init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;)V

    invoke-virtual {p1, p2}, Lcom/roblox/client/t0;->d3(Lcom/roblox/client/t0$f;)V

    .line 6
    invoke-static {}, Lcom/roblox/client/p0;->o0()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 7
    sget p2, Lcom/roblox/client/d0;->b:I

    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/c;->m2(II)V

    goto :goto_0

    .line 8
    :cond_0
    sget p2, Lcom/roblox/client/d0;->d:I

    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/c;->m2(II)V

    .line 9
    :goto_0
    invoke-static {}, Lcom/roblox/client/p0;->A0()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/roblox/client/t0;->X2(Ljava/lang/String;)V

    .line 10
    iget-object p2, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;->n:Lcom/roblox/client/login/mvp/ActivityLoginMVP;

    invoke-virtual {p2}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    const-string v0, "password_reset_requested"

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/c;->o2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
