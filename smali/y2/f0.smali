.class public final Ly2/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lh0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/a<",
            "Ly2/b<",
            "*>;",
            "Lcom/google/android/gms/common/ConnectionResult;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lh0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/a<",
            "Ly2/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lg4/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg4/m<",
            "Ljava/util/Map<",
            "Ly2/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lx2/g<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh0/a;

    invoke-direct {v0}, Lh0/a;-><init>()V

    iput-object v0, p0, Ly2/f0;->b:Lh0/a;

    .line 2
    new-instance v0, Lg4/m;

    invoke-direct {v0}, Lg4/m;-><init>()V

    iput-object v0, p0, Ly2/f0;->c:Lg4/m;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly2/f0;->e:Z

    new-instance v0, Lh0/a;

    .line 3
    invoke-direct {v0}, Lh0/a;-><init>()V

    iput-object v0, p0, Ly2/f0;->a:Lh0/a;

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx2/g;

    iget-object v1, p0, Ly2/f0;->a:Lh0/a;

    .line 5
    invoke-interface {v0}, Lx2/g;->h()Ly2/b;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lh0/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ly2/f0;->a:Lh0/a;

    .line 6
    invoke-virtual {p1}, Lh0/a;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    iput p1, p0, Ly2/f0;->d:I

    return-void
.end method


# virtual methods
.method public final a()Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg4/l<",
            "Ljava/util/Map<",
            "Ly2/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ly2/f0;->c:Lg4/m;

    invoke-virtual {v0}, Lg4/m;->a()Lg4/l;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ly2/b<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Ly2/f0;->a:Lh0/a;

    invoke-virtual {v0}, Lh0/a;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ly2/b;Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly2/b<",
            "*>;",
            "Lcom/google/android/gms/common/ConnectionResult;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ly2/f0;->a:Lh0/a;

    invoke-virtual {v0, p1, p2}, Lh0/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ly2/f0;->b:Lh0/a;

    .line 2
    invoke-virtual {v0, p1, p3}, Lh0/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Ly2/f0;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ly2/f0;->d:I

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/common/ConnectionResult;->B()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly2/f0;->e:Z

    :cond_0
    iget p1, p0, Ly2/f0;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ly2/f0;->e:Z

    if-eqz p1, :cond_1

    new-instance p1, Lx2/c;

    iget-object p2, p0, Ly2/f0;->a:Lh0/a;

    .line 4
    invoke-direct {p1, p2}, Lx2/c;-><init>(Lh0/a;)V

    iget-object p2, p0, Ly2/f0;->c:Lg4/m;

    .line 5
    invoke-virtual {p2, p1}, Lg4/m;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object p1, p0, Ly2/f0;->c:Lg4/m;

    iget-object p2, p0, Ly2/f0;->b:Lh0/a;

    .line 6
    invoke-virtual {p1, p2}, Lg4/m;->c(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
