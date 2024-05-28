.class Lx7/g$c;
.super Lh7/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/g;->a(Ly7/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly7/c$b;

.field final synthetic b:Lx7/g;


# direct methods
.method constructor <init>(Lx7/g;Ly7/c$b;)V
    .locals 0

    iput-object p1, p0, Lx7/g$c;->b:Lx7/g;

    iput-object p2, p0, Lx7/g$c;->a:Ly7/c$b;

    invoke-direct {p0}, Lh7/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lh7/j;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Logout: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.login"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p1}, Lh7/j;->b()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lh7/j;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lh7/j;->b()I

    move-result p1

    const/4 v1, -0x1

    const-string v2, "logout"

    invoke-static {v2, v0, p1, v1}, Lcom/roblox/client/f0;->f(Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    invoke-static {}, Lo9/i;->e()Lo9/i;

    move-result-object p1

    invoke-static {}, Lcom/roblox/client/p0;->K()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo9/i;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lx7/g$c;->a:Ly7/c$b;

    if-eqz p1, :cond_1

    .line 6
    invoke-interface {p1}, Ly7/c$b;->a()V

    :cond_1
    return-void
.end method
