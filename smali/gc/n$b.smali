.class final Lgc/n$b;
.super Lob/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final o:Lob/j0;

.field private final p:Lac/e;

.field q:Ljava/io/IOException;


# direct methods
.method constructor <init>(Lob/j0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lob/j0;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/n$b;->o:Lob/j0;

    .line 3
    new-instance v0, Lgc/n$b$a;

    .line 4
    invoke-virtual {p1}, Lob/j0;->Q()Lac/e;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lgc/n$b$a;-><init>(Lgc/n$b;Lac/t;)V

    .line 5
    invoke-static {v0}, Lac/l;->d(Lac/t;)Lac/e;

    move-result-object p1

    iput-object p1, p0, Lgc/n$b;->p:Lac/e;

    return-void
.end method


# virtual methods
.method public Q()Lac/e;
    .locals 1

    iget-object v0, p0, Lgc/n$b;->p:Lac/e;

    return-object v0
.end method

.method W()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgc/n$b;->q:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    throw v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lgc/n$b;->o:Lob/j0;

    invoke-virtual {v0}, Lob/j0;->close()V

    return-void
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Lgc/n$b;->o:Lob/j0;

    invoke-virtual {v0}, Lob/j0;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public l()Lob/b0;
    .locals 1

    iget-object v0, p0, Lgc/n$b;->o:Lob/j0;

    invoke-virtual {v0}, Lob/j0;->l()Lob/b0;

    move-result-object v0

    return-object v0
.end method
