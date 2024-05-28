.class final Lmb/e0$c;
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
        "Lmb/i0;",
        "Lva/e$a;",
        "Lmb/i0;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Lmb/e0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb/e0$c;

    invoke-direct {v0}, Lmb/e0$c;-><init>()V

    sput-object v0, Lmb/e0$c;->n:Lmb/e0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmb/i0;Lva/e$a;)Lmb/i0;
    .locals 1

    .line 1
    instance-of v0, p2, Lkb/i1;

    if-eqz v0, :cond_0

    .line 2
    check-cast p2, Lkb/i1;

    iget-object v0, p1, Lmb/i0;->a:Lva/e;

    invoke-interface {p2, v0}, Lkb/i1;->z(Lva/e;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lmb/i0;->a(Lkb/i1;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmb/i0;

    check-cast p2, Lva/e$a;

    invoke-virtual {p0, p1, p2}, Lmb/e0$c;->a(Lmb/i0;Lva/e$a;)Lmb/i0;

    move-result-object p1

    return-object p1
.end method
