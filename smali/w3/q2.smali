.class public final Lw3/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/c8;

.field private final b:Ljava/lang/Boolean;

.field private final c:Ljava/lang/Boolean;

.field private final d:Lw3/s7;

.field private final e:Lw3/ca;

.field private final f:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/p8;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/q8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method synthetic constructor <init>(Lw3/p2;Lw3/n2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/p2;->i(Lw3/p2;)Lw3/c8;

    move-result-object p2

    iput-object p2, p0, Lw3/q2;->a:Lw3/c8;

    const/4 p2, 0x0

    iput-object p2, p0, Lw3/q2;->b:Ljava/lang/Boolean;

    invoke-static {p1}, Lw3/p2;->k(Lw3/p2;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lw3/q2;->c:Ljava/lang/Boolean;

    iput-object p2, p0, Lw3/q2;->d:Lw3/s7;

    invoke-static {p1}, Lw3/p2;->j(Lw3/p2;)Lw3/ca;

    move-result-object p2

    iput-object p2, p0, Lw3/q2;->e:Lw3/ca;

    invoke-static {p1}, Lw3/p2;->a(Lw3/p2;)Lw3/c1;

    move-result-object p2

    iput-object p2, p0, Lw3/q2;->f:Lw3/c1;

    invoke-static {p1}, Lw3/p2;->b(Lw3/p2;)Lw3/c1;

    move-result-object p1

    iput-object p1, p0, Lw3/q2;->g:Lw3/c1;

    return-void
.end method


# virtual methods
.method public final a()Lw3/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/c1<",
            "Lw3/p8;",
            ">;"
        }
    .end annotation

    .annotation build Lw3/b2;
        zza = 0x6
    .end annotation

    iget-object v0, p0, Lw3/q2;->f:Lw3/c1;

    return-object v0
.end method

.method public final b()Lw3/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/c1<",
            "Lw3/q8;",
            ">;"
        }
    .end annotation

    .annotation build Lw3/b2;
        zza = 0x7
    .end annotation

    iget-object v0, p0, Lw3/q2;->g:Lw3/c1;

    return-object v0
.end method

.method public final c()Lw3/c8;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/q2;->a:Lw3/c8;

    return-object v0
.end method

.method public final d()Lw3/ca;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lw3/q2;->e:Lw3/ca;

    return-object v0
.end method

.method public final e()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lw3/q2;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lw3/q2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lw3/q2;

    iget-object v1, p0, Lw3/q2;->a:Lw3/c8;

    .line 3
    iget-object v3, p1, Lw3/q2;->a:Lw3/c8;

    invoke-static {v1, v3}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lw3/q2;->c:Ljava/lang/Boolean;

    iget-object v4, p1, Lw3/q2;->c:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, v1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lw3/q2;->e:Lw3/ca;

    iget-object v3, p1, Lw3/q2;->e:Lw3/ca;

    invoke-static {v1, v3}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lw3/q2;->f:Lw3/c1;

    iget-object v3, p1, Lw3/q2;->f:Lw3/c1;

    invoke-static {v1, v3}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lw3/q2;->g:Lw3/c1;

    iget-object p1, p1, Lw3/q2;->g:Lw3/c1;

    invoke-static {v1, p1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lw3/q2;->a:Lw3/c8;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    iget-object v1, p0, Lw3/q2;->c:Ljava/lang/Boolean;

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/4 v1, 0x3

    aput-object v2, v0, v1

    iget-object v1, p0, Lw3/q2;->e:Lw3/ca;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lw3/q2;->f:Lw3/c1;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lw3/q2;->g:Lw3/c1;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Lz2/h;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
