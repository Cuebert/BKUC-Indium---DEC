.class public La6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/i;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:La6/d;


# direct methods
.method constructor <init>(Ljava/util/Set;La6/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "La6/f;",
            ">;",
            "La6/d;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, La6/c;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La6/c;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, La6/c;->b:La6/d;

    return-void
.end method

.method public static synthetic b(Lj5/e;)La6/i;
    .locals 0

    invoke-static {p0}, La6/c;->d(Lj5/e;)La6/i;

    move-result-object p0

    return-object p0
.end method

.method public static c()Lj5/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj5/d<",
            "La6/i;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, La6/i;

    invoke-static {v0}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v0

    const-class v1, La6/f;

    .line 2
    invoke-static {v1}, Lj5/q;->j(Ljava/lang/Class;)Lj5/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    sget-object v1, La6/b;->a:La6/b;

    .line 3
    invoke-virtual {v0, v1}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lj5/d$b;->d()Lj5/d;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d(Lj5/e;)La6/i;
    .locals 2

    .line 1
    new-instance v0, La6/c;

    const-class v1, La6/f;

    .line 2
    invoke-interface {p0, v1}, Lj5/e;->b(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-static {}, La6/d;->a()La6/d;

    move-result-object v1

    invoke-direct {v0, p0, v1}, La6/c;-><init>(Ljava/util/Set;La6/d;)V

    return-object v0
.end method

.method private static e(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "La6/f;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 3
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La6/f;

    .line 5
    invoke-virtual {v1}, La6/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, La6/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, La6/c;->b:La6/d;

    invoke-virtual {v0}, La6/d;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, La6/c;->a:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La6/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, La6/c;->b:La6/d;

    invoke-virtual {v1}, La6/d;->b()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, La6/c;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
