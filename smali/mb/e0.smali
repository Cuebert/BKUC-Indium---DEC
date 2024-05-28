.class public final Lmb/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lmb/a0;

.field private static final b:Ldb/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldb/p<",
            "Ljava/lang/Object;",
            "Lva/e$a;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ldb/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldb/p<",
            "Lkb/i1<",
            "*>;",
            "Lva/e$a;",
            "Lkb/i1<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final d:Ldb/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldb/p<",
            "Lmb/i0;",
            "Lva/e$a;",
            "Lmb/i0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmb/a0;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lmb/e0;->a:Lmb/a0;

    .line 2
    sget-object v0, Lmb/e0$a;->n:Lmb/e0$a;

    sput-object v0, Lmb/e0;->b:Ldb/p;

    .line 3
    sget-object v0, Lmb/e0$b;->n:Lmb/e0$b;

    sput-object v0, Lmb/e0;->c:Ldb/p;

    .line 4
    sget-object v0, Lmb/e0$c;->n:Lmb/e0$c;

    sput-object v0, Lmb/e0;->d:Ldb/p;

    return-void
.end method

.method public static final a(Lva/e;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, Lmb/e0;->a:Lmb/a0;

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    instance-of v0, p1, Lmb/i0;

    if-eqz v0, :cond_1

    .line 3
    check-cast p1, Lmb/i0;

    invoke-virtual {p1, p0}, Lmb/i0;->b(Lva/e;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 4
    sget-object v1, Lmb/e0;->c:Ldb/p;

    invoke-interface {p0, v0, v1}, Lva/e;->b(Ljava/lang/Object;Ldb/p;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lkb/i1;

    .line 5
    invoke-interface {v0, p0, p1}, Lkb/i1;->e0(Lva/e;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final b(Lva/e;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lmb/e0;->b:Ldb/p;

    invoke-interface {p0, v0, v1}, Lva/e;->b(Ljava/lang/Object;Ldb/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/i;->c(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c(Lva/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    invoke-static {p0}, Lmb/e0;->b(Lva/e;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lmb/e0;->a:Lmb/a0;

    goto :goto_0

    .line 3
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 4
    new-instance v0, Lmb/i0;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lmb/i0;-><init>(Lva/e;I)V

    sget-object p1, Lmb/e0;->d:Ldb/p;

    invoke-interface {p0, v0, p1}, Lva/e;->b(Ljava/lang/Object;Ldb/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkb/i1;

    .line 6
    invoke-interface {p1, p0}, Lkb/i1;->z(Lva/e;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
