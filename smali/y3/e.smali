.class final Ly3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/g;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ll5/c;

.field private final d:Ly3/k8;


# direct methods
.method constructor <init>(Ly3/k8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly3/e;->a:Z

    iput-boolean v0, p0, Ly3/e;->b:Z

    iput-object p1, p0, Ly3/e;->d:Ly3/k8;

    return-void
.end method

.method private final d()V
    .locals 2

    iget-boolean v0, p0, Ly3/e;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly3/e;->a:Z

    return-void

    :cond_0
    new-instance v0, Ll5/b;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Ll5/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method final a(Ll5/c;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly3/e;->a:Z

    iput-object p1, p0, Ly3/e;->c:Ll5/c;

    iput-boolean p2, p0, Ly3/e;->b:Z

    return-void
.end method

.method public final b(Ljava/lang/String;)Ll5/g;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ly3/e;->d()V

    iget-object v0, p0, Ly3/e;->d:Ly3/k8;

    iget-object v1, p0, Ly3/e;->c:Ll5/c;

    iget-boolean v2, p0, Ly3/e;->b:Z

    .line 2
    invoke-virtual {v0, v1, p1, v2}, Ly3/k8;->e(Ll5/c;Ljava/lang/Object;Z)Ll5/e;

    return-object p0
.end method

.method public final c(Z)Ll5/g;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ly3/e;->d()V

    iget-object v0, p0, Ly3/e;->d:Ly3/k8;

    iget-object v1, p0, Ly3/e;->c:Ll5/c;

    iget-boolean v2, p0, Ly3/e;->b:Z

    .line 2
    invoke-virtual {v0, v1, p1, v2}, Ly3/k8;->f(Ll5/c;IZ)Ly3/k8;

    return-object p0
.end method
