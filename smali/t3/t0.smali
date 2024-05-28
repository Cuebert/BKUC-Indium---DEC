.class final Lt3/t0;
.super Lt3/e0;
.source "SourceFile"


# static fields
.field private static final u:[Ljava/lang/Object;

.field static final v:Lt3/t0;


# instance fields
.field final transient p:[Ljava/lang/Object;

.field private final transient q:I

.field final transient r:[Ljava/lang/Object;

.field private final transient s:I

.field private final transient t:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    sput-object v4, Lt3/t0;->u:[Ljava/lang/Object;

    new-instance v0, Lt3/t0;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, Lt3/t0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, Lt3/t0;->v:Lt3/t0;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lt3/e0;-><init>()V

    iput-object p1, p0, Lt3/t0;->p:[Ljava/lang/Object;

    iput p2, p0, Lt3/t0;->q:I

    iput-object p3, p0, Lt3/t0;->r:[Ljava/lang/Object;

    iput p4, p0, Lt3/t0;->s:I

    iput p5, p0, Lt3/t0;->t:I

    return-void
.end method


# virtual methods
.method final c([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lt3/t0;->p:[Ljava/lang/Object;

    iget v0, p0, Lt3/t0;->t:I

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lt3/t0;->t:I

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lt3/t0;->r:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    array-length v2, v0

    if-nez v2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Lt3/v;->a(I)I

    move-result v2

    :goto_0
    iget v3, p0, Lt3/t0;->s:I

    and-int/2addr v2, v3

    .line 3
    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    .line 4
    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lt3/t0;->t:I

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lt3/t0;->q:I

    return v0
.end method

.method final i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt3/e0;->q()Lt3/a0;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lt3/a0;->s(I)Lt3/d1;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lt3/c1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt3/e0;->q()Lt3/a0;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lt3/a0;->s(I)Lt3/d1;

    move-result-object v0

    return-object v0
.end method

.method final l()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt3/t0;->p:[Ljava/lang/Object;

    return-object v0
.end method

.method final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final r()Lt3/a0;
    .locals 2

    iget-object v0, p0, Lt3/t0;->p:[Ljava/lang/Object;

    iget v1, p0, Lt3/t0;->t:I

    invoke-static {v0, v1}, Lt3/a0;->p([Ljava/lang/Object;I)Lt3/a0;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lt3/t0;->t:I

    return v0
.end method
