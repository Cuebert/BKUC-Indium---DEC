.class public La6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La6/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;La6/h$a;Lj5/e;)La6/f;
    .locals 0

    invoke-static {p0, p1, p2}, La6/h;->d(Ljava/lang/String;La6/h$a;Lj5/e;)La6/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lj5/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lj5/d<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, La6/f;->a(Ljava/lang/String;Ljava/lang/String;)La6/f;

    move-result-object p0

    const-class p1, La6/f;

    invoke-static {p0, p1}, Lj5/d;->i(Ljava/lang/Object;Ljava/lang/Class;)Lj5/d;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;La6/h$a;)Lj5/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La6/h$a<",
            "Landroid/content/Context;",
            ">;)",
            "Lj5/d<",
            "*>;"
        }
    .end annotation

    .line 1
    const-class v0, La6/f;

    invoke-static {v0}, Lj5/d;->j(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    .line 2
    invoke-static {v1}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    new-instance v1, La6/g;

    invoke-direct {v1, p0, p1}, La6/g;-><init>(Ljava/lang/String;La6/h$a;)V

    .line 3
    invoke-virtual {v0, v1}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Lj5/d$b;->d()Lj5/d;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Ljava/lang/String;La6/h$a;Lj5/e;)La6/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, La6/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, La6/f;->a(Ljava/lang/String;Ljava/lang/String;)La6/f;

    move-result-object p0

    return-object p0
.end method
