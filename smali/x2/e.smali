.class public abstract Lx2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx2/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lx2/a$d;",
        ">",
        "Ljava/lang/Object;",
        "Lx2/g<",
        "TO;>;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final d:Lx2/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field private final e:Ly2/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly2/b<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final f:Landroid/os/Looper;

.field private final g:I

.field private final h:Lx2/f;

.field private final i:Ly2/m;

.field protected final j:Lcom/google/android/gms/common/api/internal/c;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lx2/a;Lx2/a$d;Lx2/e$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lx2/a<",
            "TO;>;TO;",
            "Lx2/e$a;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lx2/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lx2/a;Lx2/a$d;Ly2/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lx2/a<",
            "TO;>;TO;",
            "Ly2/m;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    new-instance v0, Lx2/e$a$a;

    invoke-direct {v0}, Lx2/e$a$a;-><init>()V

    invoke-virtual {v0, p4}, Lx2/e$a$a;->c(Ly2/m;)Lx2/e$a$a;

    invoke-virtual {p1}, Landroid/app/Activity;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-virtual {v0, p4}, Lx2/e$a$a;->b(Landroid/os/Looper;)Lx2/e$a$a;

    invoke-virtual {v0}, Lx2/e$a$a;->a()Lx2/e$a;

    move-result-object p4

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lx2/e;-><init>(Landroid/app/Activity;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lx2/a;Lx2/a$d;Lx2/e$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/Activity;",
            "Lx2/a<",
            "TO;>;TO;",
            "Lx2/e$a;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    .line 5
    invoke-static {p3, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 6
    invoke-static {p5, v0}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lx2/e;->a:Landroid/content/Context;

    .line 8
    invoke-static {}, Lf3/k;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getAttributionTag"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    .line 9
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    .line 10
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    iput-object v1, p0, Lx2/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lx2/e;->c:Lx2/a;

    iput-object p4, p0, Lx2/e;->d:Lx2/a$d;

    .line 11
    iget-object p1, p5, Lx2/e$a;->b:Landroid/os/Looper;

    iput-object p1, p0, Lx2/e;->f:Landroid/os/Looper;

    .line 12
    invoke-static {p3, p4, v1}, Ly2/b;->a(Lx2/a;Lx2/a$d;Ljava/lang/String;)Ly2/b;

    move-result-object p1

    iput-object p1, p0, Lx2/e;->e:Ly2/b;

    .line 13
    new-instance p3, Ly2/s;

    invoke-direct {p3, p0}, Ly2/s;-><init>(Lx2/e;)V

    iput-object p3, p0, Lx2/e;->h:Lx2/f;

    iget-object p3, p0, Lx2/e;->a:Landroid/content/Context;

    .line 14
    invoke-static {p3}, Lcom/google/android/gms/common/api/internal/c;->z(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/c;

    move-result-object p3

    iput-object p3, p0, Lx2/e;->j:Lcom/google/android/gms/common/api/internal/c;

    .line 15
    invoke-virtual {p3}, Lcom/google/android/gms/common/api/internal/c;->n()I

    move-result p4

    iput p4, p0, Lx2/e;->g:I

    .line 16
    iget-object p4, p5, Lx2/e$a;->a:Ly2/m;

    iput-object p4, p0, Lx2/e;->i:Ly2/m;

    if-eqz p2, :cond_1

    .line 17
    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    .line 18
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    .line 19
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/common/api/internal/h;->u(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/c;Ly2/b;)V

    .line 20
    :cond_1
    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/internal/c;->c(Lx2/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx2/a;Lx2/a$d;Lx2/e$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lx2/a<",
            "TO;>;TO;",
            "Lx2/e$a;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 21
    invoke-direct/range {v0 .. v5}, Lx2/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    return-void
.end method

.method private final w(ILcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx2/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/b<",
            "+",
            "Lx2/m;",
            "TA;>;>(ITT;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->k()V

    iget-object v0, p0, Lx2/e;->j:Lcom/google/android/gms/common/api/internal/c;

    .line 2
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/common/api/internal/c;->G(Lx2/e;ILcom/google/android/gms/common/api/internal/b;)V

    return-object p2
.end method

.method private final x(ILcom/google/android/gms/common/api/internal/d;)Lg4/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lx2/a$b;",
            ">(I",
            "Lcom/google/android/gms/common/api/internal/d<",
            "TA;TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    new-instance v6, Lg4/m;

    invoke-direct {v6}, Lg4/m;-><init>()V

    iget-object v0, p0, Lx2/e;->j:Lcom/google/android/gms/common/api/internal/c;

    iget-object v5, p0, Lx2/e;->i:Ly2/m;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, v6

    .line 2
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/common/api/internal/c;->H(Lx2/e;ILcom/google/android/gms/common/api/internal/d;Lg4/m;Ly2/m;)V

    .line 3
    invoke-virtual {v6}, Lg4/m;->a()Lg4/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final h()Ly2/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly2/b<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lx2/e;->e:Ly2/b;

    return-object v0
.end method

.method public j()Lx2/f;
    .locals 1

    iget-object v0, p0, Lx2/e;->h:Lx2/f;

    return-object v0
.end method

.method protected k()Lz2/b$a;
    .locals 3

    .line 1
    new-instance v0, Lz2/b$a;

    invoke-direct {v0}, Lz2/b$a;-><init>()V

    iget-object v1, p0, Lx2/e;->d:Lx2/a$d;

    instance-of v2, v1, Lx2/a$d$b;

    if-eqz v2, :cond_0

    .line 2
    check-cast v1, Lx2/a$d$b;

    .line 3
    invoke-interface {v1}, Lx2/a$d$b;->w()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->e()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lx2/e;->d:Lx2/a$d;

    .line 6
    instance-of v2, v1, Lx2/a$d$a;

    if-eqz v2, :cond_1

    .line 7
    check-cast v1, Lx2/a$d$a;

    invoke-interface {v1}, Lx2/a$d$a;->e()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-virtual {v0, v1}, Lz2/b$a;->d(Landroid/accounts/Account;)Lz2/b$a;

    iget-object v1, p0, Lx2/e;->d:Lx2/a$d;

    .line 9
    instance-of v2, v1, Lx2/a$d$b;

    if-eqz v2, :cond_3

    .line 10
    check-cast v1, Lx2/a$d$b;

    .line 11
    invoke-interface {v1}, Lx2/a$d$b;->w()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-nez v1, :cond_2

    .line 12
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    goto :goto_1

    .line 13
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->E()Ljava/util/Set;

    move-result-object v1

    goto :goto_1

    .line 14
    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    .line 15
    :goto_1
    invoke-virtual {v0, v1}, Lz2/b$a;->c(Ljava/util/Collection;)Lz2/b$a;

    iget-object v1, p0, Lx2/e;->a:Landroid/content/Context;

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz2/b$a;->e(Ljava/lang/String;)Lz2/b$a;

    iget-object v1, p0, Lx2/e;->a:Landroid/content/Context;

    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz2/b$a;->b(Ljava/lang/String;)Lz2/b$a;

    return-object v0
.end method

.method public l(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lx2/a$b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/d<",
            "TA;TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lx2/e;->x(ILcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public m(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx2/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/b<",
            "+",
            "Lx2/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lx2/e;->w(ILcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    return-object p1
.end method

.method public n(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lx2/a$b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/d<",
            "TA;TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lx2/e;->x(ILcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public o(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx2/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/b<",
            "+",
            "Lx2/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lx2/e;->w(ILcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    return-object p1
.end method

.method public p(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lx2/a$b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/d<",
            "TA;TTResult;>;)",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lx2/e;->x(ILcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public q()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lx2/e;->a:Landroid/content/Context;

    return-object v0
.end method

.method protected r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx2/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public s()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lx2/e;->f:Landroid/os/Looper;

    return-object v0
.end method

.method public final t()I
    .locals 1

    iget v0, p0, Lx2/e;->g:I

    return v0
.end method

.method public final u(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/o;)Lx2/a$f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/api/internal/o<",
            "TO;>;)",
            "Lx2/a$f;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lx2/e;->k()Lz2/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lz2/b$a;->a()Lz2/b;

    move-result-object v4

    iget-object v0, p0, Lx2/e;->c:Lx2/a;

    .line 2
    invoke-virtual {v0}, Lx2/a;->a()Lx2/a$a;

    move-result-object v0

    invoke-static {v0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lx2/a$a;

    iget-object v2, p0, Lx2/e;->a:Landroid/content/Context;

    iget-object v5, p0, Lx2/e;->d:Lx2/a$d;

    move-object v3, p1

    move-object v6, p2

    move-object v7, p2

    .line 3
    invoke-virtual/range {v1 .. v7}, Lx2/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Ljava/lang/Object;Lx2/f$a;Lx2/f$b;)Lx2/a$f;

    move-result-object p1

    .line 4
    invoke-virtual {p0}, Lx2/e;->r()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 5
    instance-of v0, p1, Lcom/google/android/gms/common/internal/b;

    if-eqz v0, :cond_0

    .line 6
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/common/internal/b;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/b;->P(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 7
    instance-of v0, p1, Ly2/i;

    if-eqz v0, :cond_1

    .line 8
    move-object v0, p1

    check-cast v0, Ly2/i;

    invoke-virtual {v0, p2}, Ly2/i;->r(Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final v(Landroid/content/Context;Landroid/os/Handler;)Ly2/d0;
    .locals 2

    new-instance v0, Ly2/d0;

    invoke-virtual {p0}, Lx2/e;->k()Lz2/b$a;

    move-result-object v1

    invoke-virtual {v1}, Lz2/b$a;->a()Lz2/b;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Ly2/d0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lz2/b;)V

    return-object v0
.end method
