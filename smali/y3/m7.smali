.class public final Ly3/m7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/e7;


# instance fields
.field private a:Lt5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt5/b<",
            "Ly1/f<",
            "[B>;>;"
        }
    .end annotation
.end field

.field private final b:Lt5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt5/b<",
            "Ly1/f<",
            "[B>;>;"
        }
    .end annotation
.end field

.field private final c:Ly3/z6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ly3/z6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly3/m7;->c:Ly3/z6;

    .line 1
    sget-object p2, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    .line 2
    invoke-static {p1}, La2/t;->f(Landroid/content/Context;)V

    .line 3
    invoke-static {}, La2/t;->c()La2/t;

    move-result-object p1

    invoke-virtual {p1, p2}, La2/t;->g(La2/f;)Ly1/g;

    move-result-object p1

    .line 4
    invoke-virtual {p2}, Lcom/google/android/datatransport/cct/a;->a()Ljava/util/Set;

    move-result-object p2

    const-string v0, "json"

    invoke-static {v0}, Ly1/b;->b(Ljava/lang/String;)Ly1/b;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 5
    new-instance p2, Lj5/w;

    new-instance v0, Ly3/k7;

    invoke-direct {v0, p1}, Ly3/k7;-><init>(Ly1/g;)V

    invoke-direct {p2, v0}, Lj5/w;-><init>(Lt5/b;)V

    iput-object p2, p0, Ly3/m7;->a:Lt5/b;

    .line 6
    :cond_0
    new-instance p2, Lj5/w;

    new-instance v0, Ly3/l7;

    invoke-direct {v0, p1}, Ly3/l7;-><init>(Ly1/g;)V

    invoke-direct {p2, v0}, Lj5/w;-><init>(Lt5/b;)V

    iput-object p2, p0, Ly3/m7;->b:Lt5/b;

    return-void
.end method

.method static b(Ly3/z6;Ly3/g7;)Ly1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/z6;",
            "Ly3/g7;",
            ")",
            "Ly1/c<",
            "[B>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ly3/z6;->a()I

    move-result p0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p0, v0}, Ly3/g7;->b(IZ)[B

    move-result-object p0

    invoke-static {p0}, Ly1/c;->e(Ljava/lang/Object;)Ly1/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ly3/g7;)V
    .locals 2

    iget-object v0, p0, Ly3/m7;->c:Ly3/z6;

    .line 1
    invoke-virtual {v0}, Ly3/z6;->a()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ly3/m7;->a:Lt5/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lt5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/f;

    iget-object v1, p0, Ly3/m7;->c:Ly3/z6;

    invoke-static {v1, p1}, Ly3/m7;->b(Ly3/z6;Ly3/g7;)Ly1/c;

    move-result-object p1

    invoke-interface {v0, p1}, Ly1/f;->a(Ly1/c;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Ly3/m7;->b:Lt5/b;

    .line 3
    invoke-interface {v0}, Lt5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/f;

    iget-object v1, p0, Ly3/m7;->c:Ly3/z6;

    invoke-static {v1, p1}, Ly3/m7;->b(Ly3/z6;Ly3/g7;)Ly1/c;

    move-result-object p1

    invoke-interface {v0, p1}, Ly1/f;->a(Ly1/c;)V

    return-void
.end method
