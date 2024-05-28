.class abstract Lcom/google/common/util/concurrent/f;
.super Lcom/google/common/util/concurrent/a$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/util/concurrent/f$d;,
        Lcom/google/common/util/concurrent/f$c;,
        Lcom/google/common/util/concurrent/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<OutputT:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/util/concurrent/a$j<",
        "TOutputT;>;"
    }
.end annotation


# static fields
.field private static final w:Lcom/google/common/util/concurrent/f$b;

.field private static final x:Ljava/util/logging/Logger;


# instance fields
.field private volatile u:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private volatile v:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-class v0, Lcom/google/common/util/concurrent/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/common/util/concurrent/f;->x:Ljava/util/logging/Logger;

    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lcom/google/common/util/concurrent/f$c;

    const-class v2, Lcom/google/common/util/concurrent/f;

    const-class v3, Ljava/util/Set;

    const-string v4, "u"

    .line 3
    invoke-static {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    const-class v3, Lcom/google/common/util/concurrent/f;

    const-string v4, "v"

    .line 4
    invoke-static {v3, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/common/util/concurrent/f$c;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 5
    new-instance v2, Lcom/google/common/util/concurrent/f$d;

    invoke-direct {v2, v0}, Lcom/google/common/util/concurrent/f$d;-><init>(Lcom/google/common/util/concurrent/f$a;)V

    move-object v0, v1

    move-object v1, v2

    .line 6
    :goto_0
    sput-object v1, Lcom/google/common/util/concurrent/f;->w:Lcom/google/common/util/concurrent/f$b;

    if-eqz v0, :cond_0

    .line 7
    sget-object v1, Lcom/google/common/util/concurrent/f;->x:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "SafeAtomicHelper is broken!"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/common/util/concurrent/a$j;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/common/util/concurrent/f;->u:Ljava/util/Set;

    .line 3
    iput p1, p0, Lcom/google/common/util/concurrent/f;->v:I

    return-void
.end method

.method static synthetic E(Lcom/google/common/util/concurrent/f;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/google/common/util/concurrent/f;->u:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic F(Lcom/google/common/util/concurrent/f;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    iput-object p1, p0, Lcom/google/common/util/concurrent/f;->u:Ljava/util/Set;

    return-object p1
.end method

.method static synthetic G(Lcom/google/common/util/concurrent/f;)I
    .locals 1

    iget v0, p0, Lcom/google/common/util/concurrent/f;->v:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/common/util/concurrent/f;->v:I

    return v0
.end method


# virtual methods
.method abstract H(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation
.end method

.method final I()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/util/concurrent/f;->u:Ljava/util/Set;

    return-void
.end method

.method final J()I
    .locals 1

    sget-object v0, Lcom/google/common/util/concurrent/f;->w:Lcom/google/common/util/concurrent/f$b;

    invoke-virtual {v0, p0}, Lcom/google/common/util/concurrent/f$b;->b(Lcom/google/common/util/concurrent/f;)I

    move-result v0

    return v0
.end method

.method final K()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/f;->u:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lf5/i;->a()Ljava/util/Set;

    move-result-object v0

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/common/util/concurrent/f;->H(Ljava/util/Set;)V

    .line 4
    sget-object v1, Lcom/google/common/util/concurrent/f;->w:Lcom/google/common/util/concurrent/f$b;

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2, v0}, Lcom/google/common/util/concurrent/f$b;->a(Lcom/google/common/util/concurrent/f;Ljava/util/Set;Ljava/util/Set;)V

    .line 5
    iget-object v0, p0, Lcom/google/common/util/concurrent/f;->u:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    :cond_0
    return-object v0
.end method
