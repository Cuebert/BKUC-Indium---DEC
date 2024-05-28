.class public final Lcom/google/firebase/iid/Registrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/i;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/iid/Registrar$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj5/d<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 2
    invoke-static {v0}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v1

    const-class v2, Lh5/c;

    .line 3
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    const-class v2, Lp5/d;

    .line 4
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    const-class v2, La6/i;

    .line 5
    invoke-static {v2}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/iid/b;->a:Lj5/h;

    .line 6
    invoke-virtual {v1, v2}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lj5/d$b;->c()Lj5/d$b;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lj5/d$b;->d()Lj5/d;

    move-result-object v1

    .line 9
    const-class v2, Ls5/a;

    .line 10
    invoke-static {v2}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v2

    .line 11
    invoke-static {v0}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v0

    invoke-virtual {v2, v0}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/iid/c;->a:Lj5/h;

    .line 12
    invoke-virtual {v0, v2}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lj5/d$b;->d()Lj5/d;

    move-result-object v0

    const-string v2, "fire-iid"

    const-string v3, "20.0.0"

    .line 14
    invoke-static {v2, v3}, La6/h;->b(Ljava/lang/String;Ljava/lang/String;)Lj5/d;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lj5/d;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const/4 v0, 0x2

    aput-object v2, v3, v0

    .line 15
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
