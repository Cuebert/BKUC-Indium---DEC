.class public Lk1/b;
.super Lk1/p;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk1/p;-><init>()V

    .line 2
    invoke-direct {p0}, Lk1/b;->z0()V

    return-void
.end method

.method private z0()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lk1/p;->w0(I)Lk1/p;

    .line 2
    new-instance v1, Lk1/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lk1/d;-><init>(I)V

    invoke-virtual {p0, v1}, Lk1/p;->o0(Lk1/l;)Lk1/p;

    move-result-object v1

    new-instance v2, Lk1/c;

    invoke-direct {v2}, Lk1/c;-><init>()V

    .line 3
    invoke-virtual {v1, v2}, Lk1/p;->o0(Lk1/l;)Lk1/p;

    move-result-object v1

    new-instance v2, Lk1/d;

    invoke-direct {v2, v0}, Lk1/d;-><init>(I)V

    .line 4
    invoke-virtual {v1, v2}, Lk1/p;->o0(Lk1/l;)Lk1/p;

    return-void
.end method
