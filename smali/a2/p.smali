.class final La2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/g;


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ly1/b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:La2/o;

.field private final c:La2/s;


# direct methods
.method constructor <init>(Ljava/util/Set;La2/o;La2/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ly1/b;",
            ">;",
            "La2/o;",
            "La2/s;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La2/p;->a:Ljava/util/Set;

    .line 3
    iput-object p2, p0, La2/p;->b:La2/o;

    .line 4
    iput-object p3, p0, La2/p;->c:La2/s;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Class;Ly1/b;Ly1/e;)Ly1/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ly1/b;",
            "Ly1/e<",
            "TT;[B>;)",
            "Ly1/f<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p2, p0, La2/p;->a:Ljava/util/Set;

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    new-instance p2, La2/r;

    iget-object v1, p0, La2/p;->b:La2/o;

    iget-object v5, p0, La2/p;->c:La2/s;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, La2/r;-><init>(La2/o;Ljava/lang/String;Ly1/b;Ly1/e;La2/s;)V

    return-object p2

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p3, p2, p4

    const/4 p3, 0x1

    iget-object p4, p0, La2/p;->a:Ljava/util/Set;

    aput-object p4, p2, p3

    const-string p3, "%s is not supported byt this factory. Supported encodings are: %s."

    .line 4
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
