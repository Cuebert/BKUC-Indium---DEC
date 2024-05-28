.class Landroidx/camera/camera2/internal/c2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/o2<",
        "Landroidx/camera/core/y2;",
        ">;"
    }
.end annotation


# instance fields
.field private final z:Lw/o0;


# direct methods
.method constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lw/q1;->L()Lw/q1;

    move-result-object v0

    .line 3
    sget-object v1, Lw/o2;->p:Lw/o0$a;

    new-instance v2, Landroidx/camera/camera2/internal/c1;

    invoke-direct {v2}, Landroidx/camera/camera2/internal/c1;-><init>()V

    invoke-virtual {v0, v1, v2}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 4
    iput-object v0, p0, Landroidx/camera/camera2/internal/c2$b;->z:Lw/o0;

    return-void
.end method


# virtual methods
.method public synthetic B(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lz/h;->a(Lz/i;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic D(Landroidx/camera/core/y2$b;)Landroidx/camera/core/y2$b;
    .locals 0

    invoke-static {p0, p1}, Lz/l;->a(Lz/m;Landroidx/camera/core/y2$b;)Landroidx/camera/core/y2$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->g(Lw/a2;Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lw/o0$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->f(Lw/a2;Lw/o0$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, Lw/z1;->e(Lw/a2;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Lw/o0$a;)Lw/o0$c;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->c(Lw/a2;Lw/o0$a;)Lw/o0$c;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Lw/o0$a;)Z
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->a(Lw/a2;Lw/o0$a;)Z

    move-result p1

    return p1
.end method

.method public synthetic i(Lw/k0;)Lw/k0;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->c(Lw/o2;Lw/k0;)Lw/k0;

    move-result-object p1

    return-object p1
.end method

.method public synthetic j(Lw/k0$b;)Lw/k0$b;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->b(Lw/o2;Lw/k0$b;)Lw/k0$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic m(I)I
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->f(Lw/o2;I)I

    move-result p1

    return p1
.end method

.method public o()Lw/o0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/c2$b;->z:Lw/o0;

    return-object v0
.end method

.method public synthetic q()I
    .locals 1

    invoke-static {p0}, Lw/c1;->a(Lw/d1;)I

    move-result v0

    return v0
.end method

.method public synthetic r(Lw/c2$d;)Lw/c2$d;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->e(Lw/o2;Lw/c2$d;)Lw/c2$d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic t(Lw/o0$a;Lw/o0$c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->h(Lw/a2;Lw/o0$a;Lw/o0$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic v(Ljava/lang/String;Lw/o0$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->b(Lw/a2;Ljava/lang/String;Lw/o0$b;)V

    return-void
.end method

.method public synthetic w(Lw/c2;)Lw/c2;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->d(Lw/o2;Lw/c2;)Lw/c2;

    move-result-object p1

    return-object p1
.end method

.method public synthetic x(Lw/o0$a;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->d(Lw/a2;Lw/o0$a;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public synthetic y(Landroidx/camera/core/s;)Landroidx/camera/core/s;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->a(Lw/o2;Landroidx/camera/core/s;)Landroidx/camera/core/s;

    move-result-object p1

    return-object p1
.end method
