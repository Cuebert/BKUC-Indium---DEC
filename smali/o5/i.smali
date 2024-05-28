.class Lo5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/g;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ll5/c;

.field private final d:Lo5/f;


# direct methods
.method constructor <init>(Lo5/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lo5/i;->a:Z

    .line 3
    iput-boolean v0, p0, Lo5/i;->b:Z

    .line 4
    iput-object p1, p0, Lo5/i;->d:Lo5/f;

    return-void
.end method

.method private a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lo5/i;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lo5/i;->a:Z

    return-void

    .line 3
    :cond_0
    new-instance v0, Ll5/b;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Ll5/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ll5/g;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lo5/i;->a()V

    .line 2
    iget-object v0, p0, Lo5/i;->d:Lo5/f;

    iget-object v1, p0, Lo5/i;->c:Ll5/c;

    iget-boolean v2, p0, Lo5/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lo5/f;->f(Ll5/c;Ljava/lang/Object;Z)Ll5/e;

    return-object p0
.end method

.method public c(Z)Ll5/g;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lo5/i;->a()V

    .line 2
    iget-object v0, p0, Lo5/i;->d:Lo5/f;

    iget-object v1, p0, Lo5/i;->c:Ll5/c;

    iget-boolean v2, p0, Lo5/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lo5/f;->k(Ll5/c;ZZ)Lo5/f;

    return-object p0
.end method

.method d(Ll5/c;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lo5/i;->a:Z

    .line 2
    iput-object p1, p0, Lo5/i;->c:Ll5/c;

    .line 3
    iput-boolean p2, p0, Lo5/i;->b:Z

    return-void
.end method
