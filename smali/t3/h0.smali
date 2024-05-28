.class final Lt3/h0;
.super Lt3/d0;
.source "SourceFile"


# instance fields
.field final synthetic p:Lt3/i0;


# direct methods
.method constructor <init>(Lt3/i0;)V
    .locals 0

    iput-object p1, p0, Lt3/h0;->p:Lt3/i0;

    invoke-direct {p0}, Lt3/d0;-><init>()V

    return-void
.end method


# virtual methods
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

.method final r()Lt3/a0;
    .locals 1

    new-instance v0, Lt3/g0;

    invoke-direct {v0, p0}, Lt3/g0;-><init>(Lt3/h0;)V

    return-object v0
.end method

.method final u()Lt3/c0;
    .locals 1

    iget-object v0, p0, Lt3/h0;->p:Lt3/i0;

    return-object v0
.end method
