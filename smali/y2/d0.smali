.class public final Ly2/d0;
.super Le4/a;
.source "SourceFile"

# interfaces
.implements Lx2/f$a;
.implements Lx2/f$b;


# static fields
.field private static final j:Lx2/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$a<",
            "+",
            "Ld4/f;",
            "Ld4/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Landroid/os/Handler;

.field private final e:Lx2/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$a<",
            "+",
            "Ld4/f;",
            "Ld4/a;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lz2/b;

.field private h:Ld4/f;

.field private i:Ly2/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ld4/e;->c:Lx2/a$a;

    sput-object v0, Ly2/d0;->j:Lx2/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lz2/b;)V
    .locals 1

    .line 1
    sget-object v0, Ly2/d0;->j:Lx2/a$a;

    invoke-direct {p0}, Le4/a;-><init>()V

    iput-object p1, p0, Ly2/d0;->c:Landroid/content/Context;

    iput-object p2, p0, Ly2/d0;->d:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    .line 2
    invoke-static {p3, p1}, Lz2/j;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/b;

    iput-object p1, p0, Ly2/d0;->g:Lz2/b;

    invoke-virtual {p3}, Lz2/b;->g()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ly2/d0;->f:Ljava/util/Set;

    iput-object v0, p0, Ly2/d0;->e:Lx2/a$a;

    return-void
.end method

.method static bridge synthetic K0(Ly2/d0;)Ly2/c0;
    .locals 0

    iget-object p0, p0, Ly2/d0;->i:Ly2/c0;

    return-object p0
.end method

.method static bridge synthetic L0(Ly2/d0;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/signin/internal/zak;->x()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->B()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/signin/internal/zak;->y()Lcom/google/android/gms/common/internal/zav;

    move-result-object p1

    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/internal/zav;

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/zav;->x()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->B()Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "SignInCoordinator"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object p1, p0, Ly2/d0;->i:Ly2/c0;

    .line 7
    invoke-interface {p1, v0}, Ly2/c0;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object p0, p0, Ly2/d0;->h:Ld4/f;

    .line 8
    invoke-interface {p0}, Lx2/a$f;->n()V

    return-void

    :cond_0
    iget-object v0, p0, Ly2/d0;->i:Ly2/c0;

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/zav;->y()Lcom/google/android/gms/common/internal/e;

    move-result-object p1

    iget-object v1, p0, Ly2/d0;->f:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Ly2/c0;->b(Lcom/google/android/gms/common/internal/e;Ljava/util/Set;)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Ly2/d0;->i:Ly2/c0;

    .line 11
    invoke-interface {p1, v0}, Ly2/c0;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 12
    :goto_0
    iget-object p0, p0, Ly2/d0;->h:Ld4/f;

    .line 13
    invoke-interface {p0}, Lx2/a$f;->n()V

    return-void
.end method


# virtual methods
.method public final M0(Ly2/c0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ly2/d0;->h:Ld4/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx2/a$f;->n()V

    :cond_0
    iget-object v0, p0, Ly2/d0;->g:Lz2/b;

    .line 2
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz2/b;->k(Ljava/lang/Integer;)V

    iget-object v2, p0, Ly2/d0;->e:Lx2/a$a;

    iget-object v3, p0, Ly2/d0;->c:Landroid/content/Context;

    iget-object v0, p0, Ly2/d0;->d:Landroid/os/Handler;

    .line 3
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Ly2/d0;->g:Lz2/b;

    .line 4
    invoke-virtual {v5}, Lz2/b;->h()Ld4/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    .line 5
    invoke-virtual/range {v2 .. v8}, Lx2/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Ljava/lang/Object;Lx2/f$a;Lx2/f$b;)Lx2/a$f;

    move-result-object v0

    iput-object v0, p0, Ly2/d0;->h:Ld4/f;

    iput-object p1, p0, Ly2/d0;->i:Ly2/c0;

    iget-object p1, p0, Ly2/d0;->f:Ljava/util/Set;

    if-eqz p1, :cond_2

    .line 6
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Ly2/d0;->h:Ld4/f;

    .line 8
    invoke-interface {p1}, Ld4/f;->p()V

    return-void

    .line 9
    :cond_2
    :goto_0
    iget-object p1, p0, Ly2/d0;->d:Landroid/os/Handler;

    new-instance v0, Ly2/a0;

    invoke-direct {v0, p0}, Ly2/a0;-><init>(Ly2/d0;)V

    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final N0()V
    .locals 1

    iget-object v0, p0, Ly2/d0;->h:Ld4/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx2/a$f;->n()V

    :cond_0
    return-void
.end method

.method public final R(Lcom/google/android/gms/signin/internal/zak;)V
    .locals 2

    iget-object v0, p0, Ly2/d0;->d:Landroid/os/Handler;

    new-instance v1, Ly2/b0;

    invoke-direct {v1, p0, p1}, Ly2/b0;-><init>(Ly2/d0;Lcom/google/android/gms/signin/internal/zak;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final i(I)V
    .locals 0

    iget-object p1, p0, Ly2/d0;->h:Ld4/f;

    invoke-interface {p1}, Lx2/a$f;->n()V

    return-void
.end method

.method public final l(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Ly2/d0;->i:Ly2/c0;

    invoke-interface {v0, p1}, Ly2/c0;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final n(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Ly2/d0;->h:Ld4/f;

    invoke-interface {p1, p0}, Ld4/f;->c(Le4/c;)V

    return-void
.end method
