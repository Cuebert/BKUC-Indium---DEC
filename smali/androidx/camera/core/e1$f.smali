.class public final Landroidx/camera/core/e1$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/o2$a<",
        "Landroidx/camera/core/e1;",
        "Lw/a1;",
        "Landroidx/camera/core/e1$f;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lw/q1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lw/q1;->L()Lw/q1;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/camera/core/e1$f;-><init>(Lw/q1;)V

    return-void
.end method

.method private constructor <init>(Lw/q1;)V
    .locals 3

    .line 2
    const-class v0, Landroidx/camera/core/e1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/camera/core/e1$f;->a:Lw/q1;

    .line 4
    sget-object v1, Lz/i;->w:Lw/o0$a;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {p1, v1, v2}, Lw/u1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/camera/core/e1$f;->h(Ljava/lang/Class;)Landroidx/camera/core/e1$f;

    return-void
.end method

.method public static d(Lw/o0;)Landroidx/camera/core/e1$f;
    .locals 1

    new-instance v0, Landroidx/camera/core/e1$f;

    invoke-static {p0}, Lw/q1;->M(Lw/o0;)Lw/q1;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/core/e1$f;-><init>(Lw/q1;)V

    return-object v0
.end method


# virtual methods
.method public a()Lw/p1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/e1$f;->a:Lw/q1;

    return-object v0
.end method

.method public bridge synthetic b()Lw/o2;
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->e()Lw/a1;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroidx/camera/core/e1;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lw/f1;->g:Lw/o0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lw/f1;->j:Lw/o0$a;

    invoke-interface {v0, v1, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot use both setTargetResolution and setTargetAspectRatio on the same config."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lw/a1;->E:Lw/o0$a;

    invoke-interface {v0, v1, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v4

    sget-object v5, Lw/a1;->D:Lw/o0$a;

    invoke-interface {v4, v5, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    const-string v5, "Cannot set buffer format with CaptureProcessor defined."

    .line 6
    invoke-static {v4, v5}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v4

    sget-object v5, Lw/d1;->f:Lw/o0$a;

    invoke-interface {v4, v5, v0}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_2

    .line 8
    :cond_3
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v4, Lw/a1;->D:Lw/o0$a;

    invoke-interface {v0, v4, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v4, Lw/d1;->f:Lw/o0$a;

    const/16 v5, 0x23

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_2

    .line 10
    :cond_4
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v4, Lw/d1;->f:Lw/o0$a;

    const/16 v5, 0x100

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 11
    :goto_2
    new-instance v0, Landroidx/camera/core/e1;

    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->e()Lw/a1;

    move-result-object v4

    invoke-direct {v0, v4}, Landroidx/camera/core/e1;-><init>(Lw/a1;)V

    .line 12
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v4

    sget-object v5, Lw/f1;->j:Lw/o0$a;

    invoke-interface {v4, v5, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Size;

    if-eqz v2, :cond_5

    .line 13
    new-instance v4, Landroid/util/Rational;

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v5

    .line 14
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-direct {v4, v5, v2}, Landroid/util/Rational;-><init>(II)V

    .line 15
    invoke-virtual {v0, v4}, Landroidx/camera/core/e1;->p0(Landroid/util/Rational;)V

    .line 16
    :cond_5
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v2

    sget-object v4, Lw/a1;->F:Lw/o0$a;

    const/4 v5, 0x2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v4, v6}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v2, v3, :cond_6

    const/4 v1, 0x1

    :cond_6
    const-string v2, "Maximum outstanding image count must be at least 1"

    .line 17
    invoke-static {v1, v2}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    .line 18
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v1

    sget-object v2, Lz/g;->u:Lw/o0$a;

    .line 19
    invoke-static {}, Lx/a;->c()Ljava/util/concurrent/Executor;

    move-result-object v4

    .line 20
    invoke-interface {v1, v2, v4}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    const-string v2, "The IO executor can\'t be null"

    invoke-static {v1, v2}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v1

    sget-object v2, Lw/a1;->B:Lw/o0$a;

    invoke-interface {v1, v2}, Lw/o0;->e(Lw/o0$a;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 22
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v1

    invoke-interface {v1, v2}, Lw/o0;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_8

    if-eq v1, v3, :cond_8

    if-ne v1, v5, :cond_7

    goto :goto_3

    .line 23
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The flash mode is not allowed to set: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_3
    return-object v0
.end method

.method public e()Lw/a1;
    .locals 2

    new-instance v0, Lw/a1;

    iget-object v1, p0, Landroidx/camera/core/e1$f;->a:Lw/q1;

    invoke-static {v1}, Lw/u1;->J(Lw/o0;)Lw/u1;

    move-result-object v1

    invoke-direct {v0, v1}, Lw/a1;-><init>(Lw/u1;)V

    return-object v0
.end method

.method public f(I)Landroidx/camera/core/e1$f;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lw/o2;->r:Lw/o0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public g(I)Landroidx/camera/core/e1$f;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lw/f1;->g:Lw/o0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public h(Ljava/lang/Class;)Landroidx/camera/core/e1$f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Landroidx/camera/core/e1;",
            ">;)",
            "Landroidx/camera/core/e1$f;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lz/i;->w:Lw/o0$a;

    invoke-interface {v0, v1, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lz/i;->v:Lw/o0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Landroidx/camera/core/e1$f;->i(Ljava/lang/String;)Landroidx/camera/core/e1$f;

    :cond_0
    return-object p0
.end method

.method public i(Ljava/lang/String;)Landroidx/camera/core/e1$f;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/e1$f;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lz/i;->v:Lw/o0$a;

    invoke-interface {v0, v1, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    return-object p0
.end method
