.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/i;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lj5/e;)Lu5/c;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Lj5/e;)Lu5/c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lj5/e;)Lu5/c;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/firebase/installations/b;

    const-class v1, Lh5/c;

    .line 2
    invoke-interface {p0, v1}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh5/c;

    const-class v2, La6/i;

    .line 3
    invoke-interface {p0, v2}, Lj5/e;->c(Ljava/lang/Class;)Lt5/b;

    move-result-object v2

    const-class v3, Lq5/f;

    .line 4
    invoke-interface {p0, v3}, Lj5/e;->c(Ljava/lang/Class;)Lt5/b;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/google/firebase/installations/b;-><init>(Lh5/c;Lt5/b;Lt5/b;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj5/d<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lj5/d;

    .line 1
    const-class v1, Lu5/c;

    .line 2
    invoke-static {v1}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v1

    const-class v2, Lh5/c;

    .line 3
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    const-class v2, Lq5/f;

    .line 4
    invoke-static {v2}, Lj5/q;->g(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    const-class v2, La6/i;

    .line 5
    invoke-static {v2}, Lj5/q;->g(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    sget-object v2, Lu5/d;->a:Lu5/d;

    .line 6
    invoke-virtual {v1, v2}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lj5/d$b;->d()Lj5/d;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "fire-installations"

    const-string v2, "17.0.0"

    .line 8
    invoke-static {v1, v2}, La6/h;->b(Ljava/lang/String;Ljava/lang/String;)Lj5/d;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 9
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
