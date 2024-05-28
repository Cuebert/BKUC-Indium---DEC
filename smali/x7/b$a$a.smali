.class Lx7/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls7/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/b$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/b$a;


# direct methods
.method constructor <init>(Lx7/b$a;)V
    .locals 0

    iput-object p1, p0, Lx7/b$a$a;->a:Lx7/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    const-string p1, "rbx.AppManager"

    const-string v0, "handleLogout: ... Get-Locale API finished."

    .line 1
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lx7/b$a$a;->a:Lx7/b$a;

    iget-object p1, p1, Lx7/b$a;->b:Lcom/roblox/client/i0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lx7/b$a$a;->a:Lx7/b$a;

    iget-object p1, p1, Lx7/b$a;->b:Lcom/roblox/client/i0;

    invoke-virtual {p1}, Lcom/roblox/client/i0;->m1()V

    .line 4
    :cond_0
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object p1

    const/4 v0, 0x2

    iget-object v1, p0, Lx7/b$a$a;->a:Lx7/b$a;

    iget-object v1, v1, Lx7/b$a;->c:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Lx7/d;->f(ILandroid/os/Bundle;)V

    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lx7/b;->a(Z)Z

    return-void
.end method
