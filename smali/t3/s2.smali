.class public abstract Lt3/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/Class;)Lt3/s2;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/r2;
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt3/s2;

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Lt3/r2;

    .line 4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " value, but got "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt3/r2;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static d(B)I
    .locals 0

    shr-int/lit8 p0, p0, 0x5

    and-int/lit8 p0, p0, 0x7

    return p0
.end method

.method public static g(J)Lt3/n2;
    .locals 1

    new-instance v0, Lt3/n2;

    invoke-direct {v0, p0, p1}, Lt3/n2;-><init>(J)V

    return-object v0
.end method

.method public static i(Ljava/lang/String;)Lt3/q2;
    .locals 1

    new-instance v0, Lt3/q2;

    invoke-direct {v0, p0}, Lt3/q2;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static varargs j([B)Lt3/s2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/m2;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p0

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 3
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p0, Lt3/v2;

    .line 4
    invoke-direct {p0, v0}, Lt3/v2;-><init>(Ljava/io/InputStream;)V

    .line 5
    invoke-static {v0, p0}, Lt3/t2;->a(Ljava/io/InputStream;Lt3/v2;)Lt3/s2;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/io/InputStream;)Lt3/s2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/m2;
        }
    .end annotation

    .line 1
    new-instance v0, Lt3/v2;

    invoke-direct {v0, p0}, Lt3/v2;-><init>(Ljava/io/InputStream;)V

    .line 2
    invoke-static {p0, v0}, Lt3/t2;->a(Ljava/io/InputStream;Lt3/v2;)Lt3/s2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected b()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Lt3/l2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/r2;
        }
    .end annotation

    const-class v0, Lt3/l2;

    invoke-direct {p0, v0}, Lt3/s2;->c(Ljava/lang/Class;)Lt3/s2;

    move-result-object v0

    check-cast v0, Lt3/l2;

    return-object v0
.end method

.method public final f()Lt3/n2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/r2;
        }
    .end annotation

    const-class v0, Lt3/n2;

    invoke-direct {p0, v0}, Lt3/s2;->c(Ljava/lang/Class;)Lt3/s2;

    move-result-object v0

    check-cast v0, Lt3/n2;

    return-object v0
.end method

.method public final h()Lt3/p2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lt3/r2;
        }
    .end annotation

    const-class v0, Lt3/p2;

    invoke-direct {p0, v0}, Lt3/s2;->c(Ljava/lang/Class;)Lt3/s2;

    move-result-object v0

    check-cast v0, Lt3/p2;

    return-object v0
.end method

.method protected abstract zza()I
.end method
