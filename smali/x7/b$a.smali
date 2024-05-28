.class Lx7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/b;->h(Landroid/app/Activity;Lx7/b$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/roblox/client/i0;

.field final synthetic c:Landroid/os/Bundle;

.field final synthetic d:Lx7/b;


# direct methods
.method constructor <init>(Lx7/b;Landroid/app/Activity;Lcom/roblox/client/i0;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lx7/b$a;->d:Lx7/b;

    iput-object p2, p0, Lx7/b$a;->a:Landroid/app/Activity;

    iput-object p3, p0, Lx7/b$a;->b:Lcom/roblox/client/i0;

    iput-object p4, p0, Lx7/b$a;->c:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "rbx.AppManager"

    const-string v1, "handleLogout: ... Logout API finished."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Ls7/h;

    invoke-direct {v0}, Ls7/h;-><init>()V

    iget-object v1, p0, Lx7/b$a;->a:Landroid/app/Activity;

    new-instance v2, Lx7/b$a$a;

    invoke-direct {v2, p0}, Lx7/b$a$a;-><init>(Lx7/b$a;)V

    invoke-virtual {v0, v1, v2}, Ls7/h;->a(Landroid/content/Context;Ls7/h$c;)V

    return-void
.end method
