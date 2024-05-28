.class public abstract Lmb/o$a;
.super Lmb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lmb/b<",
        "Lmb/o;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lmb/o;

.field public c:Lmb/o;


# direct methods
.method public constructor <init>(Lmb/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmb/b;-><init>()V

    .line 2
    iput-object p1, p0, Lmb/o$a;->b:Lmb/o;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lmb/o;

    invoke-virtual {p0, p1, p2}, Lmb/o$a;->e(Lmb/o;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lmb/o;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 1
    iget-object v0, p0, Lmb/o$a;->b:Lmb/o;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lmb/o$a;->c:Lmb/o;

    :goto_1
    if-eqz v0, :cond_2

    .line 2
    invoke-static {}, Lmb/o;->f()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p1, p0, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    .line 3
    iget-object p1, p0, Lmb/o$a;->b:Lmb/o;

    iget-object p2, p0, Lmb/o$a;->c:Lmb/o;

    invoke-static {p2}, Lkotlin/jvm/internal/i;->c(Ljava/lang/Object;)V

    invoke-static {p1, p2}, Lmb/o;->a(Lmb/o;Lmb/o;)V

    :cond_2
    return-void
.end method
