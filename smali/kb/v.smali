.class public abstract Lkb/v;
.super Lva/a;
.source "SourceFile"

# interfaces
.implements Lva/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/v$a;
    }
.end annotation


# static fields
.field public static final o:Lkb/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/v$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lkb/v;->o:Lkb/v$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lva/d;->l:Lva/d$b;

    invoke-direct {p0, v0}, Lva/a;-><init>(Lva/e$b;)V

    return-void
.end method


# virtual methods
.method public final Q(Lva/c;)Lva/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lva/c<",
            "-TT;>;)",
            "Lva/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lmb/g;

    invoke-direct {v0, p0, p1}, Lmb/g;-><init>(Lkb/v;Lva/c;)V

    return-object v0
.end method

.method public final W(Lva/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva/c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 1
    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lmb/g;

    .line 2
    invoke-virtual {p1}, Lmb/g;->n()V

    return-void
.end method

.method public i(Lva/e$b;)Lva/e$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lva/e$a;",
            ">(",
            "Lva/e$b<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lva/d$a;->a(Lva/d;Lva/e$b;)Lva/e$a;

    move-result-object p1

    return-object p1
.end method

.method public abstract j0(Lva/e;Ljava/lang/Runnable;)V
.end method

.method public k0(Lva/e;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public l0(I)Lkb/v;
    .locals 1

    .line 1
    invoke-static {p1}, Lmb/l;->a(I)V

    .line 2
    new-instance v0, Lmb/k;

    invoke-direct {v0, p0, p1}, Lmb/k;-><init>(Lkb/v;I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lkb/z;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkb/z;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
