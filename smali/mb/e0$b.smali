.class final Lmb/e0$b;
.super Lkotlin/jvm/internal/j;
.source "SourceFile"

# interfaces
.implements Ldb/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Ldb/p<",
        "Lkb/i1<",
        "*>;",
        "Lva/e$a;",
        "Lkb/i1<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final n:Lmb/e0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb/e0$b;

    invoke-direct {v0}, Lmb/e0$b;-><init>()V

    sput-object v0, Lmb/e0$b;->n:Lmb/e0$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkb/i1;Lva/e$a;)Lkb/i1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb/i1<",
            "*>;",
            "Lva/e$a;",
            ")",
            "Lkb/i1<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, p2, Lkb/i1;

    if-eqz p1, :cond_1

    check-cast p2, Lkb/i1;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkb/i1;

    check-cast p2, Lva/e$a;

    invoke-virtual {p0, p1, p2}, Lmb/e0$b;->a(Lkb/i1;Lva/e$a;)Lkb/i1;

    move-result-object p1

    return-object p1
.end method
