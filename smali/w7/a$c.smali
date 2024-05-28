.class Lw7/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/components/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:J

.field final synthetic c:Lw7/a;


# direct methods
.method public constructor <init>(Lw7/a;Ljava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw7/a$c;->c:Lw7/a;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lw7/a$c;->a:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, Lw7/a$c;->b:J

    return-void
.end method


# virtual methods
.method public start()V
    .locals 5

    .line 1
    iget-object v0, p0, Lw7/a$c;->c:Lw7/a;

    invoke-static {v0}, Lw7/a;->f(Lw7/a;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lc9/l;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lw7/a$c;->c:Lw7/a;

    invoke-static {v0}, Lw7/a;->f(Lw7/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lf8/h;->f0(Landroid/content/Context;)Lf8/h;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-wide v1, p0, Lw7/a$c;->b:J

    iget-object v3, p0, Lw7/a$c;->a:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lf8/h;->a0(JLjava/lang/String;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lw7/a$c;->c:Lw7/a;

    const-string v1, "GrantPendingPurchases"

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/c;->d(Ljava/lang/String;)V

    return-void
.end method
