.class public final Lw3/xa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/oa;


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

.field private final c:Lw3/ia;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw3/ia;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw3/xa;->c:Lw3/ia;

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

    new-instance v0, Lw3/va;

    invoke-direct {v0, p1}, Lw3/va;-><init>(Ly1/g;)V

    invoke-direct {p2, v0}, Lj5/w;-><init>(Lt5/b;)V

    iput-object p2, p0, Lw3/xa;->a:Lt5/b;

    .line 6
    :cond_0
    new-instance p2, Lj5/w;

    new-instance v0, Lw3/wa;

    invoke-direct {v0, p1}, Lw3/wa;-><init>(Ly1/g;)V

    invoke-direct {p2, v0}, Lj5/w;-><init>(Lt5/b;)V

    iput-object p2, p0, Lw3/xa;->b:Lt5/b;

    return-void
.end method

.method static b(Lw3/ia;Lw3/sa;)Ly1/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/ia;",
            "Lw3/sa;",
            ")",
            "Ly1/c<",
            "[B>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lw3/ia;->a()I

    move-result p0

    invoke-virtual {p1}, Lw3/sa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1, p0, v1}, Lw3/sa;->c(IZ)[B

    move-result-object p0

    invoke-static {p0}, Ly1/c;->d(Ljava/lang/Object;)Ly1/c;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p1, p0, v1}, Lw3/sa;->c(IZ)[B

    move-result-object p0

    invoke-static {p0}, Ly1/c;->e(Ljava/lang/Object;)Ly1/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lw3/sa;)V
    .locals 2

    iget-object v0, p0, Lw3/xa;->c:Lw3/ia;

    .line 1
    invoke-virtual {v0}, Lw3/ia;->a()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lw3/xa;->a:Lt5/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lt5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/f;

    iget-object v1, p0, Lw3/xa;->c:Lw3/ia;

    invoke-static {v1, p1}, Lw3/xa;->b(Lw3/ia;Lw3/sa;)Ly1/c;

    move-result-object p1

    invoke-interface {v0, p1}, Ly1/f;->a(Ly1/c;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lw3/xa;->b:Lt5/b;

    .line 3
    invoke-interface {v0}, Lt5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/f;

    iget-object v1, p0, Lw3/xa;->c:Lw3/ia;

    invoke-static {v1, p1}, Lw3/xa;->b(Lw3/ia;Lw3/sa;)Ly1/c;

    move-result-object p1

    invoke-interface {v0, p1}, Ly1/f;->a(Ly1/c;)V

    return-void
.end method
