.class public final Lw3/ca;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/z9;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method synthetic constructor <init>(Lw3/ba;Lw3/aa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/ba;->a(Lw3/ba;)Lw3/c1;

    move-result-object p1

    iput-object p1, p0, Lw3/ca;->a:Lw3/c1;

    return-void
.end method


# virtual methods
.method public final a()Lw3/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/c1<",
            "Lw3/z9;",
            ">;"
        }
    .end annotation

    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/ca;->a:Lw3/c1;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Lw3/ca;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    check-cast p1, Lw3/ca;

    iget-object v0, p0, Lw3/ca;->a:Lw3/c1;

    .line 3
    iget-object p1, p1, Lw3/ca;->a:Lw3/c1;

    invoke-static {v0, p1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lw3/ca;->a:Lw3/c1;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lz2/h;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
