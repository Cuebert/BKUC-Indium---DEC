.class Lw8/k$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/g$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/k;->I(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/k;


# direct methods
.method constructor <init>(Lw8/k;)V
    .locals 0

    iput-object p1, p0, Lw8/k$d;->a:Lw8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "InitHelper"

    const-string v1, "onDidLoginEventFromLua: ... onPostLoginCompleted."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object v0

    invoke-virtual {v0}, Ln6/d;->h()V

    .line 3
    invoke-static {}, Ln6/d;->b()Ln6/d;

    move-result-object v0

    invoke-virtual {v0}, Ln6/d;->d()V

    .line 4
    iget-object v0, p0, Lw8/k$d;->a:Lw8/k;

    invoke-static {v0}, Lw8/k;->e(Lw8/k;)Lw8/l;

    move-result-object v0

    invoke-interface {v0}, Lw8/l;->S()V

    .line 5
    iget-object v0, p0, Lw8/k$d;->a:Lw8/k;

    invoke-static {v0}, Lw8/k;->f(Lw8/k;)V

    return-void
.end method
