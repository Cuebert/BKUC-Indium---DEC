.class Lcom/roblox/client/ActivityNativeMain$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/ActivityNativeMain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$f;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh7/j;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lh7/j;->b()I

    move-result p1

    const/16 v0, 0x191

    if-ne p1, v0, :cond_0

    const-string p1, "rbx.main"

    const-string v0, "sessionCheckHandler: Got 401 error code from the server. Logout now..."

    .line 2
    invoke-static {p1, v0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lx7/b;->e()Lx7/b;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$f;->a:Lcom/roblox/client/ActivityNativeMain;

    sget-object v1, Lx7/b$f;->p:Lx7/b$f;

    invoke-virtual {p1, v0, v1}, Lx7/b;->h(Landroid/app/Activity;Lx7/b$f;)V

    :cond_0
    return-void
.end method
