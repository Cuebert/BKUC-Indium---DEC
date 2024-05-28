.class public final Lw/c2$f;
.super Lw/c2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field private static final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final h:Lc0/c;

.field private i:Z

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x1

    .line 1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x3

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lw/c2$f;->k:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lw/c2$a;-><init>()V

    .line 2
    new-instance v0, Lc0/c;

    invoke-direct {v0}, Lc0/c;-><init>()V

    iput-object v0, p0, Lw/c2$f;->h:Lc0/c;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lw/c2$f;->i:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lw/c2$f;->j:Z

    return-void
.end method

.method private e(II)I
    .locals 3

    .line 1
    sget-object v0, Lw/c2$f;->k:Ljava/util/List;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-lt v1, v0, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    return p1
.end method


# virtual methods
.method public a(Lw/c2;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lw/c2;->g()Lw/k0;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lw/k0;->g()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lw/c2$f;->j:Z

    .line 4
    iget-object v1, p0, Lw/c2$a;->b:Lw/k0$a;

    .line 5
    invoke-virtual {v0}, Lw/k0;->g()I

    move-result v2

    iget-object v3, p0, Lw/c2$a;->b:Lw/k0$a;

    .line 6
    invoke-virtual {v3}, Lw/k0$a;->m()I

    move-result v3

    .line 7
    invoke-direct {p0, v2, v3}, Lw/c2$f;->e(II)I

    move-result v2

    .line 8
    invoke-virtual {v1, v2}, Lw/k0$a;->p(I)V

    .line 9
    :cond_0
    invoke-virtual {p1}, Lw/c2;->g()Lw/k0;

    move-result-object v1

    invoke-virtual {v1}, Lw/k0;->f()Lw/j2;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v2, v1}, Lw/k0$a;->b(Lw/j2;)V

    .line 11
    iget-object v1, p0, Lw/c2$a;->c:Ljava/util/List;

    invoke-virtual {p1}, Lw/c2;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12
    iget-object v1, p0, Lw/c2$a;->d:Ljava/util/List;

    invoke-virtual {p1}, Lw/c2;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 13
    iget-object v1, p0, Lw/c2$a;->b:Lw/k0$a;

    .line 14
    invoke-virtual {p1}, Lw/c2;->f()Ljava/util/List;

    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Lw/k0$a;->a(Ljava/util/Collection;)V

    .line 16
    iget-object v1, p0, Lw/c2$a;->f:Ljava/util/List;

    invoke-virtual {p1}, Lw/c2;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17
    iget-object v1, p0, Lw/c2$a;->e:Ljava/util/List;

    invoke-virtual {p1}, Lw/c2;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18
    invoke-virtual {p1}, Lw/c2;->e()Landroid/hardware/camera2/params/InputConfiguration;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 19
    invoke-virtual {p1}, Lw/c2;->e()Landroid/hardware/camera2/params/InputConfiguration;

    move-result-object v1

    iput-object v1, p0, Lw/c2$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 20
    :cond_1
    iget-object v1, p0, Lw/c2$a;->a:Ljava/util/Set;

    invoke-virtual {p1}, Lw/c2;->j()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 21
    iget-object p1, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {p1}, Lw/k0$a;->l()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0}, Lw/k0;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 22
    iget-object p1, p0, Lw/c2$a;->a:Ljava/util/Set;

    iget-object v1, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v1}, Lw/k0$a;->l()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "ValidatingBuilder"

    const-string v1, "Invalid configuration due to capture request surfaces are not a subset of surfaces"

    .line 23
    invoke-static {p1, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lw/c2$f;->i:Z

    .line 25
    :cond_2
    iget-object p1, p0, Lw/c2$a;->b:Lw/k0$a;

    .line 26
    invoke-virtual {v0}, Lw/k0;->d()Lw/o0;

    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Lw/k0$a;->e(Lw/o0;)V

    return-void
.end method

.method public b()Lw/c2;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lw/c2$f;->i:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lw/c2$a;->a:Ljava/util/Set;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 3
    iget-object v0, p0, Lw/c2$f;->h:Lc0/c;

    invoke-virtual {v0, v2}, Lc0/c;->d(Ljava/util/List;)V

    .line 4
    new-instance v0, Lw/c2;

    iget-object v3, p0, Lw/c2$a;->c:Ljava/util/List;

    iget-object v4, p0, Lw/c2$a;->d:Ljava/util/List;

    iget-object v5, p0, Lw/c2$a;->f:Ljava/util/List;

    iget-object v6, p0, Lw/c2$a;->e:Ljava/util/List;

    iget-object v1, p0, Lw/c2$a;->b:Lw/k0$a;

    .line 5
    invoke-virtual {v1}, Lw/k0$a;->h()Lw/k0;

    move-result-object v7

    iget-object v8, p0, Lw/c2$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lw/c2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lw/k0;Landroid/hardware/camera2/params/InputConfiguration;)V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported session configuration combination"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/c2$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 2
    iget-object v0, p0, Lw/c2$a;->b:Lw/k0$a;

    invoke-virtual {v0}, Lw/k0$a;->i()V

    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lw/c2$f;->j:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lw/c2$f;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
