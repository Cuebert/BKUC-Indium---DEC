.class public final Lw3/s7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/r7;

.field private final b:Ljava/lang/Integer;

.field private final c:Ljava/lang/Integer;

.field private final d:Ljava/lang/Boolean;


# direct methods
.method synthetic constructor <init>(Lw3/q7;Lw3/p7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/q7;->c(Lw3/q7;)Lw3/r7;

    move-result-object p2

    iput-object p2, p0, Lw3/s7;->a:Lw3/r7;

    invoke-static {p1}, Lw3/q7;->e(Lw3/q7;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw3/s7;->b:Ljava/lang/Integer;

    const/4 p1, 0x0

    iput-object p1, p0, Lw3/s7;->c:Ljava/lang/Integer;

    iput-object p1, p0, Lw3/s7;->d:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()Lw3/r7;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/s7;->a:Lw3/r7;

    return-object v0
.end method

.method public final b()Ljava/lang/Integer;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lw3/s7;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lw3/s7;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lw3/s7;

    iget-object v1, p0, Lw3/s7;->a:Lw3/r7;

    .line 3
    iget-object v3, p1, Lw3/s7;->a:Lw3/r7;

    invoke-static {v1, v3}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lw3/s7;->b:Ljava/lang/Integer;

    iget-object p1, p1, Lw3/s7;->b:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1, p1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lw3/s7;->a:Lw3/r7;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lw3/s7;->b:Ljava/lang/Integer;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    invoke-static {v0}, Lz2/h;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
