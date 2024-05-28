.class public final Ly3/w7;
.super Ly3/i7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ly3/i7<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Ly3/i7;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ly3/w7;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ly3/w7<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Ly3/i7;->a(Ljava/lang/Object;)Ly3/i7;

    return-object p0
.end method

.method public final d()Ly3/z7;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly3/z7<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly3/i7;->c:Z

    iget-object v0, p0, Ly3/i7;->a:[Ljava/lang/Object;

    iget v1, p0, Ly3/i7;->b:I

    invoke-static {v0, v1}, Ly3/z7;->m([Ljava/lang/Object;I)Ly3/z7;

    move-result-object v0

    return-object v0
.end method
