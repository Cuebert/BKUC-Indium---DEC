.class Lw3/u0;
.super Lw3/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lw3/v0<",
        "TE;>;"
    }
.end annotation


# instance fields
.field a:[Ljava/lang/Object;

.field b:I

.field c:Z


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lw3/v0;-><init>()V

    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lw3/u0;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lw3/u0;->b:I

    return-void
.end method

.method private final d(I)V
    .locals 4

    iget-object v0, p0, Lw3/u0;->a:[Ljava/lang/Object;

    .line 1
    array-length v1, v0

    const/4 v2, 0x0

    if-ge v1, p1, :cond_2

    shr-int/lit8 v3, v1, 0x1

    add-int/2addr v1, v3

    add-int/lit8 v1, v1, 0x1

    if-ge v1, p1, :cond_0

    add-int/lit8 p1, p1, -0x1

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p1

    add-int v1, p1, p1

    :cond_0
    if-gez v1, :cond_1

    const v1, 0x7fffffff

    .line 3
    :cond_1
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lw3/u0;->a:[Ljava/lang/Object;

    iput-boolean v2, p0, Lw3/u0;->c:Z

    return-void

    :cond_2
    iget-boolean p1, p0, Lw3/u0;->c:Z

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    iput-object p1, p0, Lw3/u0;->a:[Ljava/lang/Object;

    iput-boolean v2, p0, Lw3/u0;->c:Z

    :cond_3
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Lw3/u0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lw3/u0<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lw3/u0;->b:I

    add-int/lit8 v0, v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lw3/u0;->d(I)V

    iget-object v0, p0, Lw3/u0;->a:[Ljava/lang/Object;

    iget v1, p0, Lw3/u0;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lw3/u0;->b:I

    .line 3
    aput-object p1, v0, v1

    return-object p0
.end method

.method public final c(Ljava/lang/Iterable;)Lw3/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lw3/v0<",
            "TE;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_1

    iget v0, p0, Lw3/u0;->b:I

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lw3/u0;->d(I)V

    .line 3
    instance-of v0, p1, Lw3/w0;

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    check-cast p1, Lw3/w0;

    iget-object v0, p0, Lw3/u0;->a:[Ljava/lang/Object;

    iget v1, p0, Lw3/u0;->b:I

    .line 5
    invoke-virtual {p1, v0, v1}, Lw3/w0;->c([Ljava/lang/Object;I)I

    move-result p1

    iput p1, p0, Lw3/u0;->b:I

    return-object p0

    .line 6
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lw3/v0;->a(Ljava/lang/Object;)Lw3/v0;

    goto :goto_1

    :cond_2
    return-object p0
.end method
