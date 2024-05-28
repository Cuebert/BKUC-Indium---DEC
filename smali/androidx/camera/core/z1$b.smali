.class public final Landroidx/camera/core/z1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/o2$a<",
        "Landroidx/camera/core/z1;",
        "Lw/w1;",
        "Landroidx/camera/core/z1$b;",
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

    invoke-direct {p0, v0}, Landroidx/camera/core/z1$b;-><init>(Lw/q1;)V

    return-void
.end method

.method private constructor <init>(Lw/q1;)V
    .locals 3

    .line 2
    const-class v0, Landroidx/camera/core/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/camera/core/z1$b;->a:Lw/q1;

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
    invoke-virtual {p0, v0}, Landroidx/camera/core/z1$b;->h(Ljava/lang/Class;)Landroidx/camera/core/z1$b;

    return-void
.end method

.method static d(Lw/o0;)Landroidx/camera/core/z1$b;
    .locals 1

    new-instance v0, Landroidx/camera/core/z1$b;

    invoke-static {p0}, Lw/q1;->M(Lw/o0;)Lw/q1;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/core/z1$b;-><init>(Lw/q1;)V

    return-object v0
.end method


# virtual methods
.method public a()Lw/p1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/z1$b;->a:Lw/q1;

    return-object v0
.end method

.method public bridge synthetic b()Lw/o2;
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->e()Lw/w1;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroidx/camera/core/z1;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lw/f1;->g:Lw/o0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lw/o0;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->a()Lw/p1;

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
    new-instance v0, Landroidx/camera/core/z1;

    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->e()Lw/w1;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/z1;-><init>(Lw/w1;)V

    return-object v0
.end method

.method public e()Lw/w1;
    .locals 2

    new-instance v0, Lw/w1;

    iget-object v1, p0, Landroidx/camera/core/z1$b;->a:Lw/q1;

    invoke-static {v1}, Lw/u1;->J(Lw/o0;)Lw/u1;

    move-result-object v1

    invoke-direct {v0, v1}, Lw/w1;-><init>(Lw/u1;)V

    return-object v0
.end method

.method public f(I)Landroidx/camera/core/z1$b;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lw/o2;->r:Lw/o0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public g(I)Landroidx/camera/core/z1$b;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lw/f1;->g:Lw/o0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public h(Ljava/lang/Class;)Landroidx/camera/core/z1$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Landroidx/camera/core/z1;",
            ">;)",
            "Landroidx/camera/core/z1$b;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lz/i;->w:Lw/o0$a;

    invoke-interface {v0, v1, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->a()Lw/p1;

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
    invoke-virtual {p0, p1}, Landroidx/camera/core/z1$b;->i(Ljava/lang/String;)Landroidx/camera/core/z1$b;

    :cond_0
    return-object p0
.end method

.method public i(Ljava/lang/String;)Landroidx/camera/core/z1$b;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/z1$b;->a()Lw/p1;

    move-result-object v0

    sget-object v1, Lz/i;->v:Lw/o0$a;

    invoke-interface {v0, v1, p1}, Lw/p1;->g(Lw/o0$a;Ljava/lang/Object;)V

    return-object p0
.end method
