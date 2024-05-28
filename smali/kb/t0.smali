.class final Lkb/t0;
.super Lkb/x0;
.source "SourceFile"


# static fields
.field private static final s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _invoked:I

.field private final r:Ldb/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldb/l<",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lkb/t0;

    const-string v1, "_invoked"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lkb/t0;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ldb/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldb/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lta/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lkb/x0;-><init>()V

    .line 2
    iput-object p1, p0, Lkb/t0;->r:Ldb/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkb/t0;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lta/l;->a:Lta/l;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 3

    sget-object v0, Lkb/t0;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkb/t0;->r:Ldb/l;

    invoke-interface {v0, p1}, Ldb/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
