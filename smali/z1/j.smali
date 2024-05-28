.class public abstract Lz1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lz1/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lz1/m;",
            ">;)",
            "Lz1/j;"
        }
    .end annotation

    new-instance v0, Lz1/d;

    invoke-direct {v0, p0}, Lz1/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Ll5/a;
    .locals 2

    .line 1
    new-instance v0, Ln5/d;

    invoke-direct {v0}, Ln5/d;-><init>()V

    sget-object v1, Lz1/b;->a:Lm5/a;

    .line 2
    invoke-virtual {v0, v1}, Ln5/d;->j(Lm5/a;)Ln5/d;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Ln5/d;->k(Z)Ln5/d;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Ln5/d;->i()Ll5/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz1/m;",
            ">;"
        }
    .end annotation
.end method
