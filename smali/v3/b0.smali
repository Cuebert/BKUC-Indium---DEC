.class public final Lv3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/v;


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

.field private final c:Lv3/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lv3/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv3/b0;->c:Lv3/r;

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

    new-instance v0, Lv3/z;

    invoke-direct {v0, p1}, Lv3/z;-><init>(Ly1/g;)V

    invoke-direct {p2, v0}, Lj5/w;-><init>(Lt5/b;)V

    iput-object p2, p0, Lv3/b0;->a:Lt5/b;

    .line 6
    :cond_0
    new-instance p2, Lj5/w;

    new-instance v0, Lv3/a0;

    invoke-direct {v0, p1}, Lv3/a0;-><init>(Ly1/g;)V

    invoke-direct {p2, v0}, Lj5/w;-><init>(Lt5/b;)V

    iput-object p2, p0, Lv3/b0;->b:Lt5/b;

    return-void
.end method
