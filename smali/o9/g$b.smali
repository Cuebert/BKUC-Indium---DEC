.class Lo9/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo9/g;->k(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Lo9/g;


# direct methods
.method constructor <init>(Lo9/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lo9/g$b;->o:Lo9/g;

    iput-object p2, p0, Lo9/g$b;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "rbx.platform"

    const-string v1, "Verifying cookies."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lo9/g$b;->o:Lo9/g;

    invoke-static {}, Lo9/i;->e()Lo9/i;

    move-result-object v2

    iget-object v3, p0, Lo9/g$b;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lo9/i;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo9/g;->b(Lo9/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v2, p0, Lo9/g$b;->o:Lo9/g;

    invoke-static {v2}, Lo9/g;->c(Lo9/g;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "WebViewCookieHandler.verifyCookies(): Cookie changed, notifying observers."

    .line 4
    invoke-static {v0, v2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object v0, p0, Lo9/g$b;->o:Lo9/g;

    invoke-static {v0, v1}, Lo9/g;->d(Lo9/g;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lo9/g$b;->o:Lo9/g;

    invoke-static {v0}, Lo9/g;->f(Lo9/g;)Ln9/c;

    move-result-object v0

    invoke-interface {v0}, Ln9/c;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lo9/g$b;->o:Lo9/g;

    invoke-static {v1}, Lo9/g;->e(Lo9/g;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
