.class final La2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ly1/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:La2/o;

.field private final b:Ljava/lang/String;

.field private final c:Ly1/b;

.field private final d:Ly1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/e<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field private final e:La2/s;


# direct methods
.method constructor <init>(La2/o;Ljava/lang/String;Ly1/b;Ly1/e;La2/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/o;",
            "Ljava/lang/String;",
            "Ly1/b;",
            "Ly1/e<",
            "TT;[B>;",
            "La2/s;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La2/r;->a:La2/o;

    .line 3
    iput-object p2, p0, La2/r;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, La2/r;->c:Ly1/b;

    .line 5
    iput-object p4, p0, La2/r;->d:Ly1/e;

    .line 6
    iput-object p5, p0, La2/r;->e:La2/s;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, La2/r;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic c(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Ly1/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/c<",
            "TT;>;)V"
        }
    .end annotation

    sget-object v0, La2/q;->a:La2/q;

    invoke-virtual {p0, p1, v0}, La2/r;->d(Ly1/c;Ly1/h;)V

    return-void
.end method

.method public d(Ly1/c;Ly1/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/c<",
            "TT;>;",
            "Ly1/h;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, La2/r;->e:La2/s;

    .line 2
    invoke-static {}, La2/n;->a()La2/n$a;

    move-result-object v1

    iget-object v2, p0, La2/r;->a:La2/o;

    .line 3
    invoke-virtual {v1, v2}, La2/n$a;->e(La2/o;)La2/n$a;

    move-result-object v1

    .line 4
    invoke-virtual {v1, p1}, La2/n$a;->c(Ly1/c;)La2/n$a;

    move-result-object p1

    iget-object v1, p0, La2/r;->b:Ljava/lang/String;

    .line 5
    invoke-virtual {p1, v1}, La2/n$a;->f(Ljava/lang/String;)La2/n$a;

    move-result-object p1

    iget-object v1, p0, La2/r;->d:Ly1/e;

    .line 6
    invoke-virtual {p1, v1}, La2/n$a;->d(Ly1/e;)La2/n$a;

    move-result-object p1

    iget-object v1, p0, La2/r;->c:Ly1/b;

    .line 7
    invoke-virtual {p1, v1}, La2/n$a;->b(Ly1/b;)La2/n$a;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, La2/n$a;->a()La2/n;

    move-result-object p1

    .line 9
    invoke-interface {v0, p1, p2}, La2/s;->a(La2/n;Ly1/h;)V

    return-void
.end method
