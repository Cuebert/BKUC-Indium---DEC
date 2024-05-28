.class public Lc0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    const-class v0, Lb0/c;

    .line 2
    invoke-static {v0}, Lb0/a;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v0

    check-cast v0, Lb0/c;

    if-eqz v0, :cond_0

    .line 3
    sget-object v1, Lw/k0;->h:Lw/o0$a;

    invoke-virtual {v0, v1}, Lb0/c;->c(Lw/o0$a;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public b(Landroidx/camera/core/l1;)Z
    .locals 2

    .line 1
    const-class v0, Lb0/c;

    .line 2
    invoke-static {v0}, Lb0/a;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v0

    check-cast v0, Lb0/c;

    if-eqz v0, :cond_0

    .line 3
    sget-object v1, Lw/k0;->h:Lw/o0$a;

    invoke-virtual {v0, v1}, Lb0/c;->c(Lw/o0$a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    :cond_0
    invoke-interface {p1}, Landroidx/camera/core/l1;->h0()I

    move-result p1

    const/16 v0, 0x100

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
